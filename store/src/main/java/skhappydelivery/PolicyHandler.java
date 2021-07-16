package skhappydelivery;

import java.util.Optional;

import skhappydelivery.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{
    @Autowired StoreRepository storeRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverPayed_OrderCheck(@Payload Payed payed){

        if(!payed.validate()) return;

        System.out.println("\n\n##### listener OrderCheck : " + payed.toJson() + "\n\n");

        //ORDER 받아서 저장 
        Store storeObj = new Store();

        storeObj.setOrderId(payed.getOrderId());

        if(payed.getCardNumber() == null){
            System.out.println( " payed.getCardNumber()  null");

            storeObj.setStoreId(payed.getStoreId());
        }else{
            System.out.println( " payed.getCardNumber() not null");
            storeObj.setTotalPrice(payed.getTotalPrice());

            try {

                Optional<Store> tempObj =  storeRepository.findById(payed.getOrderId());

                if(tempObj.isPresent()){
                   storeObj = tempObj.get();		
                }else{
                 
                    System.out.println( "no STORE data");
                }
               
                storeObj.setOrderStatus("ORDER PAYED"); 
 
                storeRepository.save(storeObj);
                System.out.println(" STOREList data all :  " + storeRepository.findAll().toString());
        
                System.out.println( "STROE STATUS CHANGE( >> PAYED )SUCCESS");
                
            } catch (Exception e) {
                System.out.println("STROE STATUS CHANGE Error" +e.getStackTrace());

            }

        }//else

        System.out.println("\n\n##### listener storeObj.getOrderId()storeObj.getOrderId()storeObj.getOrderId() : " + storeObj.getOrderId() + "\n\n");

        storeRepository.save(storeObj);
            
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverPayCancelled_StoreOrderCacelledCheck(@Payload PayCancelled payCancelled){

        if(!payCancelled.validate()) return;

        System.out.println("\n\n##### listener StoreOrderCacelledCheck : " + payCancelled.toJson() + "\n\n");

        // Sample Logic //
        Store storeObj = new Store();

        Optional<Store> tempObj =  storeRepository.findById(payCancelled.getOrderId());

        if(tempObj.isPresent()){
           storeObj = tempObj.get();		
        }else{
         
            System.out.println( "no STORE data");
        } 

        storeObj.setOrderStatus("PAY CANCELLED");
        System.out.println( "storeObjstoreObj " + storeObj.toString());
        storeRepository.save(storeObj);
            
    }


    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}


}

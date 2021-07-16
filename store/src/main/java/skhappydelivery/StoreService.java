package skhappydelivery;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
 public class StoreService {     

    @Autowired StoreRepository storeRepository;
	 
	 
   	/*----  POST---- 주문승인   */
	   @Transactional
	   public String StoreOrderAcceptedService(StoreOrderAccepted storeOrderAcceptedObj) throws Exception {
   
		   System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□ StoreOrderAcceptedService start "+System.currentTimeMillis()+"□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
   
		   try {

			   Optional<Store> tempObj =  storeRepository.findById(storeOrderAcceptedObj.getOrderId());
			   System.out.println(" OUTput tempObj :  " + tempObj.toString());

			   Store storeObj = new Store();
   
			   if(tempObj.isPresent()){
				  storeObj = tempObj.get();		
			   }else{
				   return "no STORE data" ;
			   }
			  
			   storeObj.setOrderStatus("ORDER ACCEPT"); 
			   System.out.println(" INput storeObj :  " + storeObj.toString());
			 
			   storeRepository.save(storeObj);

			   //System.out.println(" OrderList data all :  " + orderRepository.findAll().toString());
	   
			   return "ORDERACCEPT SUCCESS";
			   
		   } catch (Exception e) {
			   return "save ORDERACCEPT Error" +e.getStackTrace();
		   }
	   }//StoreOrderAcceptedService


	   @Transactional
	   public Iterable<Store> storeListService() throws Exception {
   
		   System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□ storeListService start "+System.currentTimeMillis()+"□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
   
		   try {
   
			   return storeRepository.findAll();
			   
		   } catch (Exception e) {
   
			   System.out.println("storeList Error" +e.getStackTrace());
   
			   return null;
		   }
	   }//orderListService
   
   


	   @Transactional
	   public String StoreOrderRejectedService(StoreOrderRejected storeOrderRejectedObj) throws Exception {
   
		   System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□ StoreOrderRejectedService start "+System.currentTimeMillis()+"□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
   
		   try {
			   Optional<Store> tempObj =  storeRepository.findById(storeOrderRejectedObj.getOrderId());
   
			   Store storeObj = new Store();
   
			   if(tempObj.isPresent()){
				storeObj = tempObj.get();		
			   }else{
				   return "no Order data" ;
			   }
   
			   storeObj.setOrderStatus("ORDER REJECT");
			   storeObj.setRejectCode(storeOrderRejectedObj.getRejectCode());
			   storeObj.setRejectDetail(storeOrderRejectedObj.getRejectDetail());
			   storeRepository.save(storeObj);
	   
			   System.out.println(" storeRepository data all :  " + storeRepository.findAll().toString());
	   
			   return "reject success";
			   
		   } catch (Exception e) {
			   return "save CANCELLED Error" +e.getStackTrace();
		   }
	   }//orderCanceledService



	   @Transactional
	   public String StoreCookedService(StoreCooked storeCookedObj) throws Exception {
   
		   System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□ StoreCookedService start "+System.currentTimeMillis()+"□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
   
		   try {
			   Optional<Store> tempObj =  storeRepository.findById(storeCookedObj.getOrderId());
   
			   Store storeObj = new Store();
   
			   if(tempObj.isPresent()){
				storeObj = tempObj.get();		
			   }else{
				   return "no Order data" ;
			   }

			   storeObj.setOrderStatus(storeCookedObj.getCookStatus()); 
			   storeRepository.save(storeObj);
	   
			   System.out.println(" storeRepository data all :  " + storeRepository.findAll().toString());
	   
			   return "STORECOOKED STATUS CHANGE SUCCESS";
			   
		   } catch (Exception e) {
			   return "save CANCELLED Error" +e.getStackTrace();
		   }
	   }//orderCanceledService


 }//classPayService\

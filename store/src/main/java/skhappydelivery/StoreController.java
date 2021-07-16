package skhappydelivery;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

 @RestController
 public class StoreController {

	@Autowired
    private StoreService storeService;

    	   	/*----  POST-----결재함*/
	@RequestMapping(value="/storeOrderAccepted", method=RequestMethod.POST)
	public String StoreOrderAccepted(@RequestBody StoreOrderAccepted storeOrderAcceptedObj) throws Exception {
		
		System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□o StoreOrderAccepted Controller start "+System.currentTimeMillis()+"□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
		System.out. println(" INput storeOrderAcceptedObj :  " + storeOrderAcceptedObj.toString());

    return storeService.StoreOrderAcceptedService(storeOrderAcceptedObj);

	} //Payed

	   	/*----  GET-----PAYED 목록 요청 */
	@GetMapping("/storeList")
	public Iterable<Store> storeList() throws Exception { 
	   
		System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□ storeList start "+System.currentTimeMillis()+"□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
			   
		return  storeService.storeListService();       
	}//payList

		   	/*----  POST-----주문 거절*/
	@RequestMapping(value="/storeOrderRejected", method=RequestMethod.POST)
	public String StoreOrderRejected(@RequestBody StoreOrderRejected storeOrderRejectedObj) throws Exception {
		
		System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□ StoreOrderRejected start "+System.currentTimeMillis()+"□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
		System.out.println(" INput storeOrderRejectedObj :  " + storeOrderRejectedObj.toString());
		
		return storeService.StoreOrderRejectedService(storeOrderRejectedObj);
	} 
        

    	   	/*----  POST-----결재함*/
	@RequestMapping(value="/storeCooked", method=RequestMethod.POST)
	public String StoreCooked(@RequestBody StoreCooked storeCookedObj) throws Exception {
				   
		System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□o StoreCooked Controller start "+System.currentTimeMillis()+"□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
		System.out. println(" INput storeCookedObj :  " + storeCookedObj.toString());
		   
		return storeService.StoreCookedService(storeCookedObj);
		   
	} //Payed

	








 }//ClassStoreController

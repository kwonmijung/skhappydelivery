package skhappydelivery;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
 public class OrderService{     

	@Autowired
     OrderRepository orderRepository;
	 
	 @Transactional
	public String orderPlacedService(OrderPlaced orderPlacedObj) throws Exception {

		System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□ orderPlacedService start "+System.currentTimeMillis()+"□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");

		try {
			Order orderObj = new Order();
		//	orderObj.setOrderId(orderPlacedObj.getOrderId());
			orderObj.setStoreId(orderPlacedObj.getStoreId());
			orderObj.setMenuId(orderPlacedObj.getMenuId());
			orderObj.setMenuCount(orderPlacedObj.getMenuCount());	
			orderObj.setMenuPrice(orderPlacedObj.getMenuPrice());	
			orderObj.setCustomerAddress(orderPlacedObj.getCustomerAddress());
			orderObj.setPhoneNumber(orderPlacedObj.getPhoneNumber());
			orderObj.setCustomerName(orderPlacedObj.getCustomerName());
			orderObj.setCustomerId(orderPlacedObj.getCustomerId());
			orderObj.setOrderStatus("orderPlaced");
			System.out.println(" INput orderObj :  " + orderObj.toString());
			orderRepository.save(orderObj);
	
			System.out.println(" OrderList data all :  " + orderRepository.findAll().toString());
	
			return "order success";
			
		} catch (Exception e) {
			return "save Order Error" +e.getStackTrace() +e.getMessage();
		}
	}//orderPlacedService


	@Transactional
	public String orderCanceledService(OrderCanceled orderCanceledObj) throws Exception {

		System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□ orderPlacedService start "+System.currentTimeMillis()+"□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");

		try {
			Optional<Order> tempObj =  orderRepository.findById(orderCanceledObj.getOrderId());

			Order orderObj = new Order();

			if(tempObj.isPresent()){
				orderObj = tempObj.get();		
			}else{
				return "no Order data" ;
			}

			orderObj.setOrderStatus("orderCanceled");

			orderRepository.save(orderObj);
	
			System.out.println(" OrderList data all :  " + orderRepository.findAll().toString());
	
			return "order success";
			
		} catch (Exception e) {
			return "save CANCELLED Error" +e.getStackTrace();
		}
	}//orderCanceledService


	@Transactional
	public Iterable<Order> orderListService() throws Exception {

		System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□ orderListService start "+System.currentTimeMillis()+"□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");

		try {
			System.out.println("□□□orderRepository.findAll()orderRepository.findAll()□□□" + orderRepository.findAll());

			return orderRepository.findAll();
			
		} catch (Exception e) {

			System.out.println("OrderList Error" +e.getStackTrace());

			return null;
		}
	}//orderListService

	@Transactional
	public Order getOrderService(StoreOrderAccepted storeOrderAcceptedObj) throws Exception {

		System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□ getOrderService start "+System.currentTimeMillis()+"□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");


		try {
			Optional<Order> tempObj =  orderRepository.findById(storeOrderAcceptedObj.getOrderId());

			Order orderObj = new Order();

			if(tempObj.isPresent()){
				orderObj = tempObj.get();

				orderObj.setOrderStatus(storeOrderAcceptedObj.getOrderStatus());

				orderRepository.save(orderObj);
	
				return orderObj;		
			}else{
				return null ;
			}

		} catch (Exception e) {
			System.out.println("save Order Error" +e.getStackTrace());

			return null;
		}
	}

 }//classOrderPlacedService

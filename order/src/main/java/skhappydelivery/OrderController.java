package skhappydelivery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

 @RestController
 public class OrderController {

        @Autowired
        private OrderService orderService;

        @GetMapping("/orderList")
        public Iterable<Order> orderListController() throws Exception { 
            
            System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□ orderListController start "+System.currentTimeMillis()+"□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
            System.out.println("hello world");
            
            return  orderService.orderListService();       
        }//orderCheck

        @RequestMapping(value="/order", method=RequestMethod.POST)
        public Order getOrderController(@RequestBody StoreOrderAccepted storeOrderAcceptedObj) throws Exception { 
            
            System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□ getOrderController start "+System.currentTimeMillis()+"□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
            
            return  orderService.getOrderService(storeOrderAcceptedObj);       
        }//getOrderController


     	/*----  POST-----order 주문 들어옴 */
		@RequestMapping(value="/orderPlaced", method=RequestMethod.POST)
		public String OrderPlaced(@RequestBody OrderPlaced orderPlacedObj) throws Exception {
			
			System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□orderPlacedController start "+System.currentTimeMillis()+"□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
			System.out.println(" INput orderPlacedObj :  " + orderPlacedObj.toString());
	
		return orderService.orderPlacedService(orderPlacedObj);
	
		} //OrderPlaced
	
        
	@RequestMapping(value="/ordercanceled", method=RequestMethod.POST)
	public String orderCanceled(@RequestBody OrderCanceled orderCanceledObj) throws Exception {
		
		System.out.println("□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□orderPlacedController start "+System.currentTimeMillis()+"□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□□");
		System.out.println(" INput orderCanceledObj :  " + orderCanceledObj.toString());
		
		return orderService.orderCanceledService(orderCanceledObj);
	} 
        





 }

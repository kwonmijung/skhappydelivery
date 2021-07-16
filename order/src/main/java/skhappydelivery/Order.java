package skhappydelivery;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PostPersist;
import javax.persistence.PostUpdate;
import javax.persistence.Table;

import org.springframework.beans.BeanUtils;

@Entity
@Table(name="Order_table")
public class Order {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long orderId;
    private Long customerId;
    private String customerName;
    private String customerAddress;
    private Integer phoneNumber;
    private Long menuId;
    private Integer menuCount;
    private Integer menuPrice;
    private Long storeId;
    private String orderStatus;  

    
    @PostPersist
    public void onPostPersist(){

        skhappydelivery.external.Payed Payed = new skhappydelivery.external.Payed();
        // mappings goes here

        Payed.setCustomerId(this.customerId);
        Payed.setOrderId(this.orderId);
        Payed.setStoreId(this.storeId);
        Payed.setTotalPrice(this.menuCount * this.menuPrice);
		System.out.println("onPostPersist PUBLISH Payed:  " +Payed.toString());

        OrderApplication.applicationContext.getBean(skhappydelivery.external.PayService.class)
            .payed(Payed);
    }


    @PostUpdate
    public void onPostUpdate(){
        OrderCanceled orderCanceled = new OrderCanceled();


		        //Reject >>> publish
				if(this.orderStatus=="orderCanceled"){

					BeanUtils.copyProperties(this, orderCanceled);

					orderCanceled.setOrderStatus(this.orderStatus);
			
					System.out.println(" PUBLISH orderCanceledOBJ:  " +orderCanceled.toString());
			
					orderCanceled.publishAfterCommit();
	
				}

    }



	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return this.customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public Integer getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Long getMenuId() {
		return this.menuId;
	}

	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}

	public Integer getMenuCount() {
		return this.menuCount;
	}

	public void setMenuCount(Integer menuCount) {
		this.menuCount = menuCount;
	}

	public Integer getMenuPrice() {
		return this.menuPrice;
	}

	public void setMenuPrice(Integer menuPrice) {
		this.menuPrice = menuPrice;
	}

	public Long getStoreId() {
		return this.storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

    


	@Override
	public String toString() {
		return "OrderObj [orderId=" + orderId + ", customerId=" + customerId + ", customerName=" + customerName
				+ ", customerAddress=" + customerAddress + ", phoneNumber=" + phoneNumber + ", menuId=" + menuId
				+ ", menuCount=" + menuCount + ", menuPrice=" + menuPrice + ", storeId=" + storeId + ", orderStatus="
				+ orderStatus + "]";
	}

}

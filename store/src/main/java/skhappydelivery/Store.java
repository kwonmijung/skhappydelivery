package skhappydelivery;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PostUpdate ;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.springframework.beans.BeanUtils;



@Entity
@Table(name="Store_table")
public class Store {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long orderId;
    private Long storeId;
    
    private String storeName;
    private String storeAddress;
    private Long menuId;
    private String customerAddress;
    private int menuCount;
    private int totalPrice;
    private String customerName;
    private int rejectCode;
    private String rejectDetail;
    private String cookStatus;
    private int cancelCode;
    private Long cancelDetail;
    private String orderStatus;



    @PreUpdate
    public void onPreUpdate(){
        StoreOrderAccepted storeOrderAccepted = new StoreOrderAccepted();
      
  
            storeOrderAccepted.setOrderId(this.orderId);
            storeOrderAccepted.setOrderStatus(this.orderStatus);
    
            skhappydelivery.external.Order order = new skhappydelivery.external.Order();
    
    
            order = StoreApplication.applicationContext.getBean(skhappydelivery.external.OrderService.class)
            .getOrder(storeOrderAccepted);
            
            System.out.println("RES RES order:  " +order.toString());
            this.menuId = order.getMenuId();
            this.customerName = order.getCustomerName();
            this.customerAddress = order.getCustomerAddress();
            this.menuCount = order.getMenuCount();

    }



/*
    @PostUpdate
    public void onPostUpdate(){

        //Reject >>> publish
        if(this.orderStatus=="ORDER REJECT"){


            PayCancelled payCancelled = new PayCancelled();
            BeanUtils.copyProperties(this, payCancelled);

            System.out.println("ORDER REJECTORDER REJECTORDER REJECTORDER REJECT " +payCancelled.toString());

            payCancelled.setOrderId(this.orderId);
            payCancelled.publishAfterCommit();
        }
        
    }//onPostUpdate
*/

    public Long getStoreId() {
        return storeId; 
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }
    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }
    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }


    public Long getOrderId() {
        return this.orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }


    public int getMenuCount() {
        return menuCount;
    }

    public void setMenuCount(int menuCount) {
        this.menuCount = menuCount;
    }
    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public int getRejectCode() {
        return rejectCode;
    }

    public void setRejectCode(int rejectCode) {
        this.rejectCode = rejectCode;
    }
    public String getRejectDetail() {
        return rejectDetail;
    }

    public void setRejectDetail(String rejectDetail) {
        this.rejectDetail = rejectDetail;
    }
    public String getCookStatus() {
        return cookStatus;
    }

    public void setCookStatus(String cookStatus) {
        this.cookStatus = cookStatus;
    }
    public int getCancelCode() {
        return cancelCode;
    }

    public void setCancelCode(int cancelCode) {
        this.cancelCode = cancelCode;
    }
    public Long getCancelDetail() {
        return cancelDetail;
    }

    public void setCancelDetail(Long cancelDetail) {
        this.cancelDetail = cancelDetail;
    }
    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
	public String toString() {
		return "ConvertVO [storeId=" + storeId + ", storeName=" + storeName + ", storeAddress=" + storeAddress
				+ ", menuId=" + menuId + ", customerAddress=" + customerAddress + ", orderId=" + orderId
				+ ", menuCount=" + menuCount + ", totalPrice=" + totalPrice + ", customerName=" + customerName
				+ ", rejectCode=" + rejectCode + ", rejectDetail=" + rejectDetail + ", cookStatus=" + cookStatus
				+ ", cancelCode=" + cancelCode + ", cancelDetail=" + cancelDetail + ", orderStatus=" + orderStatus
				+ "]";
	}


}

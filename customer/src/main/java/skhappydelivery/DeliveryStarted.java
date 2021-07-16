
package skhappydelivery;

public class DeliveryStarted extends AbstractEvent {

    private Long OrderID;
    private Long StoreID;
    private Long CustomerID;
    private String CustomerAddress;
    private String StoreAddress;
    private Integer DeliveryFee;
    private String DeliveryStatus;

    public Long getId() {
        return OrderID;
    }

    public void setId(Long OrderID) {
        this.OrderID = OrderID;
    }
    public Long getStoreId() {
        return StoreID;
    }

    public void setStoreId(Long StoreID) {
        this.StoreID = StoreID;
    }
    public Long getCustomerId() {
        return CustomerID;
    }

    public void setCustomerId(Long CustomerID) {
        this.CustomerID = CustomerID;
    }
    public String getCustomerAddress() {
        return CustomerAddress;
    }

    public void setCustomerAddress(String CustomerAddress) {
        this.CustomerAddress = CustomerAddress;
    }
    public String getStoreAddress() {
        return StoreAddress;
    }

    public void setStoreAddress(String StoreAddress) {
        this.StoreAddress = StoreAddress;
    }
    public Integer getDeliveryFee() {
        return DeliveryFee;
    }

    public void setDeliveryFee(Integer DeliveryFee) {
        this.DeliveryFee = DeliveryFee;
    }
    public String getDeliveryStatus() {
        return DeliveryStatus;
    }

    public void setDeliveryStatus(String DeliveryStatus) {
        this.DeliveryStatus = DeliveryStatus;
    }
}


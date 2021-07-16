
package skhappydelivery;

public class StoreOrderCancelled extends AbstractEvent {

    private Long CustomerID;
    private Long OrderID;
    private Long CancelDetail;
    private String OrderStatus;

    public Long getCustomerId() {
        return CustomerID;
    }

    public void setCustomerId(Long CustomerID) {
        this.CustomerID = CustomerID;
    }
    public Long getOrderId() {
        return OrderID;
    }

    public void setOrderId(Long OrderID) {
        this.OrderID = OrderID;
    }
    public Long getCancelDetail() {
        return CancelDetail;
    }

    public void setCancelDetail(Long CancelDetail) {
        this.CancelDetail = CancelDetail;
    }
    public String getOrderStatus() {
        return OrderStatus;
    }

    public void setOrderStatus(String OrderStatus) {
        this.OrderStatus = OrderStatus;
    }
}


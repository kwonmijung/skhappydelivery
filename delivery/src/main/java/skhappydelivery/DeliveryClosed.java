
package skhappydelivery;

public class DeliveryClosed extends AbstractEvent {

    private Long OrderID;
    private String DeliveryStatus;

    public Long getOrderId() {
        return OrderID;
    }

    public void setOrderId(Long OrderID) {
        this.OrderID = OrderID;
    }
    public String getDeliveryStatus() {
        return DeliveryStatus;
    }

    public void setDeliveryStatus(String DeliveryStatus) {
        this.DeliveryStatus = DeliveryStatus;
    }
}


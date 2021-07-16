package skhappydelivery.external;

public class Pay {

    private Long customerId;
    private Long orderId;
    private Integer totalPrice;
    private Long payMethod;
    private Integer cardNumber;
    private Integer deliveryFee;

    public Long getCustomerId() {
        return customerId;
    }
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public Integer getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }
    public Long getPayMethod() {
        return payMethod;
    }
    public void setPayMethod(Long payMethod) {
        this.payMethod = payMethod;
    }
    public Integer getCardNumber() {
        return cardNumber;
    }
    public void setCardNumber(Integer cardNumber) {
        this.cardNumber = cardNumber;
    }
    public Integer getDeliveryFee() {
        return deliveryFee;
    }
    public void setDeliveryFee(Integer deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

}

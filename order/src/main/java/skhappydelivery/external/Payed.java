
package skhappydelivery.external;

public class Payed  {


    private Long orderId;
    private Integer TotalPrice;
    private Integer PayMethod;
    private String CardNumber;
    private Integer DeliveryFee;
    private Long customerId;
    private Long storeId;


	public Long getStoreId() {
		return this.storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	public Long getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

    public Long getOrderId() {
        return this.orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(int totalprice) {
        this.TotalPrice = totalprice;
    }
    public Integer getPayMethod() {
        return PayMethod;
    }

    public void setPayMethod(Integer PayMethod) {
        this.PayMethod = PayMethod;
    }

	public String getCardNumber() {
		return this.CardNumber;
	}

	public void setCardNumber(String CardNumber) {
		this.CardNumber = CardNumber;
	}

    public Integer getDeliveryFee() {
        return DeliveryFee;
    }

    public void setDeliveryFee(Integer DeliveryFee) {
        this.DeliveryFee = DeliveryFee;
    }


    @Override
	public String toString() {
		return "PayedObj [orderId=" + orderId + ", TotalPrice=" + TotalPrice + ", PayMethod=" + PayMethod
				+ ", CardNumber=" + CardNumber + ", DeliveryFee=" + DeliveryFee + "]";
	}
}//classPayed


package skhappydelivery;

public class OrderPlaced extends AbstractEvent {

    private Long orderId;
	private Long storeId;
	private Long menuId;
	private Integer menuCount;
	private Integer menuPrice;
	private String customerAddress;
	private Integer phoneNumber;
	private String customerName;
 	private Long customerId;

	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getStoreId() {
		return this.storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
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

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Long getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}



	@Override
	public String toString() {
		return "OrderPlacedObj [orderId=" + orderId + ", storeId=" + storeId + ", menuId=" + menuId + ", menuCount=" + menuCount
				+ ", menuPrice=" + menuPrice + ", customerAddress=" + customerAddress + ", phoneNumber=" + phoneNumber
				+ ", customerName=" + customerName + "]";
	}

}

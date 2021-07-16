
package skhappydelivery;

public class StoreOrderAccepted extends AbstractEvent {

    private Long OrderID;
    private Long StoreID;
    private Long MenuID;
    private Integer MenuCount;
    private String CustomerName;
    private String CustomerAddress;
    private String StoreAddress;
    private Integer TotalPrice;
    private String OrderStatus;

    public Long getOrderId() {
        return OrderID;
    }

    public void setOrderId(Long OrderID) {
        this.OrderID = OrderID;
    }
    public Long getStoreId() {
        return StoreID;
    }

    public void setStoreId(Long StoreID) {
        this.StoreID = StoreID;
    }
    public Long getMenuId() {
        return MenuID;
    }

    public void setMenuId(Long MenuID) {
        this.MenuID = MenuID;
    }
    public Integer getMenuCount() {
        return MenuCount;
    }

    public void setMenuCount(Integer MenuCount) {
        this.MenuCount = MenuCount;
    }
    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
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
    public Integer getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(Integer TotalPrice) {
        this.TotalPrice = TotalPrice;
    }
    public String getOrderStatus() {
        return OrderStatus;
    }

    public void setOrderStatus(String OrderStatus) {
        this.OrderStatus = OrderStatus;
    }

    @Override
	public String toString() {
		return "ConvertVO [OrderID=" + OrderID + ", StoreID=" + StoreID + ", MenuID=" + MenuID + ", MenuCount="
				+ MenuCount + ", CustomerName=" + CustomerName + ", CustomerAddress=" + CustomerAddress
				+ ", StoreAddress=" + StoreAddress + ", TotalPrice=" + TotalPrice + ", OrderStatus=" + OrderStatus
				+ "]";
	}

}


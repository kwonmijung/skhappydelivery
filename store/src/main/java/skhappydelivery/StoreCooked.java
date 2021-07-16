
package skhappydelivery;

public class StoreCooked extends AbstractEvent {

    private Long OrderID;
    private Long MenuID;
    private String cookStatus;
    private String orderStatus;

	public String getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}


    public Long getOrderId() {
        return OrderID;
    }

    public void setOrderId(Long OrderID) {
        this.OrderID = OrderID;
    }
    public Long getMenuId() {
        return MenuID;
    }

    public void setMenuId(Long MenuID) {
        this.MenuID = MenuID;
    }
    public String getCookStatus() {
        return cookStatus;
    }

    public void setCookStatus(String cookStatus) {
        this.cookStatus = cookStatus;
    }

    @Override
	public String toString() {
		return "Store [OrderID=" + OrderID + ", MenuID=" + MenuID + ", cookStatus=" + cookStatus +  ", orderStatus=" + orderStatus + "]";
	}


}


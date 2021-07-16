
package skhappydelivery;

public class StoreCooked extends AbstractEvent {

    private Long id;
    private Long OrderID;
    private Long MenuID;
    private String CookStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        return CookStatus;
    }

    public void setCookStatus(String CookStatus) {
        this.CookStatus = CookStatus;
    }
}


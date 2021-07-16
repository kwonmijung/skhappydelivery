package skhappydelivery;

public class StatusUpdated extends AbstractEvent {

    private Long OrderID;
    private Long StoreID;
    private Long CustomerID;
    private Long MenuID;
    private String OrderStatus;
    private Integer RejectCode;
    private String RejectDetail;
    private Integer MenuCount;
    private Integer TotalPrice;
    private String StoreName;
    private String CustomerName;

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
    public Long getMenuId() {
        return MenuID;
    }

    public void setMenuId(Long MenuID) {
        this.MenuID = MenuID;
    }
    public String getOrderStatus() {
        return OrderStatus;
    }

    public void setOrderStatus(String OrderStatus) {
        this.OrderStatus = OrderStatus;
    }
    public Integer getRejectCode() {
        return RejectCode;
    }

    public void setRejectCode(Integer RejectCode) {
        this.RejectCode = RejectCode;
    }
    public String getRejectDetail() {
        return RejectDetail;
    }

    public void setRejectDetail(String RejectDetail) {
        this.RejectDetail = RejectDetail;
    }
    public Integer getMenuCount() {
        return MenuCount;
    }

    public void setMenuCount(Integer MenuCount) {
        this.MenuCount = MenuCount;
    }
    public Integer getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(Integer TotalPrice) {
        this.TotalPrice = TotalPrice;
    }
    public String getStoreName() {
        return StoreName;
    }

    public void setStoreName(String StoreName) {
        this.StoreName = StoreName;
    }
    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }
}
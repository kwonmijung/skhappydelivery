package skhappydelivery;

public class DeliveryCanceled extends AbstractEvent {

    private Long id;
    private Long storeId;
    private Long customerId;
    private String storeAddress;
    private String customerAddress;
    private Integer rejectCode;
    private String rejectDetail;
    private String deliveryStatus;

    public DeliveryCanceled(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }
    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }
    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
    public Integer getRejectCode() {
        return rejectCode;
    }

    public void setRejectCode(Integer rejectCode) {
        this.rejectCode = rejectCode;
    }
    public String getRejectDetail() {
        return rejectDetail;
    }

    public void setRejectDetail(String rejectDetail) {
        this.rejectDetail = rejectDetail;
    }
    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }
}

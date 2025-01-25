package multilevelinheritence.ordermanagement;

//class shipped order inherits the class order
class ShippedOrder extends Order {
    String trackingNumber;
    //constructor of shipped order is created
    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    //method overridden
    @Override
    public String getOrderStatus() {
        return "Order tracking number " + this.trackingNumber;
    }
}
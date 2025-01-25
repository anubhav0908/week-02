package multilevelinheritence.ordermanagement;

//class deliveryorder inherits the class shippedorder
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;
    //constructor to initialize the variables
    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    //override the method
    @Override
    public String getOrderStatus() {
        return "Order delivered on " + this.deliveryDate;
    }
}
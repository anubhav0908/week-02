package multilevelinheritence.ordermanagement;

//base class
class Order {
    String orderId;
    String orderDate;
    //constructor to initialize the variables
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    //method
    public String getOrderStatus() {
        return "Order placed on " + this.orderDate;
    }
}





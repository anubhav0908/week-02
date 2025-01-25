package multilevelinheritence.ordermanagement;

//main class
public class OrderManagement {
    public static void main(String[] args) {
        //object of order class
        Order order = new Order("List1", "20-01-25");
        //object of shippedorder class
        ShippedOrder shippedOrder = new ShippedOrder("List2", "21-01-2025", "TN1");
        //object of deliverorder class
        DeliveredOrder deliveredOrder = new DeliveredOrder("List3", "22-01-2025", "TN2", "25-01-2025");
        System.out.println(order.getOrderStatus());
        System.out.println();

        System.out.println(shippedOrder.getOrderStatus());
        System.out.println();

        System.out.println(deliveredOrder.getOrderStatus());
    }
}
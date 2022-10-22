package OOP_Exercise_2;

public class TextEx_2_7 {
    public static void main(String[] args) {
        Customer c1 = new Customer(88, "Tan Ah Teck", 80);
        Invoice invoice = new Invoice(36,c1,30000);
        System.out.println(invoice.getID());
        System.out.println(invoice.getCustomerName());
        System.out.println(invoice.getAmount());
        System.out.println(invoice.getCustomerName());
        System.out.println(invoice.getAmoutAfterDiscount());

    }
}

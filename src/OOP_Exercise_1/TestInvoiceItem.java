package OOP_Exercise_1;

public class TestInvoiceItem {
    public static void main(String[] args) {
        InvoiceItem ivi1 = new InvoiceItem("245","Electronic",30,30.6);
        System.out.println(ivi1);
        System.out.println(ivi1.getId());
        System.out.println(ivi1.getDesc());
        System.out.println(ivi1.getQty());
        ivi1.setQty(70);
        System.out.println(ivi1.getUnitPrice());
        System.out.println(ivi1.getTotal());
    
    }
}

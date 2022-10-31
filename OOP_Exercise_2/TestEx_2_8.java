package OOP_Exercise_2;

public class TestEx_2_8 {
    public static void main(String[] args) {
        Customer c1 = new Customer(88, "Tan Ah Teck", 80);
        Account a1 = new Account(66,c1,30000);
        System.out.println(a1.getId());
        System.out.println(a1.getBalance());
        System.out.println(a1.getCustomer());
        a1.setBalance(342318.412930);
        System.out.println(a1);

        System.out.println(a1.deposit(30000));
        System.out.println(a1.withdraw(300000));
    }
}

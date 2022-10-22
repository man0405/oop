package OOP_Exercise_1;

public class TestAccount {
    public static void main(String[] args) {
        Account a1 = new Account("246","Nguyen Vo Van Man"  );
        Account a2 = new Account("247","Nguyen Van Minh",7000);

        System.out.println(a1);
        System.out.println(a2);

        System.out.println(a1.getId());
        System.out.println(a1.getName());
        System.out.println(a1.getBalance());

        a1.credit(6000);
        System.out.println(a1.getBalance());

        System.out.println(a1.debit(8000));

        a1.transferTo(3000, a2);
        System.out.println(a1);
        System.out.println(a2);


    }
}

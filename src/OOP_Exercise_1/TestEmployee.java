package OOP_Exercise_1;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee(245, "John", "John", 6000);
        System.out.println(e1);
        System.out.println(e1.getId());
        System.out.println(e1.getFirstName());
        System.out.println(e1.getLastName());
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());

        e1.setSalary(10000);
        System.out.println(e1.getSalary());
        System.out.println(e1.getAnnualSalary());
        System.out.println(e1.raiseSalary(30));

    }
}

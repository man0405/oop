package OOP_Exercise_4;

public class Test_Ex_4_2 {
    public static void main(String[] args) {
        Person p1 = new Person("Nguyen Vo Van Man", "Da Nang");
        System.out.println(p1);
        System.out.println(p1.getAddress());
        System.out.println(p1.getName());

        Student p2 = new Student("Van Man","Da Nang", "IT", 4.5,2022);
        System.out.println(p2);

        Staff p3 = new Staff("Van Man","Da Nang", "VKU",30000);
        System.out.println(p3);
    }
    
}

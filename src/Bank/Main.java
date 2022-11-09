package Bank;

public class Main {
    public static void main(String[] args) {
        View v1 = new View();
        Controller c1 = new Controller(v1);
        c1.callFirst();

    }
}
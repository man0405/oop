package Week5;

public class Main1 {
    public static void main(String[] args) {
        MyArray myarr = new MyArray(5);
        myarr.enterArrayRandom();
        myarr.displayArray();
        myarr.sortArray();
        System.out.println("Sum of myarr: " + myarr.calSum());
        myarr.enterArray();
        myarr.displayArray();
        myarr.sortArray();
        System.out.println("Sum of myarr: " + myarr.calSum());
    }
}

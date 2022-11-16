package Week5;

import java.util.ArrayList;
import java.util.Scanner;

public class arryList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome to the product Listen\n");
        
        final int CODE_WIDTH = 10;
        final int DESC_WIDTH = 34;
        final int PRICE_WIDTH = 10;

        StringBuilder list = new StringBuilder();
        list.append(StringUtil.pad("Code", CODE_WIDTH));
        list.append(StringUtil.pad("Description", DESC_WIDTH));
        list.append(StringUtil.pad("Price", PRICE_WIDTH));
        list.append("\n");

        list.append(StringUtil.pad("========", CODE_WIDTH));
        list.append(StringUtil.pad("==============================", DESC_WIDTH));
        list.append(StringUtil.pad("========", PRICE_WIDTH));
        list.append("\n");


        Product p1 = new Product("java","Maruach Java", 50.04);
        Product p2 = new Product("c++","Maruach C++", 109.31);
        Product p3 = new Product("database","Maruach Database", 200.31);
    
        ArrayList<Product> arryList = new ArrayList<Product>();
        arryList.add(p1);
        arryList.add(p2);
        arryList.add(p3);

        String choice = "y";
        while(choice.equalsIgnoreCase("y")){
            System.out.print("Enter product code: ");
            String productCode =scanner.next();
            
            for (Product a : arryList) {
                if(a.getCode().equalsIgnoreCase(productCode)){ 
                    list.append(StringUtil.pad(a.getCode(), CODE_WIDTH));
                    list.append(StringUtil.pad(a.getDescription(), DESC_WIDTH));
                    list.append(StringUtil.pad(a.getFormattedPrice(), PRICE_WIDTH));
                    list.append("\n");
                }
            }

            System.out.print("Another product ?  (y/n): ");
            choice = scanner.next();
            System.out.println();
        }
        System.out.println(list);

    }

        
}





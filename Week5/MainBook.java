package Week5;

import java.util.Scanner;

public class MainBook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to the product Listen\n");

        final int CODE_WIDTH = 10;
        final int DESC_WIDTH = 34;
        final int PRICE_WIDTH = 10;

        StringBuilder list = new StringBuilder();
        list.append(StringUtil.pad("Code", CODE_WIDTH));
        list.append(StringUtil.pad("Description", DESC_WIDTH));
        list.append(StringUtil.pad("PRICE", PRICE_WIDTH));
        list.append("\n");

        list.append(StringUtil.pad("=========", CODE_WIDTH));
        list.append(StringUtil.pad("==============================", DESC_WIDTH));
        list.append(StringUtil.pad("=========", PRICE_WIDTH));
        list.append("\n");

        String choice = "y";
        while(choice.equalsIgnoreCase("y")){
            System.out.print("Enter product code: ");
            String productCode =input.next();
            
            Product product = ProductDB.getProduct(productCode);

            list.append(StringUtil.pad(product.getCode(), CODE_WIDTH));
            list.append(StringUtil.pad(product.getDescription(), DESC_WIDTH));
            list.append(StringUtil.pad(product.getFormattedPrice(), PRICE_WIDTH));
            list.append("\n");

            System.out.print("Another product ?  (y/n): ");
            choice = input.next();
            System.out.println();
        }
        System.out.println(list);

    }
}

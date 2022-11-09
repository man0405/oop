import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        final double SALES_TAX_PCT = .05;

        Scanner input = new Scanner(System.in);

        double discountPercent = 0;

        System.out.println("Welcom to the Invoice Calculator:");
        System.out.println();

        String choice = "y";
        do{

            System.out.println("Enter customer type (r/c): ");
            String customerType = input.nextLine();
            double subTotalline = input.nextDouble();
            double subTotal = new BigDecimal(subTotalline).setScale(2, RoundingMode.HALF_UP).doubleValue();


            if(customerType.equalsIgnoreCase("r")){
                if (subTotal < 100) {
                    discountPercent = .0;
                } else if (subTotal >= 100 && subTotal< 250) discountPercent = .1;
                else if (subTotal >= 250)  discountPercent = .2;
            } else discountPercent = .1;

            double discountAmount = discountPercent * subTotal;
            discountAmount = new BigDecimal(discountAmount).setScale(2, RoundingMode.HALF_UP).doubleValue();

            double totalBeforTax = subTotal - discountAmount;
            totalBeforTax = new BigDecimal(totalBeforTax).setScale(2, RoundingMode.HALF_UP).doubleValue();

            double saleTax   = totalBeforTax*SALES_TAX_PCT;
            saleTax = new BigDecimal(saleTax).setScale(2, RoundingMode.HALF_UP).doubleValue();

            double total  = totalBeforTax + saleTax;

            NumberFormat currency = NumberFormat.getCurrencyInstance();
            NumberFormat percent = NumberFormat.getPercentInstance();

            String ms = "\nINVOICE\n"
                    +   "Subtotal:        " + currency.format(subTotal) + "\n"
                    +   "Discount Percent:" + percent.format(discountPercent)+ "\n"
                    +   "Discount Amount: " + currency.format(discountAmount)+ "\n"
                    +   "Total Before Tax:" + currency.format(totalBeforTax)+ "\n"
                    +   "Sale Tax:        " + currency.format(saleTax)+ "\n"
                    +   "Invoice total:   " + currency.format(total) + "\n";

            System.out.println(ms);
    

            System.out.print("Continue?  (y/n): ");
            choice = input.nextLine();
            System.out.println();

        } while(!choice.equalsIgnoreCase("n"));

    }
}

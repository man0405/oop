import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class test {
    public static void main(String[] args) {
        final double SALES_TAX_PCT = .05;

        Scanner input = new Scanner(System.in);

        double discountPercent = 0;

        
        System.out.println("Welcom to the Invoice Calculator:");
        System.out.println();

        
        
        
        String choice = "y";
        while (!choice.equalsIgnoreCase("n")){
            System.out.print("Enter customer type (r/c):");
            String customerType = input.nextLine();
            System.out.print("Enter subtotal: ");
            Double subtotaLine = input.nextDouble();
            double subtotal = new BigDecimal(subtotaLine).setScale(2, RoundingMode.HALF_UP).doubleValue();
            System.out.println();
            
            if(customerType.equalsIgnoreCase("r")){
                if (subtotal < 100){
                    discountPercent = 0.0;
                } else if ( subtotal >= 100.0 && subtotal <250){
                    discountPercent = .1;
                } else if ( subtotal >= 250.0 ){
                    discountPercent =.2;
                }
            } else discountPercent = .1;

            double discountAmount = subtotal*discountPercent;
            discountAmount = new BigDecimal(discountAmount).setScale(2, RoundingMode.HALF_UP).doubleValue();

            double totalBeforeTax = subtotal - discountAmount;

            double saleTax = SALES_TAX_PCT*totalBeforeTax;
            saleTax =new BigDecimal(saleTax).setScale(2, RoundingMode.HALF_UP).doubleValue();

            double total = totalBeforeTax + saleTax;

            NumberFormat currency = NumberFormat.getCurrencyInstance();
            NumberFormat percent = NumberFormat.getPercentInstance();

            String ms = "\nINVOICE\n" + 
                    "Subtotal:          " + currency.format(subtotal) + "\n"
                +   "Discount Percent:  " + percent.format(discountPercent) + "\n"
                +   "Discount Amount:   " + currency.format(discountAmount) + "\n"
                +   "Total Before Tax:  " + currency.format(totalBeforeTax) + "\n"
                +   "Sale Tax:          " + currency.format(saleTax) + "\n"
                +   "Invoice total:     " + currency.format(total) + "\n";
            
            System.out.println(ms);

            System.out.print("Continue? (y/n) : ");
            
            choice = input.nextLine();
            System.out.println();

        }

        input.close();
        System.out.println("Bye!");





    }
}

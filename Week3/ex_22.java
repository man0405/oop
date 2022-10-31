package Week3;

public class ex_22 {

    public static String conver(int number){
        char[] numberHexaDecimal = {'0' , '1' , '2' , '3' , '4' , '5' , '6' , '7'};
        String base = "";
        if (number == 0 ) base = numberHexaDecimal[0] + base;
        if (number <0 ) {
            base += "-";
            number = -number;
        }
        while ( number != 0){
            base = numberHexaDecimal[number%8] + base;
            number /= 8;
        }

        return base;
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 511; i++) {
            System.out.println(conver(i));
        }
    }
}

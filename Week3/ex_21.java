package Week3;

public class ex_21 {

    public static String conver(int number){
        char[] numberHexaDecimal = {'0' , '1' , '2' , '3' , '4' , '5' , '6' , '7' , '8' , '9', 'A' , 'B' , 'C' , 'D', 'E' , 'F'};
        String base = "";
        if (number == 0 ) base += numberHexaDecimal[0];
        if (number <0 ) {
            base += "-";
            number = -number;
        }
        while ( number != 0){
            base += numberHexaDecimal[number%16];
            number /= 16;
        }

        StringBuilder str = new StringBuilder(base);

        return str.reverse().toString();
    }

    public static void main(String[] args) {
        for(int i = 0 ; i <= 65535 ; i++){
            System.out.println(conver(i));
        }

    }
}

package Week5;

public class StringUtil {
    public static String pad(String s, int len) {
        if (s.length() < len) {
            StringBuilder sb = new StringBuilder(s);
            while (sb.length() < len) {
                sb.append(" ");
            }
            return sb.toString();
        } else {
            return s.substring(0, len);
        }
    }
}

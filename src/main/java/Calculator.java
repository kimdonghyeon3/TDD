import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Calculator {
    public static int add(String s) {
        s = s.replaceAll(" ", "");
        String[] sBits = s.split("\\+");
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);

        return no1 + no2;
    }

    public static int subtract(String s) {
        s = s.replaceAll(" ", "");
        String[] sBits = s.split("-");
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);

        return no1 - no2;
    }

    public static int multiply(String s) {
        s = s.replaceAll(" ", "");
        String[] sBits = s.split("\\*");
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);

        return no1 * no2;
    }

    public static int divide(String s) {
        s = s.replaceAll(" ", "");
        String[] sBits = s.split("/");
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);

        return no1 / no2;
    }

    public static int operation(String s) {
        s = s.replaceAll(" ", "");


        String[] polynomial = s.split("\\(|\\)");

        for(int i = 0 ; i < polynomial.length ; i++){
            recursive(polynomial[i]);
        }


        return 0;
        }

        //??
    public static String recursive(String str){

        String result = str;

        int num;


        return result;
    }
}
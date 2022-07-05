public class Calculator {
    public static int add(String s) {
        String[] sBits = s.split(" \\+ ");
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);

        return no1 + no2;
    }

    public static int subtract(String s) {

        String[] sBits = s.split(" - ");
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);

        return no1 - no2;
    }

    public static int multiply(String s) {

        String[] sBits = s.split(" \\* ");
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);

        return no1 * no2;
    }

    public static int divide(String s) {
        String[] sBits = s.split(" / ");
        int no1 = Integer.parseInt(sBits[0]);
        int no2 = Integer.parseInt(sBits[1]);

        return no1 / no2;
    }

    public static int operation(String s) {
        String[] sBits = s.split(" \\+ ");
        int no1 = Integer.parseInt(sBits[0]);
        String[] sBits1 = sBits[1].split(" - ");
        int no2 = Integer.parseInt(sBits1[0]);
        int no3 = Integer.parseInt(sBits1[1]);

        return no1 + no2 - no3;
    }
}
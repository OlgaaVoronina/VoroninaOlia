package ua.epam;

public class Main {

    public static void main(String[] args) {

        //task_1
        double result1 = 12 * 4 / 3 + 158 * 2;
        System.out.println("Example task_1\nresult1 = " + result1);

        //task_2
        double value_z2 = 14;

        double result2 = value_z2 / 20 * 9 + 14 * ( 29 - value_z2 * 2 + value_z2 / 3);
        System.out.println("\nExample task_2\nresult2 = " + result2);

        //task_3
        int q = 21;
        int w = 8;

        int div = getDiv(q, w);
        int div_o = getDiv_o(q, w);
        System.out.println( "\nExample task_3\n" + q + " / " + w + " = " + div + " and " + div_o + " v ostatke");
    }

    public static int getDiv_o(int q, int w) {
        return q % w;
    }

    public static int getDiv(int q, int w) {
        return q / w;
    }
}

public class SalesArray {
    public static void main(String[] args) {

        int[] sales = {
            25000, 32000, 18000, 45000,
            29000, 50000, 38000, 27000,
            42000, 35000, 48000, 30000
        };

        int maximum = sales[0];
        int minimum = sales[0];

        for (int i = 1; i < sales.length; i++) {

            if (sales[i] > maximum) {
                maximum = sales[i];
            }

            if (sales[i] < minimum) {
                minimum = sales[i];
            }
        }

        System.out.println("Highest Sales = " + maximum);
        System.out.println("Lowest Sales  = " + minimum);
    }
}

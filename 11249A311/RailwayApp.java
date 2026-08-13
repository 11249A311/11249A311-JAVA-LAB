public class RailwayApp {
    public static void main(String[] args) {
        String[] trainCodes = {"TR101", "TR202", "TR303", "TR404"};

        try {
            // Trying to access an invalid index
            System.out.println("Train Code: " + trainCodes[5]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: Invalid train code index!");
            System.out.println("Please enter an index between 0 and " + (trainCodes.length - 1));
        }

        System.out.println("Railway application continues...");
    }
}
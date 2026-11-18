import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] productNames = {
                "Cozy Nights Monarch",
                "Restonic Barbados",
                "Sealy Phuket"
        };
        int[][] salesData = new int[3][3];
        Product[] products = new Product[3];

        for (int i = 0; i < productNames.length; i++) {
            for (int month = 0; month < 3; month++) {
                System.out.print("Enter number of sales for month " + (month + 1)
                        + " for " + productNames[i] + " mattress: ");
                salesData[i][month] = scanner.nextInt();
            }
            System.out.println();

            products[i] = new Product(productNames[i], salesData[i]);
        }

        PrintProducts.printReport(products);

        scanner.close();
    }
}

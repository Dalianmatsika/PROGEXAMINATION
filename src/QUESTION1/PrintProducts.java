package QUESTION1;

public class PrintProducts {
        public static void printReport(Product[] products) {
                System.out.println("PRODUCT SALES REPORT - 2026");
                System.out.println("**************************************************");

                int grandTotal = 0;
                double totalAverageSum = 0;
                int maxSingleMonthSales = -1;
                String mostPopularName = "";

                for (Product p : products) {
                        grandTotal += p.GetTotalProductsSold();
                        totalAverageSum += p.GetAverageProductSold();

                        // If you want to check the max single-month sale to match the screenshot (25)
                        // or use p.GetTotalProductsSold() if you prefer the full sum:
                        int[] sales = p.getMonthlySales(); // Make sure to add a getter for monthlySales in QUESTION1.Product if needed
                        for (int monthlySale : sales) {
                                if (monthlySale > maxSingleMonthSales) {
                                        maxSingleMonthSales = monthlySale;
                                        mostPopularName = p.getProductName() + " (" + maxSingleMonthSales + ")";
                                }
                        }
                }

                System.out.println("TOTAL PRODUCT SALES: " + grandTotal);
                System.out.println("AVERAGE PRODUCT SALES: " + Math.round(totalAverageSum / products.length));
                System.out.println("MOST POPULAR PRODUCT: " + mostPopularName);
                System.out.println("**************************************************");
        }
}
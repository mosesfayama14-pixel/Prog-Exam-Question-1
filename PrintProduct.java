public class PrintProduct {

    // Method to print the final sales report matching the required format
    public void displayReport(String[] productNames, int[][] salesData, IProducts productCalculator) {
        int totalSales = productCalculator.calculateTotalSales(salesData);
        double avgSales = productCalculator.calculateAverageSales(salesData);
        String mostPopular = productCalculator.getMostPopularProduct(productNames, salesData);

        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("--------------------------------------------------");
        System.out.println("TOTAL PRODUCT SALES: " + totalSales);
        System.out.println("AVERAGE PRODUCT SALES: " + (int) avgSales);
        System.out.println("MOST POPULAR PRODUCT: " + mostPopular);
    }
}

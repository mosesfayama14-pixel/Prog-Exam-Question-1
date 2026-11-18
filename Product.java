public class Product implements IProducts {

    @Override
    public int calculateTotalSales(int[][] sales) {
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
        }
        return total;
    }

    @Override
    public double calculateAverageSales(int[][] sales) {
        int totalSales = calculateTotalSales(sales);
        int totalElements = 0;
        for (int i = 0; i < sales.length; i++) {
            totalElements += sales[i].length;
        }
        return (double) totalSales / totalElements;
    }

    @Override
    public String getMostPopularProduct(String[] productNames, int[][] sales) {
        int maxSales = -1;
        int bestProductIndex = 0;

        for (int i = 0; i < sales.length; i++) {
            int productTotal = 0;
            for (int j = 0; j < sales[i].length; j++) {
                productTotal += sales[i][j];
            }
            if (productTotal > maxSales) {
                maxSales = productTotal;
                bestProductIndex = i;
            }
        }
        return productNames[bestProductIndex] + " (" + maxSales + ")";
    }
}





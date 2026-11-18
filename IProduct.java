public interface IProducts {
    int calculateTotalSales(int[][] sales);
    double calculateAverageSales(int[][] sales);
    String getMostPopularProduct(String[] productNames, int[][] sales);

}

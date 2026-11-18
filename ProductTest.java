import org.junit.Test;
import static org.junit.Assert.*;

public class ProductTest {

    private final int[][] sampleSalesData = {
            {25, 18, 20},
            {15, 10, 12},
            {18, 15, 20}
    };

    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {
        Product product = new Product();

        int expectedTotal = 153;
        int actualTotal = product.calculateTotalSales(sampleSalesData);

        assertEquals(expectedTotal, actualTotal);
    }

    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        Product product = new Product();

        double expectedAverage = 17.0;
        double actualAverage = product.calculateAverageSales(sampleSalesData);

        assertEquals(expectedAverage, actualAverage, 0.001);
    }
}

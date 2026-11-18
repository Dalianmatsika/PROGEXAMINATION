package QUESTION2;

import QUESTION1.Product;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProductTest {

    @Test
    public void testGetTotalProductsSold_WithValidData_ReturnsCorrectValue() {
        int[] sales = {25, 18, 20};
        Product product = new Product("Cozy Nights Monarch", sales);
        assertEquals(63, product.GetTotalProductsSold());
    }

    @Test
    public void testGetAverageSales_WithValidData_ReturnsCorrectValue() {
        int[] sales = {25, 18, 20};
        Product product = new Product("Cozy Nights Monarch", sales);
        assertEquals(21.0, product.GetAverageProductSold(), 0.01);
    }

    @Test
    public void testGetVat_WithValidData_ReturnsCorrectValue() {
        ProductCalculations calc = new ProductCalculations(3500.0);
        assertEquals(525.0, calc.GetVat(), 0.01);
    }

    @Test
    public void testGetTotal_WithValidData_ReturnsCorrectValue() {
        ProductCalculations calc = new ProductCalculations(3500.0);
        // 3500 + 525 (VAT) + 175 (Commission) = 4200.0
        assertEquals(4200.0, calc.GetTotal(), 0.01);
    }
}
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PricingTest {
    @Test
    public void vipDiscount() {
        Pricing p = new Pricing();
        assertEquals("VIP doit avoir -20%", 80, p.finalPrice(100, true));
        assertEquals("VIP doit avoir -10%", 90, p.finalPrice(100, true));
    }
}
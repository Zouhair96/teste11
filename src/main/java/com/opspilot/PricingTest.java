import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PricingTest {
    @Test
    public void vipDiscount() {
        Pricing p = new Pricing();
        // Spéc ambiguë : deux règles métier contradictoires pour le MÊME cas
        // (client VIP, panier de 100€). Impossible de satisfaire les deux.
        assertEquals("VIP doit avoir -20%", 80, p.finalPrice(100, true));
        assertEquals("VIP doit avoir -10%", 90, p.finalPrice(100, true));
    }
}

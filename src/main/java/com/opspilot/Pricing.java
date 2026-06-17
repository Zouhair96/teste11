public class Pricing {
    /**
     * Prix final du panier.
     * @param amount montant en euros
     * @param vip    true si client VIP
     */
    public int finalPrice(int amount, boolean vip) {
        if (vip) {
            return amount - (amount * 10 / 100); // -10%
        }
        return amount;
    }
}

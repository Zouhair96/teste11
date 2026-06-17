/**contradiction métier dans un même test (escalade déterministe)
Le truc clé : deux assertions logiquement incompatibles sur le même appel,
dans la même méthode de test.
Aucune valeur de retour ne peut satisfaire les deux → l'IA boucle 5 fois → escalade. 
Et c'est robuste contre la triche (l'IA ne peut pas « supprimer le test gênant » sans casser l'assertion légitime du même bloc).
**/
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

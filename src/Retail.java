/**
 * Created by hoseasandstrom on 5/17/16. Note: This would be a public page.
 */
public class Retail {
    Product productName;
    Product cost;
    Product msrp;
    Inventory onHand;

   public Retail(Product productName, Product cost, Product msrp, Inventory onHand) {
       this.productName = productName;
       this.cost = cost;
       this.msrp = msrp;
       this.onHand = onHand;
   }
}

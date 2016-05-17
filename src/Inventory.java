/**
 * Created by hoseasandstrom on 5/16/16. Note: This would be a private page.
 */
public class Inventory {
    Product productName;
    int onHand;
    Vendor onOrder;

    public Inventory(Product productName, int onHand, Vendor onOrder) {
        this.productName = productName;
        this.onHand = onHand;
        this.onOrder = onOrder;
    }

    public int getOnHand() {
        return onHand;
    }
    public void setOnHand(int newOnHand) {
        onHand = newOnHand;
    }
}

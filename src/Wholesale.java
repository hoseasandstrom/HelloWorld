/**
 * Created by hoseasandstrom on 5/16/16. Note: This page is only available to wholesale accounts.
 */
public class Wholesale {
    Product productName;
    double wsPrice;
    int orderQty;
    boolean isValidQty;
    boolean invalidQty;

    public Wholesale(Product productName, double wsPrice, int orderQty,  boolean isValidQty) {
        this.productName = productName;
        this.wsPrice = wsPrice;
        this.orderQty = orderQty;
    }

    public Product getName() {
        return productName;
    }

    public void setName(Product newProductName) {
        productName = newProductName;
    }

    public double getWsPrice() {
        return wsPrice;
    }

    public void sertwsPrice(double newWSPrice) {
        wsPrice = newWSPrice;
    }

    public int getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(int newOrderQty) {
        orderQty = newOrderQty;
    }

    public boolean getiIsValidQty() {
        return isValidQty;
    }

    public void setIsValidQty(boolean invalidQty) {
        isValidQty = invalidQty;
    }
}

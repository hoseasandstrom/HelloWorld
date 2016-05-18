/**
 * Created by hoseasandstrom on 5/16/16. Note: This page is only available to wholesale accounts.
 */
public class Wholesale {
    Product productName;
    double wsPrice;
    int orderQty;
    int isValidQty;
    int invalidQty;

    public Wholesale(Product productName, double wsPrice, int orderQty, int isValidQty) {
        this.productName = productName;
        this.wsPrice = wsPrice;
        this.orderQty = orderQty;
    }

    public Product getName() {
        return productName;
    }

    public void setName(Product newProductName) {
        this.productName = newProductName;
    }

    public double getWsPrice() {
        return wsPrice;
    }

    public void setWsPrice(double newWSPrice) {
        this.wsPrice = newWSPrice;
    }

    public int getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(int newOrderQty) {
        this.orderQty = newOrderQty;
    }

    public int getiIsValidQty() {
        return isValidQty;
    }

    public void setIsValidQty(int isValidQty) {
        this.isValidQty = invalidQty;
    }
}


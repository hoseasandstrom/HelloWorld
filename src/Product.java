/**
 * Created by hoseasandstrom on 5/16/16. NOTE: This would actually be a private page.
 */
public class Product {
    static int allProducts = 50;
    String productName;
    Vendor companyName;
    Vendor ourCost;
    double msrp;
    Inventory onHand;
    Inventory onOrder;
    boolean isNewName;
    Product[] newProduct = new Product[allProducts];

    public Product(String productName, Vendor companyName, Vendor ourCost, double msrp, Inventory onHand, Inventory onOrder) {
        this.productName = productName;
        this.companyName = companyName;
        this.ourCost = ourCost;
        this.msrp = msrp;
        this.onHand = onHand;
        this.onOrder = onOrder;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String newProductName) {
        if (isNewName(newProductName)) {
            productName = newProductName;
        }
    }

    public double getMSRP() {
        return msrp;

    }

    public void setMSRP(double newMSRP) {
        msrp = newMSRP;
    }

    public static boolean isNewName(String newProductName) {
        return newProductName.contains(" ");
    }
}

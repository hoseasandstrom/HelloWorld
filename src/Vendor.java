/**
 * Created by hoseasandstrom on 5/16/16. Note: This would be a private vendor portal.
 */
public class Vendor {
    Product productName;
    String companyName;
    int ourCost;
    int onOrder;

    public Vendor(Product productName, String companyName, int ourCost, int onOrder) {
        this.productName = productName;
        this.companyName = companyName;
        this.ourCost = ourCost;
        this.onOrder = onOrder;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setComapnyName(String newCompanyName) {
        companyName = newCompanyName;
    }

    public int getOurCost() {
        return ourCost;
    }

    public void setCompanyName(int newOurCost) {
        ourCost = newOurCost;
    }

    public int getOnOrder(){
        return onOrder;
    }
    public void setOnOrder(int newOnOrder) {
        onOrder = newOnOrder;
    }
}



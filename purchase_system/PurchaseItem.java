package purchase_system;

import product_system.Product;

public class PurchaseItem {
     private Product product;

    private double quantity;

    private double purchasePrice;

    private double salesPrice;

    public PurchaseItem(Product product,
                        double quantity,
                        double purchasePrice,
                        double salesPrice) {

        this.product = product;
        this.quantity = quantity;
        this.purchasePrice = purchasePrice;
        this.salesPrice = salesPrice;
    }

    public Product getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }
}

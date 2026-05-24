package Sales;

import product_system.Product;

public class SalesItem {
     private Product product;

    private double quantity;

    private double salesPrice;

    public SalesItem(Product product,
                     double quantity,
                     double salesPrice) {

        this.product = product;
        this.quantity = quantity;
        this.salesPrice = salesPrice;
    }

    public Product getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }
}

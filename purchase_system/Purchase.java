package purchase_system;

import java.util.ArrayList;

import product_system.Product;

public class Purchase {
     private int id;

    private Vendor vendor;

    ArrayList<PurchaseItem> items =
            new ArrayList<>();

    public Purchase(int id,
                    Vendor vendor) {

        this.id = id;
        this.vendor = vendor;
    }

    public void addItem(
            PurchaseItem item) {

        items.add(item);

        Product product =
                item.getProduct();

        product.increaseStock(
                item.getQuantity());

        System.out.println(
                "Stock Increased"
        );
    }

    public void showPurchase() {

        System.out.println(
                "Vendor: "
                + vendor.getName()
        );

        for(PurchaseItem item : items) {

            System.out.println(
                    item.getProduct().getName()
                    + " Qty: "
                    + item.getQuantity()
            );
        }
    }
}

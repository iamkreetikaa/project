package Sales;

import java.util.ArrayList;

import product_system.Product;

public class Sales {
    private int id;

    private Customer customer;

    ArrayList<SalesItem> items =
            new ArrayList<>();

    public Sales(int id,
                 Customer customer) {

        this.id = id;
        this.customer = customer;
    }

    public void addItem(
            SalesItem item) {

        Product product =
                item.getProduct();

        if(product.getStock()
                < item.getQuantity()) {

            System.out.println(
                    "Not Enough Stock"
            );

            return;
        }

        product.decreaseStock(
                item.getQuantity());

        items.add(item);

        System.out.println(
                "Product Sold"
        );
    }

    public void showSales() {

        for(SalesItem item : items) {

            System.out.println(
                    item.getProduct().getName()
                    + " Qty: "
                    + item.getQuantity()
            );
        }
    }
}

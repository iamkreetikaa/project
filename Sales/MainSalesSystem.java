package Sales;

import product_system.Product;
import product_system.ProductGroup;
import product_system.UnitMeasure;
import purchase_system.Purchase;
import purchase_system.PurchaseItem;
import purchase_system.Vendor;
import user_system.User;
import user_system.Status;

public class MainSalesSystem {
    public static void main(String[] args) {

        User admin = new User(1, "Admin", "admin@gmail.com",
                "9800000000", "123", Status.ACTIVE);

        ProductGroup group =
                new ProductGroup(1, "Grocery", "Food",
                        Status.ACTIVE, admin);

        UnitMeasure kg =
                new UnitMeasure(1, "Kilogram", "KG",
                        "Weight", Status.ACTIVE, admin);

        Product rice =
                new Product(1, "Rice", "Basmati",
                        kg, group, Status.ACTIVE, admin);

        Vendor vendor =
                new Vendor(1, "ABC Supplier",
                        "Main vendor", Status.ACTIVE, admin);

        Purchase purchase = new Purchase(1, vendor);

        purchase.addItem(
                new PurchaseItem(rice, 100, 50, 70)
        );

        Customer customer =
                new Customer(1, "Ram",
                        "Regular Customer",
                        Status.ACTIVE, admin);

        Sales sales = new Sales(1, customer);

        System.out.println("\nSALES PROCESS:");

        sales.addItem(
                new SalesItem(rice, 20, 70)
        );

        sales.addItem(
                new SalesItem(rice, 10, 70)
        );

        sales.showSales();
    }
}

package purchase_system;

import product_system.Product;
import product_system.ProductGroup;
import product_system.UnitMeasure;
import user_system.User;
import user_system.Status;


public class MainPurchaseSystem {
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

        PurchaseItem item1 =
                new PurchaseItem(rice, 100, 50, 70);

        PurchaseItem item2 =
                new PurchaseItem(rice, 50, 55, 75);

        System.out.println("\nPURCHASE PROCESS:");

        purchase.addItem(item1);
        purchase.addItem(item2);

        purchase.showPurchase();
    } 
}

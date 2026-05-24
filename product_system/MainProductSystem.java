package product_system;

import java.util.ArrayList;
import user_system.User;
import user_system.Status;

public class MainProductSystem {

    public static void main(String[] args) {
        // USER
        User admin = new User(
                1,
                "Admin",
                "admin@gmail.com",
                "9812345678",
                "123",
                Status.ACTIVE
        );

        // PRODUCT GROUP
        ProductGroup group = new ProductGroup(
                1,
                "Grocery",
                "Food Items",
                Status.ACTIVE,
                admin
        );

        // UNIT OF MEASURE
        UnitMeasure kg = new UnitMeasure(
                1,
                "Kilogram",
                "KG",
                "Weight unit",
                Status.ACTIVE,
                admin
        );

        // PRODUCTS
        Product p1 = new Product(
                1,
                "Rice",
                "Basmati Rice",
                kg,
                group,
                Status.ACTIVE,
                admin
        );

        Product p2 = new Product(
                2,
                "Sugar",
                "White Sugar",
                kg,
                group,
                Status.ACTIVE,
                admin
        );

        // DISPLAY
        System.out.println("\n========== PRODUCT DETAILS ==========");

        System.out.println("\nProduct ID: " + p1.getId());
        System.out.println("Name: " + p1.getName());
        System.out.println("Description: " + p1.getDescription());
        System.out.println("Unit Measure: " + kg.getName());
        System.out.println("Product Group: " + group.getName());
        System.out.println("Status: " + p1.getStatus());
        System.out.println("Created By: " + admin.getName());

        System.out.println("\n-----------------------------------");

        System.out.println("\nProduct ID: " + p2.getId());
        System.out.println("Name: " + p2.getName());
        System.out.println("Description: " + p2.getDescription());
        System.out.println("Unit Measure: " + kg.getName());
        System.out.println("Product Group: " + group.getName());
        System.out.println("Status: " + p2.getStatus());
        System.out.println("Created By: " + admin.getName());
    }
}
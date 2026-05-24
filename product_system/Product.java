package product_system;

import user_system.User;
import user_system.Status;

public class Product {
    private int id;
    private String name;
    private String description;
    private UnitMeasure unitMeasure;
    private ProductGroup productGroup;
    private Status status;
    private User createdBy;
    private double stock = 0;

    public Product(int id,
            String name,
            String description,
            UnitMeasure unitMeasure,
            ProductGroup productGroup,
            Status status,
            User createdBy) {

        this.id = id;
        this.name = name;
        this.description = description;
        this.unitMeasure = unitMeasure;
        this.productGroup = productGroup;
        this.status = status;
        this.createdBy = createdBy;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Status getStatus() {
        return status;
    }

    public UnitMeasure getUnitMeasure() {
        return unitMeasure;
    }

    public ProductGroup getProductGroup() {
        return productGroup;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public String getName() {
        return name;
    }

    public double getStock() {
        return stock;
    }

    public void increaseStock(double qty) {

        stock += qty;
    }

    public void decreaseStock(double qty) {

        stock -= qty;
    }
}

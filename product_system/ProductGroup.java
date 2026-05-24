package product_system;

import user_system.User;
import user_system.Status;

public class ProductGroup {
    private int id;
    private String name;
    private String description;
    private Status status;
    private User createdBy;

    public ProductGroup(int id,
                        String name,
                        String description,
                        Status status,
                        User createdBy) {

        this.id = id;
        this.name = name;
        this.description = description;
        this.status = status;
        this.createdBy = createdBy;
    }

    public String getName() {
        return name;
    }
}

package product_system;

import user_system.User;
import user_system.Status;

public class UnitMeasure {
    private int id;
    private String name;
    private String code;
    private String description;
    private Status status;
    private User createdBy;

    public UnitMeasure(int id,
                       String name,
                       String code,
                       String description,
                       Status status,
                       User createdBy) {

        this.id = id;
        this.name = name;
        this.code = code;
        this.description = description;
        this.status = status;
        this.createdBy = createdBy;
    }

    public String getName() {
        return name;
    }
}

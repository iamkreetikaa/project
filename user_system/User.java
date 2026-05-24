package user_system;

public class User {
    private int id;
    private String name;
    private String email;
    private String mobileNo;
    private String password;
    private Status status;

    public User(int id,
            String name,
            String email,
            String mobileNo,
            String password,
            Status status) {

        this.id = id;
        this.name = name;
        this.email = email;
        this.mobileNo = mobileNo;
        this.password = password;
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Status getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public void display() {

        System.out.println(
                id + " "
                        + name + " "
                        + email);
    }
}

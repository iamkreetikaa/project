package user_system;

import java.util.ArrayList;

public class UserService {

    ArrayList<User> users =
            new ArrayList<>();

    public void addUser(User user) {

        users.add(user);

        System.out.println(
                "User Added"
        );
    }

    public void showUsers() {

        for(User user : users) {

            user.display();
        }
    }

    public boolean login(
            String email,
            String password) {

        for(User user : users) {

            if(user.getEmail().equals(email)
                    &&
                    user.getPassword().equals(password)) {

                if(user.getStatus()
                        == Status.INACTIVE) {

                    System.out.println(
                            "Inactive User Cannot Login"
                    );

                    return false;
                }

                System.out.println(
                        "Login Successful"
                );

                return true;
            }
        }

        System.out.println(
                "Invalid Credentials"
        );

        return false;
    }
}

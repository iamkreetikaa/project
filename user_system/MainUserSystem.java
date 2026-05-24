package user_system;

public class MainUserSystem {
     public static void main(String[] args) {

        UserService userService =
                new UserService();

        User user1 = new User(
                1,
                "Kreetika",
                "kreetikapoudel@gmail.com",
                "9812345678",
                "1234",
                Status.ACTIVE
        );

        userService.addUser(user1);

        userService.showUsers();

        userService.login(
                "kreetikapoudel@gmail.com",
                "1234"
        );
    }
}

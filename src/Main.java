public class Main {
    public static void main(String[] args) {
        var str = "Requirements:\n" +
                "\n" +
                "1. (DS & CK) User registration: Users should be able to create an account with a unique username and password.\n" +
                "\n" +
                "2. (CK) Password storage: Users should be able to securely store and manage their passwords. Each password entry should include a title, username/email, password, and an optional description.\n" +
                "\n" +
                "3. (DS) Password generation: The application should have a password generator that can generate strong and unique passwords for users.\n" +
                "\n" +
                "4. (DS) Encryption: All password data should be encrypted using a strong encryption algorithm to ensure the security of user's data.\n" +
                "\n" +
                "5. (CK & DS) Search and Filter: Users should be able to search and filter their stored passwords based on the title.\n" +
                "\n" +
                "6. (CK & DDDS)Import/export: Users can import/export password data to/from Chrome CSV format";

        System.out.println("What do you want beach?");
        User user = new User("Dirty Sanjana", Password.generate(8));
        Login login = new Login("beachImACow.com", user, "Moooo");
        System.out.println("Username is " + user.getUsername() + " and password is " + login.getPassword());
    }
}
package beach.models;

public class User {

    private final int id;
    private String username;
    private String password;
    private static int userid = 1;

    /* TODO:
        Username and password shouldn't be empty.
        beach.models.Password should be min 8 char long and contain at least 1 number
       */

    public User(String username, String password) {
        this.id = User.userid++;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        //
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

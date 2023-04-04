package beach.models;

import java.time.LocalDateTime;
import java.util.UUID;

public class User {


    private int userId;
    private String userName;
    private String password;
    private String hint;
    private LocalDateTime lastConnected;


    public User(String userName, String password, String hint) {
        this.userName = userName;
        this.password = password;
        this.hint = hint;

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public LocalDateTime getLastConnected() {
        return lastConnected;
    }

    public void setLastConnected(LocalDateTime lastConnected) {
        this.lastConnected = lastConnected;
    }
    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", hint='" + hint + '\'' +
                ", lastConnected=" + lastConnected +
                '}';
    }
}

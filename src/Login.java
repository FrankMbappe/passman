public class Login {
    private String title;
    private String url;
    private String username;
    private String password;

    //todo: pw cannot be empty
    public Login(String url, User user) {
        this.url = url;
        this.username = user.getUsername();
        this.password = user.getPassword();
    }

    public Login(String url, User user, String title) {
        this.url = url;
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.title = title;
    }

    public Login(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public Login(String url, String username, String password, String title) {
        this.url = url;
        this.username = username;
        this.password = password;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

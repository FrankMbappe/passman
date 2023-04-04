package beach.models;

import org.apache.commons.text.RandomStringGenerator;

import java.util.Date;

public class Password {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Password() {
    }

    private String title;
        private String url;
        private String username;
        private String password;
        private Date date;
        private int user_id;

    public Password(String title, String url, String username, String password) {
        this.title = title;
        this.url = url;
        this.username = username;
        this.password = password;
        this.date = new Date();
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
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

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        @Override
        public String toString() {
            return "\n" + "\n" + title + "\n" +
                    "-----------------------------" + "\n" +
                    "URL: " + url + "\n" +
                    "Username: " + username + "\n" +
                    "Password: " + password + "\n" +
                    "Date: " + date;
        }
    }

//    public static String generate(int length) {
//        RandomStringGenerator pwdGenerator = new RandomStringGenerator.Builder().withinRange(48, 90)
//                .build();
//        return pwdGenerator.generate(length);
//    }


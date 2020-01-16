package models;

public class User {

    private String fullName;
    private String login;
    private String password;
    private int languageId;

    @Override
    public String toString() {
        return "User{" +
                "fullName='" + fullName + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", languageId=" + languageId +
                '}';
    }

    public User(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public User(String fullName, String login, String password, int languageId) {
        this.fullName = fullName;
        this.login = login;
        this.password = password;
        this.languageId = languageId;
    }
}

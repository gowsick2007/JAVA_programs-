class User {
    private String username;
    private String password;

    public void login() {
        System.out.println(username + " logged in.");
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

public class Encapsulation {
    public static void main(String[] args) {
        User student = new User();
        student.setUsername("Nandhini");
        System.out.println(student.getUsername());
        student.setPassword("1234");
        System.out.println(student.getPassword());
        student.login();
    }
}


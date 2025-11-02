class User {
    private String username;  
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }

    public User(String password) {
        this.password = password;
    }
}

public class Main5 {
    public static void main(String[] args) {
        User u = new User("12345@pass");
        u.setUsername("Raza123");
        System.out.println("Password (read-only): " + u.getPassword());
    }
}
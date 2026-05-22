public class Request {
    private String name;
    private String password;
    private String role;

    public Request() {
    }

    public Request(String name ,String password, String role) {
        this.name=name;
        this.password = password;
        this.role=role;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }
}

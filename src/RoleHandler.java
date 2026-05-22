public class RoleHandler extends Handler {
    @Override
    public void handle(Request request) {

        if (request.getRole().equalsIgnoreCase("admin")) {
            System.out.println("Admin access granted.");
        } else {
            System.out.println("User access granted.");
        }
    }
}


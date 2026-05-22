public class AuthHandler extends Handler{
    @Override
    public void handle(Request request) {

        if (request.getName().equals("admin") &&
                request.getPassword().equals("admin123")) {

            System.out.println("Authentication successful.");

            if (nextHandler != null) {
                nextHandler.handle(request);
            }

        } else {
            System.out.println("Invalid username or password.");
        }
}}

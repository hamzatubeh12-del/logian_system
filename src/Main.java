//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Request request =
                new Request("admin", "admin123", "admin");

        Handler emptyCheck = new EmptyFieldHandler();
        Handler passwordCheck = new PasswordLangthHandler();
        Handler authCheck = new AuthHandler();
        Handler roleCheck = new RoleHandler();

        emptyCheck.setHandler(passwordCheck);
        passwordCheck.setHandler(authCheck);
        authCheck.setHandler(roleCheck);

        emptyCheck.handle(request);
    }
    }

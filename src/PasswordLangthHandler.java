public class PasswordLangthHandler extends Handler{
    @Override
    public void handle(Request request) {
        if (request.getPassword().length() < 8){
            System.out.println("password is to short");
            return;
    }
            System.out.println("password length is good");
        if(nextHandler!=null)
            nextHandler.handle(request);
    }
}

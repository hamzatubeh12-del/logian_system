public class EmptyFieldHandler extends Handler{
    @Override
    public void handle(Request request) {
        if(request.getName().isEmpty() || request.getPassword().isEmpty()){
            System.out.println("fields are empty");
            return;
        }
        if(nextHandler!=null)
            nextHandler.handle(request);
    }
}

public abstract class Handler {
    protected Handler nextHandler;
    public void setHandler(Handler nextHandler){
        this.nextHandler=nextHandler;
    }
    public abstract void handle(Request request);
}

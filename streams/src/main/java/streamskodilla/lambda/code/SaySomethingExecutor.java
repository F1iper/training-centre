package streamskodilla.lambda.code;

public class SaySomethingExecutor implements Executor {
    
    @Override
    public void process () {
        System.out.println("This is text from class SaySomethingExecutor");
    }
}

package fizzbuzz;

public class Main {
    
    public static void main (String[] args) {
        ForLoopImpl loop = new ForLoopImpl();
        System.out.println("Simple for loop implementation");
        loop.print(0, 30);
        
        StreamLoopImpl stream = new StreamLoopImpl();
        System.out.println("Stream implementation");
        stream.print(0, 30);
        
        ForEachLoopImpl forLoop = new ForEachLoopImpl();
        System.out.println("For each loop implementation");
        forLoop.print(0, 30);
    
        WhileLoopImpl whileLoop = new WhileLoopImpl();
        System.out.println("While loop implementation");
        whileLoop.print(0, 30);
    }
    
}

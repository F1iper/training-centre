package streamskodilla;

import streamskodilla.lambda.Processor;
import streamskodilla.methodwithparam.code.ExpressionExecutor;
import streamskodilla.reference.FunctionalCalculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class StreamMain {
    
    public static void main (String[] args) {
        Processor processor = new Processor();
        processor.execute(() -> System.out.println("The message from a lambda"));
    
        BigDecimal big1 = new BigDecimal("10.99");
        BigDecimal big2 = new BigDecimal("8.99");
        BigDecimal big3 = big1.divide(big2, 5, RoundingMode.CEILING);
        
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(big1, big2, BigDecimal::subtract);
        expressionExecutor.executeExpression(big1, big2, BigDecimal::add);
        expressionExecutor.executeExpression(big1, big2, BigDecimal::multiply);
        expressionExecutor.executeExpression(big1, big2, BigDecimal::divideToIntegralValue);
        System.out.println(big3);
    
        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeMethodReference(10, 5, (a, b) -> a + b);
        expressionExecutor.executeMethodReference(10, 5, (a, b) -> a - b);
        expressionExecutor.executeMethodReference(10, 5, (a, b) -> a * b);
        expressionExecutor.executeMethodReference(10, 5, (a, b) -> a / b);
    
        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeMethodReference(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeMethodReference(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeMethodReference(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeMethodReference(3, 4, FunctionalCalculator::divideAByB);
    }
}

// todo: Wyrażenia lambda z chwilą przekazania do metody oczekującej argumentu typu interfejsowego stają się
//  anonimowymi obiektami implementującymi ten interfejs. Metoda, do której
//  wyrażenie lambda zostało przekazane, wywołuje na otrzymanym obiekcie tę metodę.
//Zawsze gdy chcemy przekazywać do metody wyrażenia lambda, to metoda ta musi oczekiwać
//argumentu typu interfejsowego. Interfejs zaś musi mieć TYLKO jedną metodę.
//Implementacją tej właśnie metody stanie się otrzymane wyrażenie lambda.

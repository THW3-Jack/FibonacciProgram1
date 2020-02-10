package org.sla;

public class MyFibonacci implements Fibonacci {

    // Fields
    int amountofNumbersInSequence;
    int number1;
    int number2;

    MyFibonacci(int amount, int n1, int n2) {
        amountofNumbersInSequence = amount;
        number1 = n1;
        number2 = n2;

    }

    // Methods
    public void run() {
        int newNumber;
        for (int i = 1; i <= amountofNumbersInSequence; i++ ) {
            System.out.println(number1 );
           newNumber = number1 + number2;
            number1 = number2 ;
            number2 = newNumber ;


        }

    }
}

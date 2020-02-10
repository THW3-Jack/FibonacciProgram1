package org.sla;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyFibonacci myFib = new MyFibonacci(5, 0, 1);
        myFib.run();

        MyFibonacci myFib2 = new MyFibonacci(3, 2, -5);
        myFib2.run();

        MyFibonacci myFib3 = new MyFibonacci(5, 8, 16);
        myFib3.run();
    }
}

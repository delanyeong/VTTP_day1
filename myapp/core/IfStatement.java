package myapp.core;

import java.io.Console;

public class IfStatement {

    public static void main(String[] args) {

        Console cons = System.console();

        String a = cons.readLine("Number1: ");
        int number1 = Integer.parseInt(a);
        String b = cons.readLine("Number2: ");
        int number2 = Integer.parseInt(b);
        String op = cons.readLine("operator: ");

        if (op.equals("add"))
            System.out.print(number1 + number2);
        else if (op.equals("minus"))
            System.out.print(number1 - number2);
        else if (op.equals("multiply"))
            System.out.print(number1 * number2);
        else if (op.equals("divide"))
            System.out.print(number1 / number2);
        else
            System.err.print("something went wrong");

        System.out.printf("The answer for [%d] + [%d] = [%f]", a, b, op); //need variable for result

    }
}

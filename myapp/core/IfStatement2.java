package myapp.core;

import java.io.Console;

public class IfStatement2 {

    public static void main(String[] args) {

        //get the console
        Console cons = System.console();

        //Read the inputs from the users
        //opnd 0
        String opnd0 = cons.readLine("Operand 0: ").trim();

        //opnd 1
        String opnd1 = cons.readLine("Operand 1: ").trim();

        //oper
        String operator = cons.readLine("Operator; one of add, sub, div, mul: ").trim();

        //Convert String to Integer
        Integer val0 = Integer.parseInt(opnd0);
        Integer val1 = Integer.parseInt(opnd1);
        Float result = 0f; // float

        switch (operator) {
            case "add":
                result = (float)(val0 + val1);
                break;

            case "sub":
                result = (float)(val0 - val1);
                break;
            
            case "mul":
                result = (float)(val0 * val1);
                break;

            case "div":
                //Cast - changing one format to another changing one to float so that result will be a float
                // reformatting from int to float, but hard from float to int
                result = (float)val0 / val1;
                break;

            default:
                break;
        }

        System.out.printf("Result %d %s %d = %.3f\n", val0, operator, val1, result);
    }
}

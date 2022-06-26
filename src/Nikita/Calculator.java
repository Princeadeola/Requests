package Nikita;

import java.util.Scanner;

public class Calculator {
    static Scanner scan, input;
    static int operator, firstValue, secondValue;

    //Get values and which operator from the menu
    public void getValues(Scanner scan) {

        input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        firstValue = input.nextInt();

        System.out.print("Enter second number: ");
        secondValue = input.nextInt();

        System.out.println("1.Addition \n2.Subtraction \n3.Multilication \n4.Division");
        System.out.print("Enter your choice: ");
        operator = input.nextInt();

    }

    public String calculate(int firstValue, int secondValue, int operator) {

        switch (operator) {

            case 1 :
                System.out.println(firstValue + " + " + secondValue
                        + " = " + (firstValue+secondValue));
                break;
            // performs subtraction between numbers
            case 2:
                System.out.println(firstValue + " - " + secondValue
                        + " = " + (firstValue-secondValue));
                break;
            // performs multiplication between numbers
            case 3:
                System.out.println(firstValue + " * " + secondValue
                        + " = " + (firstValue*secondValue));
                break;
            // performs division between numbers
            case 4:
                System.out.println(firstValue + " / " + secondValue
                        + " = " + (firstValue/secondValue));
                break;
            default:
                System.out.println("Entered wrong option !" + operator);
                break;
        }

        return "firstValue operation secondValue = result";
    }

    // define,declare scanner and call getValues with scanner as parameter
    public static void main(String[] args) {

        scan = new Scanner(System.in);
        new Calculator().getValues(scan);

        Calculator calculator = new Calculator();
        calculator.calculate(firstValue , secondValue, operator);

        System.out.println("Do you want to perform another operation(Y/N): ");
        String ans = input.next();

        while (ans.equals("y")){
            System.out.println("Making a new Calculation");

            scan = new Scanner(System.in);
            new Calculator().getValues(scan);

            calculator.calculate(firstValue , secondValue, operator);

            System.out.println("Do you want to perform another operation(Y/N): ");
            ans = input.next();
        }

        System.out.println("Ending the calculator");

    }
}

/*
UCF cop 3330 summer 2021 assignment 1 solution
copyright 2021 Matthew McKee
*/

package Exercise_05;

import java.util.Scanner;

public class simpleMath {
    public static void main (String[] args){
        System.out.print("What is the first number? ");
        Scanner input = new Scanner(System.in);
        String first = input.next();
        // this changes a string to an integer
        int firstNum = Integer.parseInt(first);
        System.out.print("What is the second number? ");
        String second = input.next();
        int secondNum = Integer.parseInt(second);

        //code for the math
        int sum = firstNum + secondNum;
        int subtract = firstNum-secondNum;
        int multiply = firstNum * secondNum;
        int divide = firstNum/secondNum;

        //one printout but I entered it out a bit for readability
        System.out.print(firstNum + " + "+ secondNum + " = "+ sum + "\n"
        +firstNum + " - "+secondNum+" = "+subtract+"\n"
        +firstNum+" * "+secondNum+" = "+ multiply+"\n"
        +firstNum+" / "+secondNum+" = "+ divide+ "\n");

    }
}

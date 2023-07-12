package BasicQuestion;
import java.util.Scanner;

//Q1. Take a user input which is an integer. If the input value is even or odd.

//Input: 4
//Output: Even
//Input: 7
//Output: "Odd"

public class EvenOdd {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number ");
        int value = in.nextInt();

        System.out.println("Entered number is = " + value);

        if (value == 0){
            System.out.println("Enter number is 0");
        }else if (value % 2 == 0){
                System.out.println("even");
            }else{
                System.out.println("odd");
            }

    }

}

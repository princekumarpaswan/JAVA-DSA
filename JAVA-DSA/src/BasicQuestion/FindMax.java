package BasicQuestion;
import java.util.Scanner;
public class FindMax {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println(" Enter 3 numbers");

        int numA = in.nextInt();
        int numB = in.nextInt();
        int numC = in.nextInt();

        if( numA >= numB && numB >= numC ){
            System.out.println("The max number is " + numA);
        } else if (numB >= numA && numB >= numC ){
            System.out.println("The max number is " + numB);
        }else if (numC >= numA && numC >= numB ){
            System.out.println("The max number is " + numC);
        }

    }
}

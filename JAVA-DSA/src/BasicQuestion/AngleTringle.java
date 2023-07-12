package BasicQuestion;
import java.util.Scanner;

//Q2. Given the 3 angle of a triangle. You need to check
// whether a valid triangle can be formed those 3 angle

//input: 60 30 90
//output: "Valid triamgle"

//input : 90 20 90
//output: "Invalid Triangle"



public class AngleTringle {

    public static void main(String args[]){

        Scanner in  =  new Scanner (System.in);

        System.out.println("Enter 3 angles");

        int angleA = in.nextInt();
        int angleB = in.nextInt();
        int angleC = in.nextInt();

        int totalAngle = angleA + angleB + angleC;

        if(totalAngle == 180 && angleA> 0 && angleB >0 && angleC > 0){
            System.out.println("Valid angle: " + angleA +" + " + angleB + " + " + angleC + " = " + totalAngle);

        }else{
            System.out.println("Invalid angle: " + angleA +" + " + angleB + " + " + angleC + " = " + totalAngle);
        }
    }
}

package BasicQuestion;
import java.util.Scanner;

//Find weather the year is leap year or not

public class LeapYear {

    public static void main(String[] args) {

        Scanner in =  new Scanner(System.in);

        System.out.println("Enter a year");

        int year = in.nextInt();

        if(((year %4) ==0 && (year %100 !=0) || (year % 400 ==0))){
            System.out.println("Enter year is leap year " + year );
        }else{
            System.out.println("Entered year is not a leap year " + year);
        }
    }
}

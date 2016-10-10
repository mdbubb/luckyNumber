import java.util.Scanner;

/**
 * Created by mb977 on 10/10/16.
 */
public class Main {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = input.next();
        int u =0;
        perfectSquare a = new perfectSquare(u);
        System.out.println("Nice to meet you " + name + ", your lucky number is " + a.perfectRandom());
        System.out.println();
        System.out.println("Now type 0 to exit, type 1 to print out all the names and numbers so far, or type 2 to enter a number name");
             int num = input.nextInt();
        if(num==0){
            System.out.println("Have a nice day!");
        }
        else if(num ==1){
            System.out.println("Your name is "+ name + " and the name is " + a.perfectRandom());
        }
        else if (num ==2){

      }

    }
}

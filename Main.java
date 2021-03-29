package Java.JavaCalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t\tWelcome to My Calculator\n");
        System.out.print("Enter an operator and a number:\t");

        long sum=0,a;
        char c;
        while(true){
            System.out.print(sum+" ");
            c=scanner.next().charAt(0);
            if (c=='e') {
                System.out.println("\t\tThank You\n");
                break;
            }
            else if (c=='\n') {
                sum=0;
                System.out.println(sum);
            }
            else if (c=='h') {
                System.out.println("\tChar\t\tChar For");
                System.out.println("\t+\t\tAddition");
                System.out.println("\t-\t\tSubtraction");
                System.out.println("\t*\t\tMultiplication");
                System.out.println("\t/\t\tDivision");
                System.out.println("\th\t\tHelp");
                System.out.println("\te\t\tEnd\n");

            }
            else if (c=='+') {
                a=scanner.nextLong();
                sum+=a;
                System.out.println(sum+"\n");
            }
            else if (c=='-') {
                a=scanner.nextLong();
                sum-=a;
                System.out.println(sum+"\n");
            }
            else if (c=='*') {

                a=scanner.nextLong();
                sum*=a;
                System.out.println(sum+"\n");
            }
            else if (c=='/') {
                a=scanner.nextLong();
                sum/=a;
                System.out.println(sum+"\n");
            }
            else System.out.println("\tInvalid character..!!");



        }
    }
}
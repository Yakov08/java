package zadanie2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number 1: ");
        int num = in.nextInt();
        Scanner in2 = new Scanner(System.in);
        System.out.print("Input a number2: ");
        int num2 = in2.nextInt();
        if(num<num2){
            for(int i=num;i<=num2;i++){
                System.out.println(i);
            }
        }else if(num>num2) {
            for (int q = num2; q <= num;num-- ) {
                System.out.println(num);
            }
        }
        }


}

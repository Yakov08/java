package zadanie3;

import java.util.Scanner;

public class Main {


    public static int summ( int n){
        int result;
        if(n == 1) return 1;
        result = summ(n - 1) + n;

        return result;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number : ");
        int num1 = in.nextInt();
        int sum=0;
        if(sum==num1){
            System.out.println("qweqwewefwewec"+num1);
        }else{
       int u= summ(num1);
       System.out.println(u);
        }
    }

}

package zadanie;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        for (int i=0;i<=num;i++){
            int qwe=i;
            String str = Integer.toString(i);
            System.out.println(str.repeat(qwe));

        }
    }
}

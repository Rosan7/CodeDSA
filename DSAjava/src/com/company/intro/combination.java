package com.company.intro;
import java.util.Scanner;
public class combination {
    public static void main(String[] args) {

        Scanner m = new Scanner(System.in);
        System.out.println("ENTER THE VALUES OF N AND R: ");
        int n = m.nextInt();
        int r = m.nextInt();

        int product = 1;
        int deno1 = 1;
        int deno2 = 1;

        for(int i = n;i>Math.max(n-r,r);i--) {
            product = product * i;
        }
        for(int i = 1;i<=Math.min(n-r,r);i++){
            deno1 = deno1 * i;
        }
        int answer = product / deno1;
        System.out.println(answer);
    }
}

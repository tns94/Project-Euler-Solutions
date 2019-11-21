package euler;
/*
 * Solution of Project Euler Problem #6
 */
import java.util.Scanner;

public class Solution_6 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        long n;
        long sumSq=0,sqSum=1;
        StringBuilder str=new StringBuilder();
        for (int i = 0; i < t; i++) {
            sqSum=1;
            n=sc.nextLong();
            sumSq=((n*(n+1))/2);
            sumSq=(long)Math.pow(sumSq, 2);
            
            sqSum=n*(n+1)*(2*n+1)/6;
            str.append(Math.abs(sumSq-sqSum)).append("\n");
        
        }
        System.out.println(str);
        sc.close();
    }
}

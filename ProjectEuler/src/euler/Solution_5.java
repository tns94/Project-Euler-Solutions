package euler;

import java.util.Scanner;

/*
 * Solution of Project Euler Problem #5
 */

public class Solution_5 {

	static boolean isNum(long num,int n)
    {
        for (int i = 2; i < n; i++) {
            if (num%i!=0)
                return false;
        }
        return true;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int n;
        for (int i = 0; i < t; i++) {
            n=sc.nextInt();
        
            for (long j = n; j < Long.MAX_VALUE; j+=n) {
                if (isNum(j,n))
                {
                    System.out.println(j);
                    break;
                }
            }
        }
        sc.close();
    }
}

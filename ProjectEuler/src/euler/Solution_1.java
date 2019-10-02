package euler;
import java.util.Scanner;


/*
 * Solution of Project Euler Problem #1
 */


public class Solution_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long sum  = 0;
        long n=0;
        int t = in.nextInt();
        
        StringBuilder str=new StringBuilder();
        for(int a0 = 0; a0 < t; a0++){
            long num = in.nextLong();
            
            n=(num-1)/3;
            sum=((6+3*(n-1))*n)/2;
          
            n=(num-1)/5;
            sum+=((10+5*(n-1))*n)/2;
          
            n=(num-1)/15;
           sum-=((30+15*(n-1))*n)/2;
            
            str.append(sum).append("\n");
           
            sum=0;

        }

        System.out.print(str);
    }
}


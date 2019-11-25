package euler;

import java.util.Scanner;
/*
 * Solution of Project Euler Problem#8
 */
public class Solution_10 {

    static int[] getPrimes(int n)
    {
        boolean[] arr=new boolean[n];
        int[] primes;
        int size=n;
        int iSq;
        for (int i = 2; i < Math.sqrt(n); i++) {
            
            if(!arr[i])
            {
                iSq=i*i;
                for (int k=0, j = iSq; j < n; j=iSq+k*i,k++) {
                    if(arr[j]==false)
                    {
                        arr[j]=true;
                        size--;
                    }
                }
            }
        }
        primes=new int[size-2];
        for (int i = 2,j=0; i < arr.length; i++) {
            if (!arr[i])
            {
                primes[j]=i;
                j++;
            }
        }
        return primes;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int n,j;
        long sum=0;
        StringBuilder str=new StringBuilder();
        int[] primes=getPrimes(1000000);
        for (int i = 0; i < t; i++) {
            n=sc.nextInt();
            sum=j=0;
            while(primes[j]<=n)
            {
                sum+=primes[j];
                j++;
            }
            str.append(sum).append("\n");
            
        }
        System.out.print(str);
        sc.close();
    }

}

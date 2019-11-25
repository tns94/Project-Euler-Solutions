package euler;

import java.util.Scanner;

/*
 * Solution of Project Euler Problem #7
 */
public class Solution_7 {
    
    static int[] getPrimes(int n)
    {
        boolean[] arr=new boolean[n];
        int[] primes;
        int size=n;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if(!arr[i])
            {
                for (int k=0, j = (int)Math.pow(i,2); j < n; j=(int)Math.pow(i,2 )+k*i,k++) {
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
        int [] primes=getPrimes(104743);
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        StringBuilder result=new StringBuilder();
        for (int i = 0; i < t; i++) 
            result.append(primes[sc.nextInt()-1]).append("\n");
        
        System.out.println(result);
        sc.close();
    }}

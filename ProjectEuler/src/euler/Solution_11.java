package euler;

import java.util.Scanner;
/*
 * Solution of Project Euler Problem # 11
 */
public class Solution_11 {

    
    
    static long maxProduct(int i,int j,int[][] arr)
    {
        long max=0;
        long temp=1;int t=0;
        if (j+3<20){
        for(int jj=j;jj<j+4;jj++)
        {    t=arr[i][jj];
            temp*=arr[i][jj];}
        
        max=temp;
        temp=1;
        }
        if (i+3<20 && j+3<20){
        for (int ii=i,jj=j;ii<i+4;ii++,jj++)
            {temp*=arr[ii][jj];
        t=arr[ii][jj];}
        if (temp>max)
            max=temp;
        temp=1;
        }
        if (i+3<20){
        for (int ii=i;ii<i+4;ii++)
            {temp*=arr[ii][j];
        t=arr[ii][j];}
        if (temp>max)
            max=temp;
        temp=1;
        }
        if (i-3>=0 && j+3<20){
        for (int ii=i,jj=j;ii>i-4 && jj<j+4;ii--,jj++)
            {temp*=arr[ii][jj];
        t=arr[ii][jj];}
        if (temp>max)
            max=temp;
        }
        
        return max;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[20][20];
        long max=0,temp=0;
        for(int i=0;i<20;i++) 
            for(int j=0;j<20;j++) 
                arr[i][j]=sc.nextInt();
        
        for(int i=0;i<20;i++) 
            for(int j=0;j<20;j++) {
                temp=maxProduct(i, j, arr);
                if (max<temp)
                    max=temp;
                    
            }
        System.out.println(max);
        
        sc.close();
    }

}

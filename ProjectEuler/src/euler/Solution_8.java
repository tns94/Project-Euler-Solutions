package euler;

import java.util.Scanner;
/*
 * Solution of Project Euler Problem #8
 */
public class Solution_8 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        int n,k;
        char num[];
        String str;
        long temp=1,max=0;
        StringBuilder result=new StringBuilder();
        for (int i = 0; i < t; i++) {
            n=scanner.nextInt();
            k=scanner.nextInt();
            str=scanner.next();
            num=new char[str.length()];
            str.getChars(0, str.length(), num, 0);
            for (int j = 0; j < n-k; j++) {
                
                for (int j2 = j; j2 < j+k; j2++) {
                    temp*=Character.getNumericValue(num[j2]);
                }
                if (temp>max)
                    max=temp;
                temp=1;
            }
            result.append(max).append("\n");
            max=0;
        }
        System.out.print(result);
        scanner.close();
    }
}

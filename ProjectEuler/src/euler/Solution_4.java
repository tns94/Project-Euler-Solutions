package euler;
import java.util.*;
/*
 * Solution of Project Euler Problem #4
 */

public class Solution_4 {
    static boolean isPalindrome(String str)
    {
        for (int i = 0,j=str.length()-1; i < str.length()/2; i++,j--) {
            if(str.charAt(i)!=str.charAt(j))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        
        NavigableSet<Integer> set=new TreeSet<>();
        int t=0;
        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 99; j--) {
                t=i*j;
                if (isPalindrome(String.valueOf(t)))
                        set.add(t);
            }
        }
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        StringBuilder s=new StringBuilder();
        
        for (int i = 0; i < t; i++) {
            s.append(set.floor(sc.nextInt()-1)).append("\n");
        }
        System.out.println(s);
        
        
    }
}


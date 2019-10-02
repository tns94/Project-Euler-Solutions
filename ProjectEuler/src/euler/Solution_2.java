package euler;
/*
 * Solution of Project Euler Problem #2
 */
import java.util.Scanner;

public class Solution_2 {
static long getsum(long n)
    {
        long prev=0,curr=2,next=0,sum=0;
       
        while(!(curr>n)) {
            sum+=curr;
            next=curr*4+prev;
            prev=curr;
            curr=next;
           }
  
        return sum;
    }
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		StringBuilder str = new StringBuilder();
		
		for (int a0 = 0; a0 < t; a0++) {
			long n = in.nextLong();
			str.append(getsum(n)).append("\n");
		}
		System.out.print(str);
	}
}


package euler;

import java.util.*;
import java.math.*;

/*
 * 
 * Solution of Project Euler Problem #13
 */

public class Solution_13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        BigInteger bi=BigInteger.ZERO;
        for(int i=0;i<t;i++){
            bi=bi.add(new BigInteger(sc.next()));
        }
        System.out.println(bi.toString().substring(0,10));
 }}


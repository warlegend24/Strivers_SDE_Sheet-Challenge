import java.io.*;
import java.util.* ;

public class Solution {

    public static long fastPower(int x , int n, int m){

        long res =1 ;
        long base=x;
        while(n>0){
            if((n&1)!=0){
                res = ((res%m)*(base%m))%m;
            }
            base = (base%m * base%m)%m;
            n = n>>1;


        }
        return res;

    }














    public static int modularExponentiation(int x, int n, int m) {
        
       
        return (int)fastPower(x, n, m);
     
    }
}

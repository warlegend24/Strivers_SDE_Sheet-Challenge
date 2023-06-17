import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        //Brute force approach :-
        //We iterate on the array and find the no. of ones,zeros and two's
        //after that we simply place that many zeros,ones,tow;s in that order
        int n=arr.length;
        int ones =0;
        int zeros=0;
        int twos =0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zeros++;
            }
            else if(arr[i]==1){
                ones++;
            }
            else{
                twos++;
            }
        }
        //now we have the number of zeros,ones,twos
        for(int i=0;i<zeros;i++){
            arr[i]=0;
        }

        for(int i=zeros;i<(zeros+ones);i++){
            arr[i]=1;
        }

        for(int i=zeros+ones;i<zeros+ones+twos;i++){
            arr[i]=2;
        }
    }
}

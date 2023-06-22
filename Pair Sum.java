import java.io.*;
import java.util.*;

public class Solution{
    public static List<int[]> pairSum(int[] arr, int s){








        // brute-force approach :-
        // TC=>O(N^2)
        // SC=>O(N):
        List<int[]> ans = new ArrayList<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            int pair2 = s-arr[i];
            for(int j=i+1;j<n;j++){
                if(arr[j]==pair2){
                    int[] newPair = new int[2];
                    newPair[0]=Math.min(arr[i],arr[j]);
                    newPair[1]=Math.max(arr[i],arr[j]);
                    ans.add(newPair);
                }
            }
        }
        ans.sort(Comparator.comparingInt(array -> array[0]));
        return ans;

    }
}

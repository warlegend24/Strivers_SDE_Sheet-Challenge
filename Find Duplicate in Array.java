import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // //BRUTE FORCE APPROACH:-
        // //Make frequency hashmap for each element in the array
        // //and then iterate on the keyset and find any element with its value i.e frequency greater than 1 :- 
        // HashMap<Integer,Integer> h = new HashMap<>();
        // for(int i=0;i<n;i++){
        //     if(h.get(arr.get(i))==null){
        //         h.put(arr.get(i), 1);
        //     }
        //     else{
        //         h.put(arr.get(i), h.get(arr.get(i))+1);
        //     }
        // }
        // int ans=-1;
        // for(Integer k : h.keySet()){
        //     if(h.get(k)>1){
        //         ans=k;
        //         break;
        //     }
        // }
        // return ans;
    }
}

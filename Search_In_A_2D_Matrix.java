import java.util.ArrayList;
public class Solution {


    static boolean binarySearchIn2D(ArrayList<ArrayList<Integer>> mat, int target){
        int r = mat.size();
        int c = mat.get(0).size();
        //step 1:-
        int s=0;
        int e=((r*c)-1);
        while(s<=e){
            int m = e + (s-e)/2 ;
            //Now coordinates in the matrix corresponding to the mid index are (m/c,m%c)
            int mid = mat.get(m/c).get(m%c);
            if(mid==target){
                return true;
            }
            else if(target>mid){
                s=m+1;
            }
            else{
                e=m-1;
            }

        }
        return false;


    }
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        //approach :- binary search in 2-d array:-
        return binarySearchIn2D(mat,target);
    }
}

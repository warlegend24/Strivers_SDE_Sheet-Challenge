import java.io.*;
import java.util.* ;

import com.sun.org.apache.bcel.internal.generic.IFEQ;

public class Solution {
    public static void setZeros(int matrix[][]) {
        //brute force method :-
        int n = matrix.length;
        int m = matrix[0].length;
        int col0 =1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    
                    matrix[i][0]=0;

                    if(j!=0){
                        matrix[0][j]=0;
                    }
                    else{
                        col0 =0;
                    }
                }
            }
        }
        //now we know which rows and columns to set as zero 
        //we break the making zer in 3 steps:-
        //step 1:-
        //we process the matrix from (1,1) to (n-1,m-1)
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][j]!=0){
                    if(matrix[i][0]==0 || matrix[0][j]==0){
                        matrix[i][j]=0;
                    }
                }
            }
        }
        //now we process the first row elements first:- 
        if(matrix[0][0]==0){
            for(int j=1;j<m;j++){
                matrix[0][j]=0;
            }
        }
        //now we process the first column :-
        if(col0==0){
            for(int i=0;i<n;i++){   
                matrix[i][0]=0;
            }
        }
    }

}


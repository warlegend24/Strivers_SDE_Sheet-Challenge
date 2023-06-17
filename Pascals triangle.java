import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
		//OPTIMISED APPROACH:-
		














		//BRUTE FROCE APPROACH:
		// TC=>O(N^2)
        //steps:-
		//1:-initialising the pascals triangle:
		ArrayList<ArrayList<Long>> ans = new ArrayList<>();
		ArrayList<Long> firstRow = new ArrayList<>();
		firstRow.add(1L);
		ans.add(firstRow);
		//2:-now making each of the rows till nth row and addingit to the pascals triangle:
		for(int i=1;i<n;i++){
			//now for each row we have exactly number of elements = row number
			// example first row has only one element , second row has 2 elements and so on...
			ArrayList<Long> currRow = new ArrayList<>();
			for(int k=0;k<(i+1);k++){
				if((k==0)||(k==i)){
					currRow.add(1L);
					continue;
				}
				//for every other element in between the 1's that are the first and last element of each 
				// row
				currRow.add(ans.get(i-1).get(k-1) + ans.get(i-1).get(k));
			}
			//now we have preapred our row to beadded in the pascals triangle:-
			ans.add(currRow);

		}

		return ans;
	}
}

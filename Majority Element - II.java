import java.io.*;
import java.util.* ;



public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {


        //OPTIMAL APPROACH:=
        //EITHER TO FIND A SINGLE MAJORITY ELEMENT OR ELEMENTS WHICH HAVE FREQUENCY GREATER THAN A THRESHOLD WE CAN USE THIS ALGO:
        // FROM OBSERVATION:-
        // WE CAN SEE THAT ATMOST/ATMAX ONLY 2 ELEMENTS ARE POSSIBLE TO HAVE THE FREQUENCIES GREATER THAN FLOOR(N/3)
        int n=arr.size();
        //so:-
        int firstElement,firstCount;
        int secondElement,secondCount;

        ArrayList<Integer> ans = new ArrayList<>();
        
        firstElement=-1;
        secondElement=-1;
        firstCount=0;
        secondCount=0;

        for(int i=0;i<n;i++){

            if(arr.get(i)==firstElement){
                firstCount++;
            }

            else if(arr.get(i)==secondElement){
                secondCount++;
            }

            else if(firstCount==0){
                firstElement=arr.get(i);
                firstCount=1;
            }

            else if(secondCount==0){
                secondElement=arr.get(i);
                secondCount=1;
            }
            
            else{
                firstCount--;
                secondCount--;
            }

        }

        //now we have the 2 possible answers stored in the firstElement and secondElement vairables:
        //now we finid the frequency of both these elements
        int first=0;
        int second=0;
        for(int i=0;i<n;i++){
            if(arr.get(i)==firstElement){
                first++;
            }
            else if(arr.get(i)==secondElement){
                second++;
            }
        }

        if(first > (n/3)){

            ans.add(firstElement);
        
        }
        
        if(second > (n/3)){

            ans.add(secondElement);
        
        }


        return ans;













        // // Brute Force :-
        // // create a frequency hashmap
        // // iterate on the hashmap
        // // find and store all the keys(elements) in the ans arraylist with value(frequency)
        // // greater than the floor(n/3)
        // ArrayList<Integer> ans = new ArrayList<>();
        // HashMap<Integer,Integer> h = new HashMap<>();
        // int n=arr.size();
        // for(int i=0;i<n;i++){
        //     if(h.get(arr.get(i))==null){
        //         h.put(arr.get(i), 1);
        //     }
        //     else{
        //         h.put(arr.get(i), h.get(arr.get(i))+1);
        //     }

        // } 

        // for(Integer k : h.keySet()){
        //     if(h.get(k)>(n/3)){
        //         ans.add(k);
        //     }
        // }
        // return ans;
    }
}

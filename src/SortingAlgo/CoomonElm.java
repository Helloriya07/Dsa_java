package SortingAlgo;

import java.util.ArrayList;
import java.util.Arrays;

// Given two array return common elemnets
public class CoomonElm {
    public static void main(String[] args){
        int[] a ={1,2,9,7,4,6,};
        int[] b = {7,9,5,2,2,3};
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0;
        int j=0;
        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                ans.add(a[i]);
                i++;
                j++;
            }
            else if (a[i]<b[j]) i++; // agar a ka element bada nikl jaye to skip karo or badha do age.
            else j++;
        }
        System.out.println(ans);
    }
}

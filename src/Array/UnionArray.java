package Array;

import java.util.ArrayList;

// union of two sorted array return elem in sorted format.
public class UnionArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 4, 7};
        int[] b = {3, 4, 5, 6};
        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0;
        int j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
                    ans.add(a[i]);

                }
                i++;
            } else if (a[i] > b[j]) {
                if (ans.isEmpty() || ans.get(ans.size() - 1) != b[j]) {
                    ans.add(b[j]);


                }
                j++;
            } else {
                if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
                    ans.add(a[i]);

                }
                i++;
                j++;
            }
        }
        //remaining elements of a
            while (i < a.length) {
                if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
                    ans.add(a[i]);

                }
                i++;
            }
            // remaining elements of b
            while (j < b.length) {
                if (ans.isEmpty() || ans.get(ans.size() - 1) != b[j]) {
                    ans.add(b[j]);

                }
                j++;
            }


        System.out.println(ans);
    }
}

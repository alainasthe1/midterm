package math.problems;

import java.util.Arrays;

public class FindLowestDifference {

    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};


        int num1 = array1.length;
        int num2 = array2.length;

        System.out.println("Lowest difference between array1 and array2 : " + lowestdiff(array1, array2, num1, num2));

    }


    static int lowestdiff(int array1[], int array2[], int num1, int num2) {
        Arrays.sort(array1);
        Arrays.sort(array2);

        int a = 0, b = 0;
        int diff = Integer.MAX_VALUE;
        while (a < num1 && b < num2) {
            if (Math.abs(array1[a] - array2[b]) < diff)
                diff = Math.abs(array1[a] - array2[b]);
            if (array1[a] < array2[b])
                a++;
            else
                b++;
        }
        return diff;
    }

}



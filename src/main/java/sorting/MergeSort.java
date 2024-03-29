
package sorting;

import utils.Print;

public class MergeSort {

    // Main method to sort an array
    public static int[] sort(int[] array) {
        if (array.length < 2) {
            return array; // Base case: arrays with fewer than 2 elements do not need sorting
        }

        // Divide the array into half
        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        // Copy the elements into the new arrays
        System.arraycopy(array, 0, left, 0, mid);
        if (array.length - mid >= 0) System.arraycopy(array, mid, right, 0, array.length - mid);

        // Recursively sort the two halves
        sort(left);
        sort(right);

        // Merge the sorted halves
        return merge(sort(left), sort(right));
    }

    // Merge two halves into a sorted array
    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        // Merge while there are elements in both arrays
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        // Copy any remaining elements of the left array
        while (i < left.length) {
            result[k++] = left[i++];
        }

        // Copy any remaining elements of the right array
        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }

    // Main method to test the sort
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};
        System.out.println("Given Array");
        Print.array(array);

        int[] sortedArray = MergeSort.sort(array);

        System.out.println("\nSorted array");
        Print.array(sortedArray);
    }

}
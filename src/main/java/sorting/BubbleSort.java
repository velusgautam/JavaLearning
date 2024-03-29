package sorting;

import utils.Print;

public class BubbleSort {


	public static int[] sort(int[] list) {
		int i, j, temp;
		boolean swapped;
		for (i = 0; i < list.length - 1; i++) {
			swapped = false; // Reset swapped flag at the start of each iteration
			for (j = 0; j < list.length - 1 - i; j++) {
				if (list[j] > list[j + 1]) {
					// Swap elements if they are in the wrong order
					temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
					swapped = true; // Set flag to true indicating a swap occurred
				}
			}

			if (!swapped) {
				break;
			}
		}
		return list;
	}

	// Main method to test the sort
	public static void main(String[] args) {
		int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
		System.out.println("Given Array");
		Print.array(array);

		int[] sortedArray = BubbleSort.sort(array);

		System.out.println("\nSorted array");
		Print.array(sortedArray);

	}
}
package sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class BubbleSortTest {
    @Test
    void testSorting(){
        // Arrange
        int[] list = {2, 1, 3};
        int[] expectedList = {1, 2, 3};

        // Act
        int[] sortedList = BubbleSort.sort(list);

        // Assert
        assertArrayEquals(expectedList, sortedList, "The array should be correctly sorted");
    }

}

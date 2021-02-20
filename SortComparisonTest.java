import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

//-------------------------------------------------------------------------
/**
 *  Test class for SortComparison.java
 *
 *  @author Conn Breathnach
 *  @version HT 2020
 */
@RunWith(JUnit4.class)
public class SortComparisonTest
{
    //~ Constructor ........................................................
    @Test
    public void testConstructor() {
        new SortComparison();
    }

    //~ Public Methods ........................................................

    // ----------------------------------------------------------
    /**
     * Check that the methods work for empty arrays
     */
    @Test
    public void testEmpty() {
        double[] emptyArray = {};
        assertArrayEquals("Testing insertion sort on empty array", emptyArray, SortComparison.insertionSort(emptyArray), 0);
        assertArrayEquals("Testing selection sort on empty array", emptyArray, SortComparison.selectionSort(emptyArray), 0);
        assertArrayEquals("Testing merge sort on empty array", emptyArray, SortComparison.mergeSort(emptyArray), 0);
        assertArrayEquals("Testing quicksort on empty array", emptyArray, SortComparison.quickSort(emptyArray), 0);
    }

    @Test
    public void testSingleItem() {
        double[] sortedArray = {1};
        assertArrayEquals("Testing insertion sort on array of size 1", sortedArray, SortComparison.insertionSort(sortedArray), 0);
        assertArrayEquals("Testing selection sort on array of size 1", sortedArray, SortComparison.selectionSort(sortedArray), 0);
        assertArrayEquals("Testing merge sort on array of size 1", sortedArray, SortComparison.mergeSort(sortedArray), 0);
        assertArrayEquals("Testing quicksort on array of size 1", sortedArray, SortComparison.quickSort(sortedArray), 0);
    }

    @Test
    public void testUnsortedArray() {
        double[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] shuffledArray = {2, 6, 1, 3, 9, 10, 5, 8, 7, 4};
        assertArrayEquals("Testing insertion sort on shuffled array of size 10", sortedArray, SortComparison.insertionSort(shuffledArray), 0);
        assertArrayEquals("Testing selection sort on shuffled array of size 10", sortedArray, SortComparison.selectionSort(shuffledArray), 0);
        assertArrayEquals("Testing merge sort on shuffled array of size 10", sortedArray, SortComparison.mergeSort(shuffledArray), 0);
        assertArrayEquals("Testing quicksort on shuffled array of size 10", sortedArray, SortComparison.quickSort(shuffledArray), 0);
    }

    @Test
    public void testArrayWithDuplicates() {
        double[] sortedArray = {1, 2, 2, 3};
        double[] shuffledArray = {2, 1, 2, 3};
        assertArrayEquals("Testing insertion sort on array with duplicates", sortedArray, SortComparison.insertionSort(shuffledArray), 0);
        assertArrayEquals("Testing selection sort on array with duplicates", sortedArray, SortComparison.selectionSort(shuffledArray), 0);
        assertArrayEquals("Testing merge sort on array with duplicates", sortedArray, SortComparison.mergeSort(shuffledArray), 0);
        assertArrayEquals("Testing quicksort on array with duplicates", sortedArray, SortComparison.quickSort(shuffledArray), 0);

    }
    /**
     *  Main Method.
     *  Use this main method to create the experiments needed to answer the experimental performance questions of this assignment.
     *
     */
    public static void main(String[] args)
    {
        //TODO: implement this method
    }

}


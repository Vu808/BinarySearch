import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySeacherTest {

	@Test
	public void testBinarySearch() {
		int[] test1 = {13, 2, 7, 12 , 15, 4, 11, 6, 10, 9, 3, 1, 14, 5, 8};
		MergeSorter.mergeSort(test1, 0, 14);
		assertEquals(0, BinarySeacher.binarySearch(test1, 0, 14, 1));
		assertEquals(14, BinarySeacher.binarySearch(test1, 0, 14, 15));
		assertEquals(5, BinarySeacher.binarySearch(test1, 0, 14, 6));
	
		int[] test2 = {4, 8, 6, 1, 2, 9};
		MergeSorter.mergeSort(test2, 0, 5);
		assertEquals(0, BinarySeacher.binarySearch(test2, 0, 5, 1));
		assertEquals(5, BinarySeacher.binarySearch(test2, 0, 5, 9));
		assertEquals(3, BinarySeacher.binarySearch(test2, 0, 5, 6));
		
		int[] test3 = {1, 4, 2, 5, 3};
		MergeSorter.mergeSort(test3, 0, 4);
		assertEquals(0, BinarySeacher.binarySearch(test3, 0, 4, 1));
		assertEquals(1, BinarySeacher.binarySearch(test3, 0, 4, 2));
		assertEquals(3, BinarySeacher.binarySearch(test3, 0, 4, 4));
	}
}



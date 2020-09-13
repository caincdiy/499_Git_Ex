import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class descending_test {
	int [] arr= {2,1,6,3,10,7,8,5,4,9};
	int [] good= {10,9,8,7,6,5,4,3,2,1};
	
	int [] arr2= {2,1,6,3,10,7,8,5,4,9,2,1};
	int [] good2= {10,9,8,7,6,5,4,3,2,2,1,1};
	
	int [] arr3= {-2,1,6,3,10,7,8,5,4,9,2,1};
	int [] good3= {10,9,8,7,6,5,4,3,2,1,1,-2};
	@Test
	void test_descending1() {
		sort_array sa=new sort_array();
		sa.descending(arr);
		assertTrue(Arrays.equals(arr, good));
	}

	@Test
	void test_descending2_dup() {
		sort_array sa=new sort_array();
		sa.descending(arr2);
		assertTrue(Arrays.equals(arr2, good2));
	}
	
	@Test
	void test_descending3_negative() {
		sort_array sa=new sort_array();
		sa.descending(arr3);
		assertTrue(Arrays.equals(arr3, good3));
	}
	

	
}

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ascending_test {
	int [] arr= {2,1,6,3,10,7,8,5,4,9};
	int [] good= {1,2,3,4,5,6,7,8,9,10};
	
	int [] arr2= {2,1,6,3,10,7,8,5,4,9,1,2};
	int [] good2= {1,1,2,2,3,4,5,6,7,8,9,10};
	
	int [] arr3= {-2,1,6,3,10,7,8,5,4,9,1,2};
	int [] good3= {-2,1,1,2,3,4,5,6,7,8,9,10};
	@Test
	void test_ascending1() {
		sort_array sa=new sort_array();
		sa.ascending(arr);
		assertTrue(Arrays.equals(arr, good));
		
	}
	
	
	@Test
	void test_ascending2_dup() {
		sort_array sa=new sort_array();
		sa.ascending(arr2);
		assertTrue(Arrays.equals(arr2, good2));
		
	}

	@Test
	void test_ascending3_negative() {
		sort_array sa=new sort_array();
		sa.ascending(arr3);
		assertTrue(Arrays.equals(arr3, good3));
		
	}

}

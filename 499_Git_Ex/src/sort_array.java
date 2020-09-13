
public class sort_array {

	public static void main(String[] args) {
		int [] arr1= {2,1,6,3,10,7,8,5,4,9};
		int [] arr2= {2,1,6,3,10,7,8,5,4,9};
	
		ascending(arr1);
		for(int i=0;i<arr1.length;i++) {
		System.out.println(arr1[i]);
	}
		System.out.println();
		descending(arr2);
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		
	}//main
	//test1111 2222
	
	public static void ascending(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			int Min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[Min]>arr[j])
					Min=j;
			}
			int temp=arr[i];
			arr[i]=arr[Min];
			arr[Min]=temp;
		}
	
}//ascending
	
	public static void descending(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			int Max=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[Max]<arr[j])
					Max=j;
			}
			int temp=arr[i];
			arr[i]=arr[Max];
			arr[Max]=temp;
}
    }//descending
}

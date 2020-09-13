
public class sort_array {

	public static void main(String[] args) {
		int [] arr1= {2,1,6,3,10,7,8,5,4,9};
		int [] arr2= {2,1,6,3,10,7,8,5,4,9};
	
		ascending(arr1);
		for(int i=0;i<arr1.length;i++) {
		System.out.println(arr1[i]);
	}
		
	}//main
	
	
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
	
}

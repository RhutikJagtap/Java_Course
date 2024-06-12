package datastructure;

public class LinearSearch {
	
	 static int linearSearch(int[] arr, int target) {
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==target)
			{
				return i;  //return index
			}
		}
		
		return -1;
	}

	
	
	public static void main(String[] args) {
		int arr[]= {3,6,9,2,7,1};
		
		int target=1;
		
		int index=linearSearch(arr,target);
		
		if(index==-1)
		{
			System.out.println("Element Not Found "+index);
		}else {
			System.out.println("Element Found at index "+index);
		}
		
	}

	
}

package datastructure;

public class BinarySearch {
	
	static int binarySearch(int arr[],int target)
	{
		int start=0;
		int end=arr.length;
		
		while(start<=end)
		{
			int mid=(start+end)/2;
			
			if(arr[mid]==target)
			{
				return mid;
			}
			
			if(arr[mid]<target)
			{
				start=mid+1;  //search on right side of array
			}
			
			if(arr[mid]>target)
			{
				end=mid-1;     //search on left side of array
			}
			
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		//array must be sorted in case of Binary Search
		int arr[]= {4,6,8,9,23};
		
		int target=9;
		
		int index=binarySearch(arr,target);
		
		if(index==-1)
		{
			System.out.println("Element Not Found "+index);
		}else {
			System.out.println("Element Found at index "+index);
		}
		
	}

}

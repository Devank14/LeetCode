class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int firstIndex = getFirstIndex(nums, target);
		int lastIndex = getLastIndex(nums, target);
		
		int[] a = new int[]{firstIndex, lastIndex};
        
        return a;
    }
    
    public static int getFirstIndex(int[] arr, int data) {
		
		int start = 0;
		int end = arr.length - 1;
		int fI = -1;
		
		while(start <= end) {
			int mid = start + (end-start)/2;
			
			if(arr[mid] > data) {
				end = mid - 1;
			}else if(arr[mid] < data) {
				start = mid + 1;
			}else {
				fI = mid;
				end = mid -1;
			}
		}
		
		return fI;
	}
	
	public static int getLastIndex(int[] arr, int data) {
		int start = 0;
		int end = arr.length - 1;
		int lI =-1;
		
		while(start <= end) {
			
			int mid = start + (end-start)/2;
			
			if(arr[mid] > data) {
				end = mid -1;
			}else if(arr[mid] < data) {
				start = mid +1;
			}else {
				lI = mid;
				start = mid + 1;
			}
		}
		
		return lI;
	}
    
}
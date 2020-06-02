package quickSort;

public class quickSort {
	
	public static void print(int []n) {
	      for(int i=0;i<n.length;i++) {
	         System.out.print(n[i]+" ");
	      }
	      System.out.println();
	   }

	public static int[] quickSortMain(int[] n) {
		int k=n.length;
		int start=0;
		int end=k-1;
		int mid=(int) (start+end)/2;	//�߰� ��
		int[] array= new int[k];		//ũ�Ⱑ k�� ��� ����
		
	for(int left=0; left <= mid-1; left++){//���� Ž��
		int pivot=array[mid];
	    if(array[left] >= array[mid]){
	    	array[mid]=array[left];
	        array[left]=pivot;
	        
	    } else if (left==mid-1){
	    	quickSortMain(array);
	    }
	}
	/*for(int right=mid+1;right <= n-1;right++) {
		int pivot=array[mid];
		if(array[right] <= array[mid]){
			array[mid]=array[right];
	        array[right]=pivot;
	        
	    }*/
	
	for(int right=end;right >= mid+1;right--) {//������ Ž��
		int pivot=array[mid];
		if(array[right] <= array[mid]){
			array[mid]=array[right];
	        array[right]=pivot;
	        
		}else if (right==mid+1) {
	    	quickSortMain(array);
	    }
		
	}
	return quickSortMain(array);

}
	
}

package quickSort;



public class quickSortMain {

	public static void main(String[] args){
		System.out.println("배열 길이 지정");
		int[] m = {67,700,735,287,830,360,753,332,899,616};
		int[] n = new int[m.length]; //크기가 10인 배열 생성
		
		System.arraycopy(m, 0, n, 0, m.length); //배열 m을 배열 n에 복사. m과 n은 같은 원소들을 갖지만 다른 배열이다
		
		quickSort qs=new quickSort();
		qs.print(n);
		qs.quickSortMain(n);
		//quickSort.quickSortMain(n);
		//qs.print(quickSortMain(n));
		//System.out.println(qs.quickSortMain(n));
		
	}
}

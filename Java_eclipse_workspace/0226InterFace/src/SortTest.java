import java.io.IOException;

public class SortTest {
	public static void main(String[] args) throws IOException{
		System.out.println("���Ĺ���� �����϶�");
		System.out.println("Q: Quick Sort");
		System.out.println("H: Heap Sort");
		System.out.println("B: Bubble Sort");

		int ch=System.in.read();
		Sort arr=null;
		
		if(ch=='q' ||ch=='Q') {
			arr = new QuickSort();
		} else if(ch=='h' ||ch=='H') {
			arr = new HeapSort();
		} else if(ch=='b' ||ch=='B') {
			arr = new BubbleSort();
		} else {
			System.out.println("�������� �ʴ� ����Դϴ�");
			return;
		}
		int[] arr1 = {1,2,3,4,5};
		
		arr.ascending(arr1);
		arr.descending(arr1);
		arr.description();
	}
	
}

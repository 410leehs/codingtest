package quickSort;



public class quickSortMain {

	public static void main(String[] args){
		System.out.println("�迭 ���� ����");
		int[] m = {67,700,735,287,830,360,753,332,899,616};
		int[] n = new int[m.length]; //ũ�Ⱑ 10�� �迭 ����
		
		System.arraycopy(m, 0, n, 0, m.length); //�迭 m�� �迭 n�� ����. m�� n�� ���� ���ҵ��� ������ �ٸ� �迭�̴�
		
		quickSort qs=new quickSort();
		qs.print(n);
		qs.quickSortMain(n);
		//quickSort.quickSortMain(n);
		//qs.print(quickSortMain(n));
		//System.out.println(qs.quickSortMain(n));
		
	}
}

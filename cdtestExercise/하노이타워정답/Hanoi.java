package 하노이타워정답;

public class Hanoi {
	private int tray=3;
	private int bar=3;
	int[][] rings;
	
	//접시 수를 변경하고 접시의 크기를 표현하기 위해 2차원 배열에 1,3,5를 대입하는 생성자
	public Hanoi(int tray) {//파라미터 넘겨받기
		this.tray=tray;
		rings=new int[tray][bar];
		for (int i=0 ;i<rings.length;i++) {
			int x=2*i+1;
			rings[i][0]=x;
			
		}
	}
	//외부에 접시의 크기를 표현하는 배열을 반환
	public int [][] getRings(){
		return rings;
	}
	//접시수num,막대이름 3개를 입력받는다
	public void moveHanoi(int num,char ringA,char ringB,char ringC) {
		//접시가 1장일 때는 A막대에서 B막대로 가장 큰 접시를 옮기는 경우가 한 번 발생한다. 그러므로 재귀가 끝나는
		//조건은 접시가 1장일 때이다.
		if (num==1) {
			System.out.println(ringA+"bar 쪽에 있던 링이"+ringB+"bar쪽으로 이동");
		}else {
			//접시가 2장 이상일 때는 접시를 1장 줄여서 생각해야한다. 그러므로 n-1이 된다.
			//그리고 C막대로 접시를 옮기는 과정이 있어야하므로 moveHanoi를 다시 호출한다.
			moveHanoi(num-1,ringA,ringC,ringB);
			//A막대에서 B막대로 옮기는 것이 목표이므로 현재 막대와 옮길 막대를 출력한다.
			System.out.println(ringA+"bar 쪽에 있던 링이"+ringB+"bar쪽으로 이동");
			//다른 재귀도 필요한데 C막대에서 B막대로 이동해야 한다.
			moveHanoi(num-1,ringC,ringB,ringA);
		}
	}
}

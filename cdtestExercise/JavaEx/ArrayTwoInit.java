package JavaEx;

import java.util.Arrays;

public class ArrayTwoInit {

	public static void main(String[] args) {
		System.out.println("2차원 배열방법1");
	      int[][] a = {{1,2,0},{0,0,0},{0,0,0}}; // 4X3
	      
	      System.out.println(a);
	      System.out.println(Arrays.deepToString(a));
	      
	      for(int i =0 ; i<a.length ; i++) {
	         for(int j =0 ; j<a[i].length; j++) {
	            System.out.print(a[i][j]+ " ");
	         }
	         System.out.println();
	      }
	
	//-----------------------------------------------------
	 System.out.println("//2차원 배열 방법 2 (JigJagged도 가능)");
     
     int[][] b = new int[3][5];
     b[0]= new int [4];
     b[2]= new int [3];
     
     for(int i =0 ; i<b.length ; i++) {
        for(int j =0 ; j<b[i].length; j++) {
           System.out.print(b[i][j]+ " ");
        }
        System.out.println();
     }
     //-----------------------------------------------------
     	System.out.println("//2차원 배열 방법 3");
     	  int[][] c = {{1,2,3,4,5},{2,3,4,5,6},{6,7,8,9,0}};

          for(int i =0 ; i<c.length ; i++) {
             for(int j =0 ; j<c[i].length; j++) {
                System.out.print(c[i][j]+ " ");
             }
             System.out.println();
          }
        System.out.println("//copy");
     //-----------------------------------------------------
          int [][] copy=new int[3][5];
          
          System.arraycopy(c, 0, copy,0,c.length);
          
	}
	
}
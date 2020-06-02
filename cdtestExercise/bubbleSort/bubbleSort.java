package bubbleSort;

public class bubbleSort {
	   public static void print(int []n) {
	      for(int i=0;i<n.length;i++) {
	         System.out.print(n[i]+" ");
	      }
	      System.out.println();
	   }
	   
	   public static void BubbleSort(int[] n) {
	      int dum;
	      for(int count=0;count<n.length;count++) {//¼ÒÆ® È½¼ö
	         for(int index=0;index<n.length-count-1;index++) {//ÀÎµ¦½º
	            if(n[index]>n[index+1]) {
	               dum=n[index];
	               n[index]=n[index+1];
	               n[index+1]=dum;
	         }
	      }
	      
	   }

	}
	}
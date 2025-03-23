package JavaProgramming;

import java.util.Arrays;

public class MergeArray {
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		int[] b= {5,6,7,8};
		int[] c= new int[a.length+b.length];
		for (int i=0;i<=c.length;i++) {
			if(a.length>i) {
				c[i]=a[i];
				System.out.println(c[i]);
			}
			
		}
		for (int i=4,j=0;i<c.length;i++) {
			if(b.length>j) {
				c[i]=b[j];
				j++;
				System.out.println(c[i]);
			}
		}
		System.out.println(Arrays.toString(c));
	
	}
}

package JavaProgramming;

import java.util.Arrays;

public class revMergeArr {
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		int[] b= {5,6,7,8};
		int[] c= new int[a.length+b.length];
		int k=0;
		for (int i=b.length-1,j=a.length-1;i>=0 || j>=0;i--) {
			if (i>=0) {
				c[k++]=b[i];
			}
			else {
				c[k++]=a[j--];
			}
		}
		System.out.println(Arrays.toString(c));
	}
}

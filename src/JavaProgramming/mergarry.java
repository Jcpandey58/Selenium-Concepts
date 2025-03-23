package JavaProgramming;

import java.util.Arrays;

public class mergarry {
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		int[] b= {5,6,7,8};
		int[] c= new int[a.length+b.length];
		for(int i=0,j=0;i<c.length;i++) {
			if(a.length>i) {
				c[i]=a[i];
			}
			else {
				c[i]=b[j];
				j++;
			}
		}
		System.out.println(Arrays.toString(c));
	}
}

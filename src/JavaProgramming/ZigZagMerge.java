package JavaProgramming;

import java.util.Arrays;

public class ZigZagMerge {
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		int[] b= {5,6,7,8};
		int[] c= new int[a.length+b.length];
		int j=b.length-1;
		int k=0;
		for(int i=0;i<a.length || j>=0;j--)  {
			c[k++]=a[i++];
//			k++;
//			i++;
			c[k++]=b[j];
//			k++;
		}
		System.out.println(Arrays.toString(c));
	}
}
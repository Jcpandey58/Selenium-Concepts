package JavaProgramming.array;

import java.util.Arrays;

public class DuplicateRemovalInt{
	public static void main(String[] args) {
		int[] a= {1, 2, 3, 4,5,4,4};
		int[] b = new int[a.length];
		int j=0;
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		for (int i = 0; i < a.length-1; i++) {
			if(a[i]!=a[i+1]) {
				b[j++]=a[i];
			}
		}
		b[j++]=a[a.length-1];
		
		int[]res=new int[j];
		for (int i=0;i<j;i++) {
			res[i]=b[i];
		}
		System.out.println(Arrays.toString(res));
	}
}

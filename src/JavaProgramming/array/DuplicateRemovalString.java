package JavaProgramming.array;

import java.util.Arrays;

public class DuplicateRemovalString {
	public static void main(String[] args) {
		String [] a= {"sd","sd","as","asf","asw"};
		String [] b=new String[a.length];
		Arrays.sort(a);
		int j=0;
		for(int i=0; i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				b[j]=a[i];
				j++; 
			}
		}
		b[j++]=a[a.length-1];
		System.out.println(Arrays.toString(b));
		
		String[] res=new String[j];
		
		for (int i=0; i<j;i++) {
			res[i]=b[i];
		}
		System.out.println(Arrays.toString(res));
	}
}

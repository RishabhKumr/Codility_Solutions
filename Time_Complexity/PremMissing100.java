package Time_Complexity;
import java.util.*;
//Using Counter Array
public class PremMissing100 {
	public static int solution(int[] A)
	{
		int[] B = new int[A.length+2];
		for(int i =0; i < A.length;i++)
		{
			B[A[i]] = 1;
		}
		for(int i=1;i<B.length;i++)
		{
			if(B[i]==0)
			{
				return i;
			}
		}
		return -1;
		/*int n = A.length;
		Arrays.sort(A);
		long p = A[n-1];
		long a = (p/2);
		System.out.println(a);
		long sum = a*(2*A[0] + (A[A.length-1] -1));
		System.out.println(sum);
		long sum1 = 0;
		for(int i =0; i < A.length; i++)
		{
			sum1 += A[i];
			System.out.println(A[i]+" "+sum1);
		}
		System.out.println(sum1);
		long val = sum-sum1;
		System.out.println(val);
		int num = (int) val;
		return num;*/
	}
	public static void main(String[] args) {
		int A[] = {2,3,1,5};
		System.out.println(solution(A));
	}
}

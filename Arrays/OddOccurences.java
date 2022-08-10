package Arrays;

import java.util.Arrays;

public class OddOccurences {
	//100% time compexity
	public static int solution(int[] A)
	{
		Arrays.sort(A);
		for(int i = 0; i<A.length;i++) {
		System.out.println(A[i]);
		}
		int temp = 0;
		
		outer: for(int i = 0; i < A.length;i+=2)
		{
			inner: for(int j = i+1;j<A.length;j+=2)
			{
				System.out.println(A[i]+" "+A[j]);
				if(A[i] == A[j])
				{
					break inner;
				}
				else
				{
					temp = A[i];
					break outer;
				}
			}
		  temp = A[i];
		}
		return temp;
	}
	public static void main(String[] args) {
		int[]  A = {2,4,3,2,3,5,6,6,8,8,9,9,0,1,0,1};
		System.out.println(solution(A));
	}
}

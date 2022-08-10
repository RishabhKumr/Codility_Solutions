package CountingElements;
import java.util.*;
//100%
public class PermMissing {
	public static int solution(int[] A)
	{
		Arrays.sort(A);
		int temp = 1;
		for(int  i =0; i < A.length;i++)
		{
			if(A[i]!=temp)
			{
				return 0;
			}
			temp++; 
		}
		if(temp == 1)
		{
			return 0;
		}
		return 1;
	}
	public static void main(String[] args) {
		int[] A= {4,1,3,2};
		System.out.println(solution(A));
	}
}

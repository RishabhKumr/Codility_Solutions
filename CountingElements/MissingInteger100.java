package CountingElements;
import java.util.*;
public class MissingInteger100 {
	public static int solution(int[] A)
	{
		Arrays.sort(A);
		int minValue = 1;
		for(int i=0;i<A.length;i++)
		{
			System.out.println(A[i]+" "+minValue);
			if(A[i]==minValue)
			{
				minValue++;
			}
		}
		return (int) minValue;
	}
	public static void main(String[] args) {
		int[] A = {1,3,6,4,1,2,5};
		System.out.println(solution(A));
	}
}

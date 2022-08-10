package CountingElements;
import java.util.*;
// 66% 100% correctness https://app.codility.com/demo/results/trainingRBKGXR-X9A/
public class MissingInteger {
	 public static int solution(int[] A)
	 {
		Set<Integer> list = new HashSet<Integer>(); 
		Arrays.sort(A);
		for(int i=0;i<A.length;i++)
		{
			if(A[i] > 0)
			{
				list.add(A[i]);
			}
		}
		int temp = 0;
		int i = 1;
		for(int j:list)
		{
			if(j != i)
			{
				temp = i;
				break;
			}
			i++;
		}
		return temp;
	 }
	 public static void main(String[] args) {
		int A[] = {1,3,6,4,1,2};
		System.out.println(solution(A));
	}
}

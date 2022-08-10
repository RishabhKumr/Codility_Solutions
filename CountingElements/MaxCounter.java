package CountingElements;

public class MaxCounter {
	public static int maxCounter(int counter[])
	{
		int max = 0;
		for(int i = 0; i < counter.length;i++)
		{
			if(max < counter[i])
			{
				max = counter[i];
			}
		}
		return max;
	}
	public static int[] solution(int N,int[] A)
	{
		int[] counter = new int[N];
		//int max = 0;
		for(int i=0;i<A.length;i++)
		{
			if(A[i] > N)
			{
				int max = maxCounter(counter);
				for(int j = 0; j < N;j++)
				{
					counter[j] = max;
				}
			}
			counter[A[i]-1 ]++;
		}
		return counter;
	}
	public static void main(String[] args) {
		int A[] = {3,4,4,6,1,4,4};
		System.out.println(solution(5,A));
	}
}

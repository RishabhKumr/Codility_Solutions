package PrefixSum;
//Correctness 100%  perf. 50% 
public class CountDiv {
	public static int solution(int A, int B, int K)
	{
		int count =0;
		for(int i = A;i<=B;i++)
		{
			if(i%K==0)
			{
				count++;
			}
		}
		return count;
		
	}
	public static void main(String[] args) {
		int A = 6;
		int B = 11;
		int K = 2;
		System.out.println(solution(A,B,K));
	}
}

package PrefixSum;
//100%
public class CountDiv100 {
	public int solution(int A,int B,int K)
	{
		int res = A%K;
		if(res!=0)
		{
			A = A+(K-res);
		}
		
		if(A>B)
		{
			return 0;
		}
		
		return ((B-A)/K)+1;
	}
}

 package PrefixSum;

public class GenomicRangeQuery {
	
	public static int[] solution(String S,int[] P,int[] Q)
	{
		String[] str = S.split(""); 
		int[] B = new int[str.length];
		for(int i=0;i<str.length;i++)
		{
			if(str[i].equals("A"))
			{
				B[i] = 1;
			}
			if(str[i].equals("C"))
			{
				B[i] = 2;
			}
			if(str[i].equals("G"))
			{
				B[i] = 3;
			}
		    if(str[i].equals("T"))
			{
				B[i] = 4;
			}
			else
			{
				 B[i] = 0;
			}
		}
		for(int i:B)
		{
		    System.out.println(i);
		}
		int[] ans = new int[P.length];
		for(int i=0;i<P.length;i++)
		{
		    System.out.println(B[P[i]]+" "+B[Q[i]]);
			ans[i] = Math.min(B[P[i]], B[Q[i]]);
		}
		return ans;
	}
	public static void main(String[] args) {
		
	}
}

package Time_Complexity;
//84  https://app.codility.com/demo/results/trainingPZYV6T-P2H/
public class TapeEquilibrium {
	public static int solution(int[] A)
	{
	   int[] prefixSum = new int[A.length+1];
	   int sum = 0;
	   for(int i =1; i<prefixSum.length;i++)
	   {
		   prefixSum[i]= prefixSum[i-1]+A[i-1];
	   }
	   for(int i:prefixSum)
	   {
		   System.out.println(i);
	   }
       int temp=Integer.MAX_VALUE;
       for(int i = 1; i < prefixSum.length;i++)
       {
    	   int sub = prefixSum[prefixSum.length-1] - prefixSum[i];
    	   temp = Math.min(temp, Math.abs(sub - prefixSum[i]) );
    	   //System.out.println(temp);
       }
       return temp;
	}
	public static void main(String[] args) {
		int[] A = {4,2,1,3};
		System.out.println(solution(A));
	}
}

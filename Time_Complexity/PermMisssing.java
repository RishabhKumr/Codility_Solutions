package Time_Complexity;
import java.util.*;
//50% https://app.codility.com/demo/results/trainingJWBCKQ-DY4/
public class PermMisssing {
	public static int solution(int[] A)
	{
		int temp = 0;
		Arrays.sort(A);
		int j = A[0];
		
	   for(int i:A)
	   {
		   //System.out.println(A[i]+" "+j);
		   if(i != j)
		   {
			   temp =  j;
			   break;
		   }
		   j++;
	   }
	   return temp;
	}
	public static void main(String[] args) {
		int A[] = {1,2,6,5,8,9,4,7};
		System.out.println(solution(A));
	}

}

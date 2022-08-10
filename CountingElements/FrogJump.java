package CountingElements;

import java.util.HashSet;
import java.util.Set;

public class FrogJump {
	public static int solution(int X,int[] A)
	{
		Set<Integer> val = new HashSet<Integer>();
		for(int i=0;i<A.length;i++)
		{
			if(val.add(A[i]))
			{
				X--;
			}
			if(X==0)
			{
				return i;
			}
		}
		return -1;
	}
}

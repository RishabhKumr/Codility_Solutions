package Binary;
//Correctness 100%
public class BinaryGap100 {
	public static int solution(int N){
		int temp = 0;
		int temp1 = 0;
		String[] str = Integer.toBinaryString(N).split("");
		int n = str.length;
		int i=0;
		String val="1";
		if(n==1)
		{
			return 0;
		}
		for(String s:str)
		{
			if(str[i].equals(val))
			{
				if(temp1<temp)
				{
					temp1=temp;
				}
				temp=0;
			}
			else
			{
				temp++;
			}
			i++;
		}
		return temp1;
	}

}

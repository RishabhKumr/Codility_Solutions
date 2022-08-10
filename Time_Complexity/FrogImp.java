package Time_Complexity;

public class FrogImp {
	public static int solution(int X, int Y, int D)
	{
		if((Y-X)%D == 0)
		{
			return (Y-X)/D;
		}
		else
		{
			return (Y-X)/D + 1;
		}
	}
	public static void main(String[] args) {
		int X=10;
		int y = 84;
		int z = 30;
		System.out.println(solution(X,y,z));
	}
}

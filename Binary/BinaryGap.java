package Binary;
//https://app.codility.com/demo/results/trainingRVNQF6-H8U/ 53%
public class BinaryGap {
	 public static int solution(int N) {
	        // write your code in Java SE 8
	        String s = Integer.toBinaryString(N);
	        System.out.println(s);
	        String[] str = s.split("");
	        int count = 0;
	        int temp = 0;
	        for(String i:str)
	        {
	            if(s.endsWith("0"))
	            {
	                break;
	            }
	            if(i.equals("0"))
	            {
	                count++;
	            }
	            else
	            {
	                if(count > temp){
	                    
	                temp = count;
	                count = 0;
	            }
	            }
	        }
	        return temp;
	 }
	 public static void main(String[] args) {
		int N = 42;
		System.out.println(solution(N));
	}
}

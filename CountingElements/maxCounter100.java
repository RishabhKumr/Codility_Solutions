package CountingElements;

public class maxCounter100 {
	public int[] solution(int N, int[] A) {

		int[] count = new int[N];
		    int min=0;
		    int max=0;
		     for(int i=0; i<A.length; i++){
		            if( A[i] >= 1 && A[i] <= N){ 
		            
		                if(count[ A[i] -1] < min){
		                    count[ A[i] -1] = min; 
		                }
		                
		                count[ A[i] -1 ] ++;  
		                
		                if( count[ A[i] -1 ] > max){ 
		                    max = count[ A[i] -1 ];
		                }
		            }
		            else if( A[i] == N+1){      
		             
		                min = max; 
		            }
		        }
		 
		        for(int j=0; j<count.length; j++){
		            if(count[j] < min){
		                count[j] = min; 
		            }
		        }
		        
		        return count;
		}
}

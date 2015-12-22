import java.util.TreeSet;

public class PermCheck {

	 public int solution(int[] A) {
		 
	        int[] counter = new int [A.length];
	 
	        for(int i= 0; i< A.length; i++){
	            if (A[i] < 1 || A[i] > A.length) {
	                return 0;
	            }
	            else if(counter[A[i]-1] == 1) {
	                return 0;
	            }
	            else {
	                counter[A[i]-1] = 1;
	            }
	        }
	        return 1;
	    }

}
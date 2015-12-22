import java.util.TreeSet;

public class FrogRiverOne {

	public int solution(int X, int[] A)
	{
		int result = -1;
		
		TreeSet<Integer> leafs = new TreeSet<Integer>();
		for(int i = 0 ; i < A.length ; i++)
		{
			leafs.add(A[i]);
			if(leafs.size() == X)
				return i;
		}
		
		
		return result;
	}
}

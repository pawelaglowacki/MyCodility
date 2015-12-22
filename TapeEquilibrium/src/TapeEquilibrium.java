class TapeEquilibrum {
    public int solution(int[] A) {
    	
		int rightSum = 0;
		int result;
		int leftSum = 0;

		for (int i = 0; i < A.length; i++) {
			rightSum += A[i];
		}
		
		result = rightSum;
		
		int tmp = 0;
		for (int i = 1; i < A.length; i++) {
			leftSum += A[i-1];
			rightSum -=A[i-1];

			tmp = Math.abs(leftSum - rightSum);
			if(tmp>=0)
			result = Math.min(result, tmp);
			if(result <= 0) result = tmp;

		}

		return result;

}
}


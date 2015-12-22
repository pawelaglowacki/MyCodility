import java.util.Arrays;

class PermMissingElem {
	public int solution(int[] A) {

		int result = 0;

		for (int i = 1; i <= A.length + 1; i++) {
			result = result ^ i;
		}

		for (int i : A) {
			result = result ^ i;
		}

		return result;

	}
}
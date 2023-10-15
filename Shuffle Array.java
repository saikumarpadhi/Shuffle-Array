import java.util.*;

class main {
    public static void main(String[] args) {
		Integer[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		
		List<Integer> intList = Arrays.asList(arr);

		Collections.shuffle(intList);

		intList.toArray(arr);

		System.out.println(Arrays.toString(arr));
	}
}
package JavaBasic;

public class CountNoOfIndexInArrays {

	public static void main(String[] args) {
		int[] arr = {1, 5, 10, 8, 58};
		int num = 1; 
		int temp = 0;
		

		for (int i = 0; i < arr.length; i++) {

			if (num == arr[i]) {
				temp = i;

			}

		}
		System.out.println("Index value:" + temp);

	}

}

/**
 *
 * @author Varun Upadhyay (https://github.com/varunu28)
 *
 */

/*Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?*/

class ProductOfAllExceptSelf {
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};

		int[] productArr = getProductArr(arr);

		for (int num : productArr) {
			System.out.println(num);
		}
	}

	public static int[] getProductArr(int[] arr) {
		int[] productArr = new int[arr.length];
		int num = 1;

		for (int i=0; i<arr.length; i++) {
			productArr[i] = num;
			num *= arr[i];
		}

		num = 1;
		
		for (int i=arr.length-1; i>=0; i--) {
			productArr[i] *= num;
			num *= arr[i];
		}

		return productArr;
	}
}

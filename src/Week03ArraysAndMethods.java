
public class Week03ArraysAndMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 63};
		int result = ages[ages.length - 1] - ages[0];
		System.out.println(result);
		
		int sum = 0;
		for (int number : ages) {
			sum += number;
		}
		int average = sum / ages.length;
		System.out.println(average);
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int sumNames = 0;
		for (String name: names) {
			sumNames += name.length();
		}
		int avgNameLength = sumNames / names.length;
		System.out.println(avgNameLength);
		
		String concatNames = "";
		for (String name: names) {
			concatNames += name + " ";
		}
		System.out.println(concatNames);
		
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < nameLengths.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		int sumnameLengths = 0;
		for (int length: nameLengths) {
			sumnameLengths += length;
		}
		System.out.println(sumnameLengths);
		
		System.out.println(concatString("Hello", 3));
		System.out.println(fullName("Homer", "Simpson"));
		System.out.println(sumGreater100(ages));
		
		double[] agesDouble = {3.0, 9.0, 23.0, 64.0, 2.0, 8.0, 28.0, 93.0, 63.0};
		System.out.println(avgDouble(agesDouble));
		
		double[] testDouble = {3.0, 9.0, 23.0, 64.0, 2.0, 8.0, 28.0, 93.0, 62.0};
		System.out.println(isavgGreater(agesDouble, testDouble));
		
		
		System.out.println("I will buy a drink: " + willBuyDrink(false, 11.50));
		System.out.println("I will buy a drink: " + willBuyDrink(true, 11.50));
		
		System.out.println("The names array contains 'Sam': " + arrayContains(names, "Sam"));
		
 
	}
	
	public static String concatString(String word, int n) {
		String resultStr = "";
		for (int i = 0; i < n; i++) {
			resultStr += word;
		}
		return resultStr;
	}
	
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	public static boolean sumGreater100(int[] arr) {
		int sum = 0;
		for (int num: arr) {
			sum += num;
		}
		return sum > 100;
	}
	public static double avgDouble(double[] arr) {
		double sum = 0;
		for (double num: arr) {
			sum += num;
		}
		return sum / arr.length;
	}
	public static boolean isavgGreater(double[] arr1, double[] arr2) {
		double sum1 = 0;
		double sum2 = 0;
		for (double num : arr1) {
			sum1 += num;
		}
		for (double num2: arr2) {
			sum2 += num2;
		}
		return (sum1 / arr1.length) > (sum2 / arr2.length);
	}
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && (moneyInPocket > 10.50);
	}
	
	public static boolean arrayContains(String[] arr, String word) {
		for (String name: arr) {
			if (name.equals(word)) {
				return true;
			}
		}
		return false;
	}

}

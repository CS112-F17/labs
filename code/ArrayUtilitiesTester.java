import java.util.Arrays;
/**
	A class to test the solution to ArrayUtilities.java.
	This class may not be modified.
**/
public class ArrayUtilitiesTester {


	public static boolean results(String testName, char[] expected, char[] actual) {
		System.out.println(testName);
		System.out.println("Expected: " + Arrays.toString(expected));
		System.out.println("Actual:   " + Arrays.toString(actual));

		boolean result = Arrays.equals(expected, actual);
		System.out.println((result?"PASS":"FAIL"));
		System.out.println("\n=============");

		return result;

	}

	public static boolean results(String testName, boolean expected, boolean actual) {
		System.out.println(testName);
		System.out.println("Expected: " + expected);
		System.out.println("Actual:   " + actual);

		boolean result = expected == actual;
		System.out.println((result?"PASS":"FAIL"));
		System.out.println("\n=============");

		return result;

	}

	public static void main(String[] args) {
		int passed = 0;
		int total = 0;

		//test isSquare true
		char[][] isSquareTrueOriginal = new char[][] {
			new char[] {'a', 'b'},
			new char[] {'e', 'd'},
		};
		boolean isSquareTrueActual = ArrayUtilities.isSquare(isSquareTrueOriginal);
		if(results("isSquare Test (true):", true, isSquareTrueActual)) passed++;
		total++;

		//test isSquare false
		char[][] isSquareFalseOriginal = new char[][] {
			new char[] {'a', 'b'},
			new char[] {'e', 'd'},
			new char[] {'i', 'h'},
		};
		boolean isSquareFalseActual = ArrayUtilities.isSquare(isSquareFalseOriginal);
		if(results("isSquare Test (false):", false, isSquareFalseActual)) passed++;
		total++;


		//test 2d to 1d
		char[][] oneDOriginal = new char[][] {
			new char[] {'a', 'b', 'c'},
			new char[] {'e', 'd', 'f'},
			new char[] {'i', 'h', 'g'},
		};
		char[] oneDExpected = {'a', 'b', 'c', 'e', 'd', 'f', 'i', 'h', 'g'};
		char[] oneDActual = ArrayUtilities.to1D(oneDOriginal);
		if(results("2D to 1D Test:", oneDExpected, oneDActual)) passed++;
		total++;

		//test largest per row
		char[][] smallestOriginal = new char[][] {
			new char[] {'e', 'c', 'f', 'g', 'c', 'e'},
			new char[] {'b', 'b', 'b', 'b'},
			new char[] {'a', 'd'},
			new char[] {'d', 'c', 'b'},
		};
		char[] smallestExpected = {'c', 'b', 'a', 'b'};
		char[] smallestActual = ArrayUtilities.smallestPerRow(smallestOriginal);
		if(results("Smallest Per Row Test:", smallestExpected, smallestActual)) passed++;
		total++;

		System.out.println("=============");
		System.out.printf("Tests Passed: %d of %d\n", passed, total);
		System.out.println("=============");
	}

}


public class StringListTester {

	public static void main(String[] args) {
		StringList sl = new StringList(2);

		//test isEmpty with empty list
		boolean actualBoolean = sl.isEmpty();		
		boolean expectedBoolean = true;
		String passFail = (actualBoolean == expectedBoolean)?"PASS":"FAIL";
		System.out.println("test isEmpty [" + passFail + "] - EXPECTED: " + expectedBoolean + " ACTUAL: " + actualBoolean);

		//test size with empty list
		int actualInt = sl.size();		
		int expectedInt = 0;
		passFail = (actualInt == expectedInt)?"PASS":"FAIL";
		System.out.println("test size empty list [" + passFail + "] - EXPECTED: " + expectedInt + " ACTUAL: " + actualInt);
		
		//test toString with empty list
		String actualString = sl.toString();
		String expectedString = "{}";
		passFail = (actualString.equals(expectedString))?"PASS":"FAIL";
		System.out.println("test toString [" + passFail + "] - EXPECTED: " + expectedString + " ACTUAL: " + actualString);

		sl.add("a");
		sl.add("b");
		sl.add("c");

		//test add
		actualString = sl.toString();
		expectedString = "{a,b,c}";
		passFail = (actualString.equals(expectedString))?"PASS":"FAIL";
		System.out.println("test add [" + passFail + "] - EXPECTED: " + expectedString + " ACTUAL: " + actualString);

		//test add at index
		sl.add(3, "d");
		actualString = sl.toString();
		expectedString = "{a,b,c,d}";
		passFail = (actualString.equals(expectedString))?"PASS":"FAIL";
		System.out.println("test add at index [" + passFail + "] - EXPECTED: " + expectedString + " ACTUAL: " + actualString);

		//test add at index - bad index
		sl.add(30, "e");
		actualString = sl.toString();
		expectedString = "{a,b,c,d}";
		passFail = (actualString.equals(expectedString))?"PASS":"FAIL";
		System.out.println("test add bad index [" + passFail + "] - EXPECTED: " + expectedString + " ACTUAL: " + actualString);

		//test contains true
		actualBoolean = sl.contains("b");		
		expectedBoolean = true;
		passFail = (actualBoolean == expectedBoolean)?"PASS":"FAIL";
		System.out.println("test contains true [" + passFail + "] - EXPECTED: " + expectedBoolean + " ACTUAL: " + actualBoolean);

		//test contains false
		actualBoolean = sl.contains("z");		
		expectedBoolean = false;
		passFail = (actualBoolean == expectedBoolean)?"PASS":"FAIL";
		System.out.println("test contains false [" + passFail + "] - EXPECTED: " + expectedBoolean + " ACTUAL: " + actualBoolean);

		//test contains last
		actualBoolean = sl.contains("d");		
		expectedBoolean = true;
		passFail = (actualBoolean == expectedBoolean)?"PASS":"FAIL";
		System.out.println("test contains (last item) [" + passFail + "] - EXPECTED: " + expectedBoolean + " ACTUAL: " + actualBoolean);

		//test contains first
		actualBoolean = sl.contains("a");		
		expectedBoolean = true;
		passFail = (actualBoolean == expectedBoolean)?"PASS":"FAIL";
		System.out.println("test contains (first item) [" + passFail + "] - EXPECTED: " + expectedBoolean + " ACTUAL: " + actualBoolean);

		//test size
		actualInt = sl.size();		
		expectedInt = 4;
		passFail = (actualInt == expectedInt)?"PASS":"FAIL";
		System.out.println("test size empty list [" + passFail + "] - EXPECTED: " + expectedInt + " ACTUAL: " + actualInt);

		//test isEmpty with non-empty list
		actualBoolean = sl.isEmpty();		
		expectedBoolean = false;
		passFail = (actualBoolean == expectedBoolean)?"PASS":"FAIL";
		System.out.println("test isEmpty [" + passFail + "] - EXPECTED: " + expectedBoolean + " ACTUAL: " + actualBoolean);

	}

}
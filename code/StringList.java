/**
 * A class to maintain a list of String objects using an array.
 * For full credit, your solution may not use the Arrays class or any
 * of the classes/methods in the Collections library.
 * @author srollins
 *
 */
public class StringList {

	/**
	 * TODO: Declare private data members including an array of String.
	 */
	
	/**
	 * Construct a new StringList with a default size of 10.
	 */
	public StringList() {
		//TODO: Complete constructor.
	}

	/**
	 * Construct a new StringList with size provided by the parameter.
	 * @param size
	 */
	public StringList(int size) {
		//TODO: Complete constructor.
	}

	//TODO: Consider one or more private helper methods.
	
	/**
	 * Add the new item to the end of the list.
	 * 
	 * If the array is full it will be resized.
	 * 
	 * Return true if successful and false otherwise.
	 * @param item
	 * @return
	 */
	public boolean add(String item) {
		//TODO: Replace with your code.
		return false;
	}

	/**
	 * Add a new item at the given position.
	 * 
	 * If the position is out of range, return false.
	 * Otherwise, insert the item in the specified position
	 * and return true to indicate success.
	 * 
	 * If the array is full it will be resized.
	 * @param position
	 * @param item
	 * @return
	 */
	public boolean add(int position, String item) {
		//TODO: Replace with your code.
		return false;
	}

	
	/**
	 * Remove the first instance of item. Make sure to 
	 * shift all other items up to ensure no "empty" spaces in the 
	 * array.
	 * 
	 * If the item does not appear in the array return false, otherwise
	 * return true.
	 * 
	 * @param position
	 * @return
	 */
	public boolean remove(String item) {
		//TODO: Replace with your code.
		return false;
	}

	/**
	 * Return true if the array contains item and false otherwise.
	 * 
	 * @param item
	 * @return
	 */
	public boolean contains(String item) {
		//TODO: Replace with your code.
		return false;		
	}

	/**
	 * Return the number of valid items in the array.
	 * 
	 * @return
	 */
	public int size() {
		//TODO: Replace with your code.
		return -1;
	}

	/**
	 * Return true if the list is empty and false otherwise.
	 * @return
	 */
	public boolean isEmpty() {
		//TODO: Replace with your code.
		return false;
	}

	/**
	 * Return the index of the given item. 
	 * 
	 * If the item does not exist, return -1;
	 * 
	 * @param item
	 * @return
	 */
	public int indexOf(String item) {
		//TODO: Replace with your code.
		return -1;
	}

	/**
	 * Return the last index of the given item.
	 * 
	 * If the item appears more than once you will return
	 * the index where it appears last.
	 * 
	 * If the item does not exist in the array return -1;
	 * @param item
	 * @return
	 */
	public int lastIndexOf(String item) {
		//TODO: Replace with your code.
		return -1;
	}

	/**
	 * Return a String representation of the array.
	 * Following is an example of the expected format:
	 * {A,B,C,D,E}
	 * For full credit your solution must iterate over
	 * the array and build the string. 
	 * 
	 * If the list is empty return {}.
	 * 
	 */
	public String toString() {
		//TODO: Replace with your code.
		return "";
	}

}
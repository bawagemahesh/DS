package com.ot.string;

/* Problem Statement
 Let W be the string ABCD (a) Find the length of W.(b) List all substrings of W.
 (c) List all the initails of W.
 */

public class StorageOfString {

	static String str = "ABCD";
	private StringBuilder subString = new StringBuilder();

	public static void main(String[] args) {

		StorageOfString st = new StorageOfString();
		System.out.println("A. Find the length of ABCD");
		st.getCount(str);
		System.out.println("------------AAA--------------");

		System.out.println("A. List all substrings of ABCD");
		st.combine();
		System.out.println("------------BBB--------------");

		System.out.println("c. List all the initails of ABCD");
		st.initails(str);
		System.out.println("------------CCC--------------");
	}

	public void getCount(String str) {
		int count = 0;
		for (char c : str.toCharArray()) {
			count++;
		}
		System.out.println("str's length: " + count);

	}

	public void combine() {
		combine(0, str);
	}

	private void combine(int start, String str) {
		for (int i = start; i < str.length(); ++i) {
			subString.append(str.charAt(i));
			System.out.println(subString);
			if (i < str.length())
				combine(i + 1, str);
			subString.setLength(subString.length() - 1);
		}
	}

	public void initails(String str) {
		StringBuilder builder = new StringBuilder(3);
		for (int i = 0; i < str.length(); i++) {
			builder.append(str.charAt(i));
			System.out.println("Initials Are " + builder);
		}

	}

}

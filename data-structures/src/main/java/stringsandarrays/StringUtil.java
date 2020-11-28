package stringsandarrays;

import java.util.Arrays;

public class StringUtil {
	
	public static boolean hasUniqueCharacters(String str) {
		for (int i = 0; i < str.length();i++) {
			for (int j = i+1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean isPermutation(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}
		return sortedString(str1).equals(sortedString(str2));
	}
	
	private static String sortedString(String str) {
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}
	
	public static String urlify(char[] arr, int trueLength) {
		
		int spaceCount = 0;
		for (int i = 0 ; i < trueLength; i++) {
			if (arr[i] == ' ') {
				spaceCount++;
			}
		}
		
		int index = trueLength + (2 * spaceCount) - 1;
		
		for (int i = trueLength - 1; i > 0; i--) {
			if (arr[i] == ' ') {
				arr[index] = '0';
				arr[index-1] = '2';
				arr[index-2] = '%';
				index = index -3;
			}
			else {
				arr[index] = arr[i];
				index--;
			}
		}
		return new String(arr);
	}

}

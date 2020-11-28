package stringsandarrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestStringUtil {
	
	@Test
	public void testhasUniqueCharacters() {
		
		String str = "abcdefghijk";
		assertTrue(StringUtil.hasUniqueCharacters(str));
		str = "abcdeefghijkapqwr";
		assertFalse(StringUtil.hasUniqueCharacters(str));
		str = "av";
		assertTrue(StringUtil.hasUniqueCharacters(str));
		str = "aa";
		assertFalse(StringUtil.hasUniqueCharacters(str));
		str = "a";
		assertTrue(StringUtil.hasUniqueCharacters(str));
		
	}
	
	@Test
	public void testisPermutation() {
		String str1 = "abcdef";
		String str2 = "abcdef";
		
		assertTrue(StringUtil.isPermutation(str1, str2));
		
		str1 = "abcdef";
		str2 = "acbedf";
		
		assertTrue(StringUtil.isPermutation(str1, str2));
		
		str1 = "abcdef";
		str2 = "acbedfg";
		
		assertFalse(StringUtil.isPermutation(str1, str2));
		
		str1 = "abcdef";
		str2 = "acbefg";
		
		assertFalse(StringUtil.isPermutation(str1, str2));
	}
	
	@Test
	public void testUrlify() {
		String str = "Mr John Smith    ";
		
		String result = StringUtil.urlify(str.toCharArray(), 13);
		String expected = "Mr%20John%20Smith";
		System.out.println(result);
		assertEquals(expected, result);		
	}
}

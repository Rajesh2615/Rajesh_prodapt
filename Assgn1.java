package ClassworkDay5;

import java.util.Arrays;

public class Assgn1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Able was I ere I saw Elba.");
		System.out.println(sb.capacity());
		System.out.println("****************************");
		String hannah = "Did Hannah see bees? Hannah did.";
		System.out.println(hannah.length());
		System.out.println(hannah.charAt(12));
		System.out.println(hannah.charAt(15));
		System.out.println("****************************");
		String a = "Was it a car or a cat I saw?";
		System.out.println(a.substring(9, 12));
		System.out.println("****************************");
		
		String original = "software";
		StringBuffer result = new StringBuffer("hi");
		int index = original.indexOf('a');
		result.setCharAt(0, original.charAt(0));
		result.setCharAt(1, original.charAt(original.length()-1));
		result.insert(1, original.charAt(4));
		result.append(original.substring(1,4));
		result.insert(3, (original.substring(index, index+2) + " "));
		System.out.println(result);
		
		System.out.println("****************************");
		String hi = new String("Hi, ");
		String mom = "Mom";
		String s=hi.concat(mom);
		System.out.println(s);
		
		System.out.println("****************************");
		String Name = "Rajesh";
		System.out.println(Name.charAt(0));
		
		System.out.println("****************************");
		String string1 = "parliament";
        String string2 = "partial men";

        boolean areAnagrams = isAnagram(string1, string2);

        if (areAnagrams) {
            System.out.println("'" + string1 + "' and '" + string2 + "' are anagrams.");
        } else {
            System.out.println("'" + string1 + "' and '" + string2 + "' are not anagrams.");
        }
    }
	public static boolean isAnagram(String str1, String str2) {
        // Remove white space and punctuation from both strings
        String str1Clean = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String str2Clean = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Check if the sorted versions of the cleaned strings are equal
        char[] str1Chars = str1Clean.toCharArray();
        char[] str2Chars = str2Clean.toCharArray();
        Arrays.sort(str1Chars);
        Arrays.sort(str2Chars);

        return Arrays.equals(str1Chars, str2Chars);
    }
}

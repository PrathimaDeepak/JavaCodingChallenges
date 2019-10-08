package visitMeHere;

import java.util.Scanner;
/**
 * 
 * @author Prathima
 * This resolves the LongestWordSearch Challenge picked from https://coderbyte.com/
 * The challenge is to determine the first largest word in the input string
 *
 */
public class LongestWordSearch {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(LongestWord(input.nextLine()));
	}

	private static String LongestWord(String sentence) {
		String[] words = sentence.split("\\W"); //split only words
		String longestWord = words[0];
		for(String word : words) {
			if(word.length() > longestWord.length()) {
				longestWord = word;
			}
		}
		return longestWord;
				
	}
	
	

}

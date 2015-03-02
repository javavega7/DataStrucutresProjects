import java.util.Scanner;
import java.util.Stack;

public class Palindrome 
{

	/**
	 * @Author = Scott Hillier
	 */
	public static void main(String[] args) 
	{
		// Input is a string and the output is whether or not it is a palindrome
		Scanner scan = new Scanner(System.in);
		String phrase = new String();

		System.out.println("Please input a sentance, and I will tell you if it is a palindrome: ");
		phrase = scan.nextLine();

		// Creates two new stacks of the Character type
		Stack<Character> palindromeStack1 = new Stack<Character>();
		Stack<Character> palindromeStack2 = new Stack<Character>();

		// New Phrase is where the word will be stored once I take out all of the punctuation and make it all lowercase
		String newPhrase = new String();
		Character tempLetter = ' ';

		// Loop that goes through the entire string and picks out all of the letters, placing them in a new String variable

		for(int i = 0; i < phrase.length(); i++)
		{
			tempLetter = phrase.charAt(i);
			if(Character.isLetter(phrase.charAt(i)))
			{
				newPhrase = newPhrase + tempLetter.toString();
			}
		}

		// Converts all letters to lower case so that the comparison works properly
		newPhrase = newPhrase.toLowerCase();

		// Cycles through the new phrase taking a letter from the front and back of the word
		// and simultaneously pushing one onto each stack until the middle is reached
		for(int i = 0; i < newPhrase.length()/2; i++)
		{
			palindromeStack1.push(newPhrase.charAt(i));
			palindromeStack2.push(newPhrase.charAt(newPhrase.length()-1-i));
		}


		// Creates two new strings that stores each letter
		// after it has been popped from the stack, which will later 
		// be compared to each other to see if they match, making
		// the original phrase a palindrome or not

		String firstHalf = new String();
		String secondHalf = new String();
		for(int i = 0; i < palindromeStack1.size();)
		{
			firstHalf = firstHalf + palindromeStack1.peek();
			palindromeStack1.pop();
		}

		for(int i = 0; i < palindromeStack2.size();)
		{
			secondHalf = secondHalf + palindromeStack2.peek();
			palindromeStack2.pop();
		}


		// Boolean variable for the result of whether or not it is a palindrome
		boolean result;

		// Initialization of the result as false since it assuming nothing is
		// a palindrome until proven otherwise
		result = false;

		// Compares the first half of the stack pushed and then popped from the
		// stack with a string that is the second half of the original phrase
		if(firstHalf.equals(secondHalf))
			result = true;
		else if(!firstHalf.equals(secondHalf))
			result = false;

		// Prints out the result of whether or not the phrase is a palindrome
		if(result == true)
		{
			System.out.println(phrase + " is a palindrome");
		}
		else if(result == false)
		{
			System.out.println(phrase + " is not a palindrome");
		}
		
		scan.close();
	}
}


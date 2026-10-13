public class ReverseSentance {
    static void findReverseStringSentance(String str){
      str = str.trim();

        String[] words = str.split("\\s+");

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            stringBuilder.append(words[i]);

            if (i != 0) {
                stringBuilder.append(" ");
            }
        }

        System.out.println(stringBuilder.toString());
    }
    public static void main(String args[]) {
        String str1=" the sky is blue ";
        findReverseStringSentance(str1);
    }

}

/* 
Goal: Given a string of words separated by spaces, return a string with the words in reverse order, separated by exactly one space, with no leading or trailing spaces.

Requirements:

Store your string, e.g. String s = " the sky is blue ";
Remove the spaces at the start and end using s = s.trim();
Split the string into words using String[] words = s.split("\\s+"); (\\s+ means “one or more spaces”, so extra spaces between words are handled automatically).
Create a StringBuilder result = new StringBuilder(); to build the answer.
Use a for loop that goes backwards, from i = words.length - 1 down to 0.
On each iteration, append words[i] to result. If i is not 0, also append a single space " " after it.
After the loop, convert it with result.toString() and print it.
Test with: s = "the sky is blue" → expected output blue is sky the.
Test with extra spaces: s = " hello world " → expected output world hello.
Test with a single word: s = "a" → expected output a.
Test with multiple spaces between words: s = "a good example" → expected output example good a.
Think about: why do we use split("\\s+") instead of split(" ")? (Hint: with split(" "), what do you get between two spaces in a row?)
Think about: why do we call trim() before split? What extra empty word could appear at the start if we skip it?
Constraint: don’t use Collections.reverse() or any built-in reverse on the words. Use the backward for loop.

Pattern: This is the Split and Backward Traversal pattern. You break the string into smaller pieces, then process them in reverse order. It is related to Problem 26 (Reverse a String), but here the unit being reversed is a word, not a character.
 */
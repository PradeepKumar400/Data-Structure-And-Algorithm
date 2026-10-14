public class CountStringWords {
    static int findTheWordsCount(String str){
        str=str.trim();
       if(str.length()==0){
        return 0;
       }
        String[] words=str.split("\\s+");
        return words.length;
    }
    public static void main(String args[]){
        String str="    ";
        int res=findTheWordsCount(str);
        System.out.println(res);
    }
    
}

/* Goal: Given a string, count how many words it contains. Words are separated by one or more spaces.

Requirements:

Store your string, e.g. String s = " I love Java programming ";
Remove the spaces at the start and end using s = s.trim();
If s.isEmpty(), print 0 and stop, because an empty string has no words. (Without this check, "".split("\\s+") gives an array of length 1, which would wrongly count as 1 word.)
Split the string into words: String[] words = s.split("\\s+");
The number of words is words.length. Print it.
Test with: s = "I love Java programming" → expected output 4.
Test with extra spaces: s = " hello world " → expected output 2.
Test with a single word: s = "Java" → expected output 1.
Test with an empty string: s = "" → expected output 0.
Test with only spaces: s = " " → expected output 0.
Think about: why do we use split("\\s+") instead of split(" ")? (Hint: this is the same reason as Problem 27.)
Think about: why must the isEmpty() check come after trim()? (Hint: what does " ".trim() give?)
Bonus challenge: solve it without split(). Use a for loop over the characters, and count a word each time you see a non-space character whose previous character is a space (or it is the first character). This is the manual way and uses O(1) space.

Pattern: This is the Split and Count pattern (or the Linear Scan with Counter pattern */
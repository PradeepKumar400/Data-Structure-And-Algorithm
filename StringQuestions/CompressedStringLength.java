public class CompressedStringLength {
    static String findCompressedStringLength(String str){
        if(str.length()==0){
        return " ";
    }
    int count=1;
    StringBuilder res =new StringBuilder();

    for(int i=1;i<str.length();i++)
      if(str.charAt(i) == str.charAt(i-1)){
        count++;
      }
      else{
        res.append(str.charAt(i-1));
        res.append(count);
        count=1;
      }
      res.append(str.charAt(str.length()-1));
      res.append(count);

      if(res.length() < str.length()){
        return res.toString();
      }
      return str;

    }
    public static void main(String [] args){
        String str="aaaaaaaaaaaaaaaa";
        String res =findCompressedStringLength(str);
        System.out.println(res);
    }
    
}


/* The smart way: walk through the string once. Keep the current character and a run count. When the next character is different (or the string ends), write the current character and its count into the answer, then start counting the new character.

Goal: Given a string, compress it by replacing each group of consecutive repeating characters with the character followed by its count. If the compressed string is not shorter than the original, return the original string.

Requirements:

Store your string, e.g. String s = "aaabbc";
If s.length() == 0, print an empty string and stop.
Create a StringBuilder result = new StringBuilder(); to build the answer.
Create a variable count = 1 (the run length of the current character).
Use a for loop with i from 1 to s.length() - 1.
On each iteration, compare s.charAt(i) with s.charAt(i - 1):
If equal, do count++.
If different, append s.charAt(i - 1) and then count to result, and reset count = 1.
The last group is never written inside the loop (no different character comes after it). So after the loop, append s.charAt(s.length() - 1) and count to result.
Compare lengths: if result.length() < s.length(), print result.toString(). Otherwise, print the original s.
Test with: s = "aaabbc" → a3b2c1 has length 6, which is not shorter than 6, so expected output aaabbc.
Test with: s = "aaaabbbcc" → expected output a4b3c2 (length 6 < 9).
Test with no repeats: s = "abc" → compressed is a1b1c1 (longer), so expected output abc.
Test with a single character: s = "a" → expected output a.
Test with the same character: s = "aaaaaaaaaa" (10 a’s) → expected output a10 (note the count can have two digits).
Think about: why do we need the extra append after the loop? Trace "aab" by hand and see which group is left unwritten when the loop ends.
Think about: why is count reset to 1 and not 0? (Hint: when a new character starts a group, it already counts as one.)
Constraint: don’t use result = result + ... inside the loop. Use StringBuilder.

Pattern: This is the Run-Length Encoding (Consecutive Grouping) pattern. You scan once, compare each character with the previous one, and flush a group whenever it ends. It is related to Problem 28 (counting characters), but here only consecutive repeats are grouped, so order matters.
 */
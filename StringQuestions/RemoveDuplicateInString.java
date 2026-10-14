import java.util.HashSet;

public class RemoveDuplicateInString {
    static String findRemovedDuplicateString(String str){
        HashSet<Character> seen=new HashSet<>();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(!seen.contains(str.charAt(i))){
                seen.add(str.charAt(i));
                res.append(str.charAt(i));

            }
        }
        return res.toString();
    }
    public static void main(String[] args){
        String str ="programming";
        String res =findRemovedDuplicateString(str);
        System.out.println(res);
    }
    
}

/* 
Requirements:

Store your string, e.g. String s = "programming";
Create a HashSet<Character> seen = new HashSet<>(); to remember characters already added.
Create a StringBuilder result = new StringBuilder(); to build the answer.
Use a for loop from i = 0 to s.length() - 1.
On each iteration, take the character: char c = s.charAt(i);
Check if seen does not contain c:
If yes (it is new): add c to seen and append c to result.
If no (it is a duplicate): do nothing, just move on.
After the loop ends, print result.toString().
Test with: s = "programming" → expected output progamin.
Test with: s = "aabbcc" → expected output abc.
Test with no duplicates: s = "abc" → expected output abc.
Test with the same character: s = "aaaa" → expected output a.
Test with an empty string: s = "" → expected output an empty line.
Think about: why do we use a StringBuilder and not result = result + c inside the loop? (Hint: Strings are immutable, so every + creates a brand new String.)
Think about: why does this keep the first occurrence and not the last? What would change if you walked the string from right to left?
Constraint: don’t use two nested loops comparing every character with every other character (that is O(n²)). Use the HashSet for O(n).

Bonus challenge: solve it using a boolean[] visited = new boolean[26]; instead of a HashSet (for lowercase letters only), using the c - 'a' trick from Problem 25.

Pattern: This is the HashSet / Seen-Before pattern */
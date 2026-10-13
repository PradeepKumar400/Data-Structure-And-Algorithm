public class StringMethods {
    public static void main(String[] args) {

        /*
         * | Method | Purpose |
         * | -------------------- | ---------------------------------------- |
         * | `length()` | Number of characters |
         * | `charAt()` | Get character |
         * | `equals()` | Compare content |
         * | `equalsIgnoreCase()` | Compare ignoring case |
         * | `toUpperCase()` | Uppercase |
         * | `toLowerCase()` | Lowercase |
         * | `contains()` | Check contained text |
         * | `startsWith()` | Check beginning |
         * | `endsWith()` | Check ending |
         * | `indexOf()` | Find first position |
         * | `lastIndexOf()` | Find last position |
         * | `substring()` | Extract part |
         * | `replace()` | Replace text |
         * | `trim()` | Remove basic leading/trailing whitespace |
         * | `strip()` | Remove Unicode whitespace |
         * | `isEmpty()` | Check zero length |
         * | `isBlank()` | Check empty/whitespace |
         * | `split()` | Split into array |
         * | `concat()` | Join Strings |
         * | `toCharArray()` | String → `char[]` |
         * | `matches()` | Regex matching |
         * | `repeat()` | Repeat String |
         */

        String s = "  Java Programming Java  ";
        String a = "Java";
        String b = "JAVA";

        // =====================================================
        // 1. length()
        // Purpose: Find the number of characters
        // =====================================================

        System.out.println("1. length()");
        System.out.println(s.length());

        // =====================================================
        // 2. charAt()
        // Purpose: Get a character using its index
        // =====================================================

        System.out.println("\n2. charAt()");
        System.out.println(s.charAt(2));

        // =====================================================
        // 3. equals()
        // Purpose: Compare two Strings
        // Case-sensitive
        // =====================================================

        System.out.println("\n3. equals()");
        System.out.println(a.equals(b));

        // =====================================================
        // 4. equalsIgnoreCase()
        // Purpose: Compare Strings ignoring uppercase/lowercase
        // =====================================================

        System.out.println("\n4. equalsIgnoreCase()");
        System.out.println(a.equalsIgnoreCase(b));

        // =====================================================
        // 5. toUpperCase()
        // Purpose: Convert String to uppercase
        // =====================================================

        System.out.println("\n5. toUpperCase()");
        System.out.println(a.toUpperCase());

        // =====================================================
        // 6. toLowerCase()
        // Purpose: Convert String to lowercase
        // =====================================================

        System.out.println("\n6. toLowerCase()");
        System.out.println(b.toLowerCase());

        // =====================================================
        // 7. contains()
        // Purpose: Check whether String contains specific text
        // Returns true or false
        // =====================================================

        System.out.println("\n7. contains()");
        System.out.println(s.contains("Java"));
        System.out.println(s.contains("Python"));

        // =====================================================
        // 8. startsWith()
        // Purpose: Check whether String starts with specific text
        // =====================================================

        System.out.println("\n8. startsWith()");
        System.out.println(s.startsWith("  Java"));

        // =====================================================
        // 9. endsWith()
        // Purpose: Check whether String ends with specific text
        // =====================================================

        System.out.println("\n9. endsWith()");
        System.out.println(s.endsWith("  "));

        // =====================================================
        // 10. indexOf()
        // Purpose: Find the first occurrence of a character/text
        // =====================================================

        System.out.println("\n10. indexOf()");
        System.out.println(s.indexOf("Java"));

        // =====================================================
        // 11. lastIndexOf()
        // Purpose: Find the last occurrence
        // =====================================================

        System.out.println("\n11. lastIndexOf()");
        System.out.println(s.lastIndexOf("Java"));

        // =====================================================
        // 12. substring()
        // Purpose: Extract part of a String
        // =====================================================

        System.out.println("\n12. substring()");

        String text = "Programming";

        // From index 4 to the end
        System.out.println(text.substring(4));

        // From index 0 up to, but NOT including, index 4
        System.out.println(text.substring(0, 4));

        // =====================================================
        // 13. replace()
        // Purpose: Replace characters or text
        // =====================================================

        System.out.println("\n13. replace()");
        System.out.println(s.replace("Java", "Python"));

        // =====================================================
        // 14. trim()
        // Purpose: Remove leading and trailing basic whitespace
        // =====================================================

        System.out.println("\n14. trim()");
        String spaces = "   Java   ";
        System.out.println("[" + spaces.trim() + "]");

        // =====================================================
        // 15. strip()
        // Purpose: Remove leading and trailing Unicode whitespace
        // =====================================================

        System.out.println("\n15. strip()");
        System.out.println("[" + spaces.strip() + "]");

        // =====================================================
        // 16. isEmpty()
        // Purpose: Check whether String has zero characters
        // =====================================================

        System.out.println("\n16. isEmpty()");

        String empty = "";

        System.out.println(empty.isEmpty());
        System.out.println(a.isEmpty());

        // =====================================================
        // 17. isBlank()
        // Purpose: Check whether String is empty
        // or contains only whitespace
        // =====================================================

        System.out.println("\n17. isBlank()");

        String blank = "   ";

        System.out.println(blank.isBlank());
        System.out.println(a.isBlank());

        // =====================================================
        // 18. split()
        // Purpose: Split String into an array
        // =====================================================

        System.out.println("\n18. split()");

        String sentence = "Java Python C++";

        String[] words = sentence.split(" ");

        for (String word : words) {
            System.out.println(word);
        }

        // =====================================================
        // 19. concat()
        // Purpose: Join two Strings
        // =====================================================

        System.out.println("\n19. concat()");

        String first = "Hello ";
        String second = "Java";

        System.out.println(first.concat(second));

        // =====================================================
        // 20. toCharArray()
        // Purpose: Convert String into char[]
        // =====================================================

        System.out.println("\n20. toCharArray()");

        char[] characters = a.toCharArray();

        for (char c : characters) {
            System.out.println(c);
        }

        // =====================================================
        // 21. matches()
        // Purpose: Check String against a regular expression
        // =====================================================

        System.out.println("\n21. matches()");

        String number = "12345";

        System.out.println(number.matches("\\d+"));

        String name = "Java";

        System.out.println(name.matches("[a-zA-Z]+"));

        // =====================================================
        // 22. repeat()
        // Purpose: Repeat a String multiple times
        // =====================================================

        System.out.println("\n22. repeat()");

        System.out.println("Java ".repeat(3));
    }
}
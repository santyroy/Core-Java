package com.roy._08string;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringDemo {

    public static void main(String[] args) {
        System.out.println("\n============ String Methods ============\n");

        /*
         * String objects are immutable. What ever string method is called on it
         * the original string is never modified, instead it returns a new reference
         * to a new string object.
         */

        String s = " hello ";
        System.out.println("s.length(): " + s.length()); // how many characters in string - 7
        System.out.println("s.contains(\"he\"): " + s.contains("he")); // true
        System.out.println("s.isEmpty(): " + s.isEmpty()); // false
        System.out.println("s.toUpperCase(): " + s.toUpperCase()); // ' HELLO '
        System.out.println("s.startsWith(\"h\"): " + s.startsWith("h")); // false - because string starts with space
        System.out.println("s.endsWith(\" \"): " + s.endsWith(" ")); // true
        System.out.println("s.replace(\"ll\", \"LL\"): " + s.replace("ll", "LL")); // ' heLLo '
        System.out.println("s.trim(): " + s.trim()); // 'hello' - was used before JDK 11
        System.out.println("s.strip(): " + s.strip()); // 'hello' - has come in JDK 11 and is unicode white space aware
        System.out.println("s.substring(0, 3): " + s.substring(0, 3)); // ' he'

        // convert string to array of bytes
        System.out.println(Arrays.toString(s.getBytes())); // unicode values of each character - [32, 104, 101, 108, 108, 111, 32]

        // convert string to array of characters
        System.out.println(Arrays.toString(s.toCharArray())); // [ , h, e, l, l, o,  ]

        System.out.println("s.charAt(1): " + s.charAt(1)); // h
        System.out.println("Arrays.toString(s.split(\"e\")): " + Arrays.toString(s.split("e"))); // [ h, llo ]
        System.out.println(s); // ' hello '

        System.out.println("\n================ String Comparison =================\n");

        String s2 = " hello ";
        System.out.println("s == s2: " + (s == s2)); // true - s and s2 points to same string literal inside string pool.

        String s3 = new String(" hello "); // new string object is created
        System.out.println("s == s3: " + (s == s3)); // false
        System.out.println("s.equals(s3): " + s.equals(s3)); // true

        /*
            Returns a canonical representation for the string object.
            A pool of strings, initially empty, is maintained privately by the class String.
            When the intern method is invoked, if the pool already contains a string equal to this String object
            as determined by the equals(Object) method, then the string from the pool is returned.
            Otherwise, this String object is added to the pool and a reference to this String object is returned.
            It follows that for any two strings s and t, s.intern() == t.intern() is true
            if and only if s.equals(t) is true.
         */
        System.out.println("s == s3.intern(): " + (s == s3.intern())); // true

        String firstName = "Andri";
        String firstName1 = "andri";
        System.out.println("firstName.equals(firstName1): " + firstName.equals(firstName1)); // false
        System.out.println("firstName.equalsIgnoreCase(firstName1): " + firstName.equalsIgnoreCase(firstName1)); //true


        /*
            \t - tab
            \b - backspace
            \n - new line
            \r - carriage return. ()
            \f - form feed
            \' - single quote
            \" - double quote
            \\ - backslash
         */
        System.out.println("\n=============== Escape Sequences =================\n");
        System.out.println("My favourite book is \"The one thing\" by Gary Keller");
        System.out.println("Path to source code: D:\\Java\\sources");
        System.out.println("some text line 1\nsome text line 2");
        System.out.println("Unicode characters, \u00A9 IT-Bulls.com");


        System.out.println("\n================== String Formatting ==================\n");
        String greetingTemplate = "Hello, dear %s! Good %s!";
        String morning = "morning";
        String afternoon = "afternoon";
        String evening = "evening";
        String formattedString = String.format(greetingTemplate, firstName, morning); // if less arguments passed throws exception, more arguments than those are ignored
        System.out.println(formattedString);

        System.out.printf("You have %d computers available at store\n", 10);



        /*
         Regular Expression - is a sequence of characters that define a search pattern
            []      specify range of characters to search
            a-zA-Z  will match for any lowercase or uppercase alphabets
            -       will match for all dash character
            \d      will match all digits
            +       quantifier (in case the previous characters be repeated more than once)
            \.      because dot (.) in regex means any character, so we need to put is as escaped character
         */

        System.out.println("\n================ Regular Expressions =================\n");

        String gmailPattern = "[a-zA-Z-\\d]+@gmail\\.com";
        Pattern p = Pattern.compile(gmailPattern);
        String sampleText = "Some random text that contains gmail addresses "
                + "like this one some-email@gmail.com. And some other text.";
        Matcher m = p.matcher(sampleText);
        boolean found = m.find();
        String gmailAddress = found ? m.group() : "";
        System.out.println(gmailAddress);


        String sampleText2 = "There are three sentences in this string. Are you sure? Yes!";
        String[] sentences = sampleText2.split("[\\.!?]"); // split by either dot(.) or ! or ?
        System.out.println(Arrays.toString(sentences));

        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter any text: ");
        String userInput = sc.nextLine();
        System.out.print("You entered these words: ");
        System.out.println(Arrays.toString(userInput.split("[\\p{P}\\s]+"))); // POSIX character classes
        /*
				\p{Lower}   A lower-case alphabetic character: [a-z]
				\p{Upper}   An upper-case alphabetic character:[A-Z]
				\p{ASCII}   All ASCII:[\x00-\x7F]
				\p{Alpha}   An alphabetic character:[\p{Lower}\p{Upper}]
				\p{Digit}   A decimal digit: [0-9]
				\p{Alnum}   An alphanumeric character:[\p{Alpha}\p{Digit}]
				\p{Punct}   Punctuation: One of !"#$%&'()*+,-./:;<=>?@[\]^_`{|}~
				\p{Graph}   A visible character: [\p{Alnum}\p{Punct}]
				\p{Print}   A printable character: [\p{Graph}\x20]
				\p{Blank}   A space or a tab: [ \t]
				\p{Cntrl}   A control character: [\x00-\x1F\x7F]
				\p{XDigit}  A hexadecimal digit: [0-9a-fA-F]
				\p{Space}   A whitespace character: [ \t\n\x0B\f\r]
		*/
    }
}

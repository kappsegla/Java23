package org.example.exercises.week2;

import java.util.Arrays;

public class Exercise3 {

    static boolean isPalindrome(String str){
        String palin = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            palin += str.charAt(i);
        }
        return palin.equals(str);
    }
    static boolean isPalindromeOp(String str){
        StringBuilder palin = new StringBuilder();
        for (int i = str.length()-1; i >= 0 ; i--) {
            palin.append(str.charAt(i));
        }
        return palin.toString().equals(str);
    }

    static boolean isPalindromeOpt(String str){
        StringBuilder palin = new StringBuilder();
        palin.append(str);
        palin.reverse();

        return palin.toString().equals(str);
    }

    public static boolean isPalindrome(int n) {
        String s = Integer.toString(n);
        return isPalindrome(s);
    }

    public static boolean isPalindrome2(String s) {

        char[] chars = s.toLowerCase().toCharArray();
        char[] chars2 = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            chars2[chars.length - 1 - i] = chars[i];
        }
        return Arrays.equals(chars, chars2);
    }
    private static void ispalindrom(String ord) {
        int antalBokstav= ord.length();
        String[] arrayeOrd = new String[antalBokstav];
        for (int i = 0; i < antalBokstav; i++) {
            char minord = ord.charAt(i);
            arrayeOrd[i] = String.valueOf(minord);
        }
        int i;
        int j=0;
        for ( i = 0; i < antalBokstav; i++) {
            String a= arrayeOrd[i];
            String b= arrayeOrd[(antalBokstav-1-i)];
            boolean ab=a.equals(b);
            if(ab==false) {
                System.out.println("Ditt ord är inte PALINDROM");
                return;
            }
            else j++;
        }
        if(i == j) System.out.println("Yes\nDitt ord är PALINDROM");
    }

    public static boolean isPalindrome3(String text) {
        text = text.toLowerCase();

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
    public static boolean isPalindrome3(int number) {
        return isPalindrome3(Integer.toString(number));
    }
}

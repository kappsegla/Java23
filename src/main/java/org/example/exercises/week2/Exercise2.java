package org.example.exercises.week2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercise2 {

    public static boolean isStrongPassword(String password) {
        if(password.length() < 10) {
            return false;
        }
        if(!password.matches("[a-z0-9]*")) {
            return false;

        }
        if(!password.matches(".*[0-9].*[0-9].*")) {
            return false;
        }
        return true;
    }


//    public static void main(String[] args) {
//        if( isStrongPassword("kalleanka23"))
//            System.out.println("Strong password");
//        else
//            System.out.println("Not okay");
//    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("skriv in ditt lösenord:");
        String password = scanner.next();
        kontrolPassword(password);
        System.out.println(kontrolPassword(password));
    }

    public static boolean kontrolPassword(String password) {
        int antalpassword = password.length();
        boolean kontroll1 = false;
        if (antalpassword >= 10)
            kontroll1 = true;
        else
            kontroll1 = false;
        boolean kontroll2 = true;
        boolean[] kontroll = new boolean[antalpassword];
        for (int i = 0; i < antalpassword; i++) {
            char tecken = password.charAt(i);
            if ((password.charAt(i) >= 'a' && password.charAt(i) <= 'z') ||
                (password.charAt(i) >= '0' && password.charAt(i) <= '9') ||
                (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z')) {
                kontroll[i] = true;
            } else {
                kontroll[i] = false;
            }
            for (int j = 0; j < antalpassword; j++) {
                if (kontroll[j] != true)
                    kontroll2 = false;
                else
                    kontroll2 = true;
            }
        }
        int antalsiffror = 0;
        boolean kontroll3 = false;
        for (int i = 0; i < antalpassword; i++) {
            char tecken = password.charAt(i);
            if (Character.isDigit(tecken))
                antalsiffror++;
        }
        if (antalsiffror >= 2)
            kontroll3 = true;
        boolean helkontroll = false;
        if (kontroll1 == true && kontroll2 == true && kontroll3 == true)
            helkontroll = true;
        else
            helkontroll = false;
        return helkontroll;

    }

    static boolean isPw(String password){
        String regex ="^(?=.*\\d.*\\d)[a-z0-9]{10,}$";
        return Pattern.matches(regex, password);
    }

    public static boolean validPassword(String password){
        if (password.length() < 10) {
            return false;
        }
        int countDigits = 0;
        for (char checkDigits : password.toCharArray()){
            if ((checkDigits >= 'a' && checkDigits <='z') || ( checkDigits >= '0' && checkDigits <='9' )){
                if (checkDigits >= '0' && checkDigits <= '9'){
                    countDigits++;
                }
            }
            else {
                return false;
            }
        }
        if (countDigits < 2){
            return false;
        }
        return true;
    }


    public static boolean isStrongPassword2(String password) {
        boolean correct = true;
        int nr = 0;
        char[] chars = password.toCharArray();

        if (chars.length < 10) {
            correct = false;
        }

        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                nr++;
            } else if ((int) chars[i] < 97 || (int) chars[i] > 122) {
                correct = false;
            }
        }
        if (nr < 2) {
            correct = false;
        }
        return correct;
    }


    public static boolean giltigPassword ( String password) {

        if (password.length() < 10) {
            return false;
        }

        int bokstavRaknare = 0;
        int sifferRaknare = 0;

        for (int i = 0; i < password.length(); i++) {

            char angivetTecken = password.charAt(i);

            if (Character.isDigit(i)){
                sifferRaknare++;
            }
            if (Character.isLetter(i)) {
                bokstavRaknare++;
            }
            else return false;
        }
        if (sifferRaknare < 2 || bokstavRaknare < 8) {
            return false;
        }
        return true;
    }

    public static boolean isValidPassword(String password){
        char [] stringToCharArr = password.toCharArray();
        int numbersInPassword = 0;
        for(char c : stringToCharArr){
            if(Character.isDigit(c)){
                numbersInPassword++;
            }
        }
        return password.length() >= 10 && password.matches("[1-9a-z]+") && numbersInPassword >= 2;
    }

}

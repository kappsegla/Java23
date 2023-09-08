package org.example.exercises.week2;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Exercise4 {

    public Scanner scanner = new Scanner(System.in);

    public String readString() {
        return scanner.nextLine();
    }

    public String readString(String[] validStrings) {
        while (true) {
            String str = scanner.nextLine();
            for (String check : validStrings)
                if (str.equals(check))
                    return str;

            System.out.println("Only valid options are: " + Arrays.toString(validStrings));
        }
    }

    public boolean readBoolean() {
        String[] yes = {"J", "j", "JA", "ja", "Y", "y", "YES", "yes"};
        String[] no = {"N", "n", "NO", "no", "NEJ", "nej"};
        while (true) {
            try {
                System.out.println("J/N?");
                String str = scanner.nextLine();
                for (String check : yes) {
                    if (str.equals(check))
                        return true;
                }
                for (String check : no) {
                    if (str.equals(check))
                        return false;
                }
            } catch (Exception e) {
                return false;
            }
        }
    }

    public boolean readBoolean2() {
        String[] alt = {"j", "n", "yes", "no", "ja", "nej", "y"};

        while (true) {
            System.out.println("J/N?");
            String str = readString(alt).toLowerCase();
            return switch (str) {
                case "j", "ja", "y", "yes" -> true;
                case "n", "nej", "no" -> false;
                default -> false;
            };
        }
    }

    public int readInt() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Endast siffror tack!");
            }
        }
    }

    public float readFloat() {
        while (true) {
            try {
                return Float.parseFloat(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Endast siffror tack!");
            }
        }
    }

    public double readDouble() {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Endast siffror tack!");
            }
        }
    }


    public static void main(String[] args) {
        Locale swedishLocale = new Locale("sv", "SE");
        Locale.setDefault(swedishLocale);
        Exercise4 exercise4 = new Exercise4();

        System.out.println("Int: " + exercise4.readInt());
        System.out.println("String: " + exercise4.readString());
        System.out.println(exercise4.readBoolean2());
        String[] alternatives = {"Java", "C#"};
        System.out.println(exercise4.readString(alternatives));
    }
}

package org.example.methods;

public class Tax {

    public static double calculateTax(int salary) {
        double normal30Percent = salary * 0.3;
        double extra10Percent = 0.0;
        double over100_000 = salary - 100000;
        if (over100_000 > 0)
            extra10Percent = over100_000 * 0.1;

        return normal30Percent + extra10Percent;
    }

    public static double calculateTaxVer2(int salary) {
        if (salary <= 100000)
            return salary * 0.3;
        else
            return 30000 + (salary - 100000) * 0.4;
    }

    public static double calculateTaxVer3(int salary) {
        return salary <= 100000 ? salary * 0.3 : 30000 + (salary - 100000) * 0.4;
    }

    public static double calculateTaxVer4(int salary){
        return salary * 0.3 + Math.max(salary - 100000, 0) * 0.1;
    }

    public static void main(String[] args) {
        System.out.println(calculateTax(40000));
        System.out.println(calculateTax(140000));
        System.out.println(calculateTaxVer2(40000));
        System.out.println(calculateTaxVer2(140000));
        System.out.println(calculateTaxVer3(40000));
        System.out.println(calculateTaxVer3(140000));
        System.out.println(calculateTaxVer4(40000));
        System.out.println(calculateTaxVer4(140000));
    }
}

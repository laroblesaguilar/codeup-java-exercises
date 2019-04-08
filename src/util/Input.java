package util;

import java.util.Scanner;

public class Input {

    private Scanner scnr;

    public Input() {
        this.scnr = new Scanner(System.in);
    }

    public String getString() {
        return scnr.next();
    }

    public String getLine() {
        return scnr.nextLine();
    }

    public boolean yesNo() {
        String compareTo = scnr.nextLine();
        while (compareTo.equals("")) compareTo = scnr.nextLine();
        return compareTo.equalsIgnoreCase("y") || compareTo.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
        return MethodsExercises.getInteger(min, max);
    }

    public double getDouble() {
        double num;
        String input = scnr.nextLine();
        try {
            num = Double.valueOf(input);
        } catch (Exception e) {
            num = getDouble();
        }
        return num;
    }


    public int getInt() {
        int num;
        String input = scnr.nextLine();
        try {
            num = Integer.valueOf(input);
        } catch (Exception e) {
            num = getInt();
        }
        return num;
    }

    public double getDouble(double min, double max) {
        return MethodsExercises.getDouble(min, max);
    }

}

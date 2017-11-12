package util;
import java.util.Scanner;

public class Console {

    private static Scanner sc = new Scanner(System.in);
    public static void printToConsole(String str) {
    		System.out.println(str);
    }
    public static String getString(String prompt) {
        System.out.print(prompt);
        String s = sc.next();  // read user entry
        sc.nextLine();
        return s;
    }
    public static boolean getBoolean(String prompt) { //adding validation to routine
    		boolean b = false;
    		boolean isValid = false;
    		while(!isValid) {
    			String s = getString(prompt); //borrowing from other method
    			if(s.equalsIgnoreCase("t") || s.equalsIgnoreCase("true")) {
    				b = true;
    				isValid = true;
    			}else if(s.equalsIgnoreCase("f") || s.equalsIgnoreCase("false")) {
    				b = false;
    				isValid = true;
    			}else {
    				System.out.println("Invalid input. T,t,F,f");
    			}
    		}
    		return b;
    }

    public static int getInt(String prompt) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("Error! Invalid integer. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return i;
    }

    public static int getInt(String prompt, int min, int max) { /////////////
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            i = getInt(prompt); //get int earlier for validation for valid integer
            if (i <= min) {
                System.out.println(
                        "Error! Number must be greater than " + min + ".");
            } else if (i >= max) {
                System.out.println(
                        "Error! Number must be less than " + max + ".");
            } else {
                isValid = true;
            }
        }
        return i;
    }

    public static double getDouble(String prompt) {
        double d = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                d = sc.nextDouble();
                isValid = true;
            } else {
                System.out.println("Error! Invalid number. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }

    public static double getDouble(String prompt, double min, double max) {
        double d = 0;
        boolean isValid = false;
        while (!isValid) {
            d = getDouble(prompt);
            if (d <= min) {
                System.out.println(
                        "Error! Number must be greater than " + min + ".");
            } else if (d >= max) {
                System.out.println(
                        "Error! Number must be less than " + max + ".");
            } else {
                isValid = true;
            }
        }
        return d;
    }
    public static String getString(String prompt, int maxLength) {
          // read user entry
        boolean isValid = false;
        String s = "";
        while(!isValid) {
        		s = getString(prompt);
        		if (s.length() > maxLength) { //gets the length of the string
        			System.out.println("Invalid input! Length must be <= " + maxLength);
        			//sc.nextLine();
        		}else {
        			isValid = true; //breaks out of while loop if user is right
        		}
        }
        return s;
    }
}
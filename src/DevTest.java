import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        //Testing getNonZeroLenString
        /*System.out.print("Testing getNonZeroLenString");
        for(int i = 0; i < 3; i++) {
            String getNonZTest = testGetNonZeroLenString();
            System.out.println("String returned: " + getNonZTest);
        }

        //Testing getInt
        System.out.print("Testing getInt");
        for(int i = 0; i < 3; i++) {
            int getIntTest = testGetInt();
            System.out.println("Value returned: " + getIntTest);
        }

        //Testing getDouble
        System.out.print("Testing getDouble");
        for(int i = 0; i < 3; i++) {
            double getDoubleTest = testGetDouble();
            System.out.println("Value returned: " + getDoubleTest);
        }

        //Testing getRangedInt
        /*System.out.println("Testing getRangedInt");
        for(int i = 0; i < 3; i++){
            int getRangedIntTest = testGetRangedInt();
            System.out.println("Value returned: " + getRangedIntTest);
        }

        //Testing getRangedDouble
        System.out.println("Testing getRangedDouble");
        for(int i = 0; i < 3; i++){
            double getRangedDoubleTest = testGetRangedDouble();
            System.out.println("Value returned: " + getRangedDoubleTest);
        }

        //Testing getYNConfirm
        System.out.println("Testing getYNConfirm");
        for(int i = 0; i < 3; i++){
            boolean getYNConfirmTest = testGetYNConfirm();
            System.out.println("Value returned: " + getYNConfirmTest);
        }*/

        //Testing getRegExString
        System.out.println("Testing getRegExString (MNum)");
        for(int i = 0; i < 1; i++){
            String getRegExStringTest = testGetRegExString();
            System.out.println("Value returned: " + getRegExStringTest);
        }
    }
    public static String testGetNonZeroLenString() {
        String message = "Input a valid string";
        Scanner in = new Scanner(System.in);
        return SafeInput.getNonZeroLenString(in, message);
    }
    public static int testGetInt(){
        String message = "Input an integer";
        Scanner in = new Scanner(System.in);
        return SafeInput.getInt(in, message);
    }
    public static double testGetDouble(){
        String message = "Input a double";
        Scanner in = new Scanner(System.in);
        return SafeInput.getDouble(in, message);
    }
    public static int testGetRangedInt(){
        String message = "Input an integer";
        Scanner in = new Scanner(System.in);
        int low, high;
        System.out.print("Input the lower bound: ");
        low = in.nextInt();
        System.out.print("Input the upper bound: ");
        high = in.nextInt();
        in.nextLine();
        return SafeInput.getRangedInt(in, message, low, high);
    }
    public static double testGetRangedDouble(){
        String message = "Input a double";
        Scanner in = new Scanner(System.in);
        double low, high;
        System.out.print("Input the lower bound: ");
        low = in.nextDouble();
        System.out.print("Input the upper bound: ");
        high = in.nextDouble();
        in.nextLine();
        return SafeInput.getRangedDouble(in, message, low, high);
    }
    public static boolean testGetYNConfirm(){
        String message = "Input Y/N";
        Scanner in = new Scanner(System.in);
        return SafeInput.getYNConfirm(in, message);
    }
    public static String testGetRegExString(){
        String message = "Input a matching string";
        Scanner in = new Scanner(System.in);
        String regExString1 = "^\\d{3}-\\d{2}-\\d{4}$";
        String regExString2 = "^(M|m)\\d{8}$";
        //return SafeInput.getRegExString(in, message, regExString1);
        return SafeInput.getRegExString(in, message, regExString2);
    }
}

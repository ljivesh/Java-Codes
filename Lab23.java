public class Lab23 {
    public static void main(String[] args) {
        // Create wrapper objects
        Integer intObj = Integer.valueOf(42);
        Double doubleObj = Double.valueOf(3.14);
        Boolean booleanObj = Boolean.valueOf(true);

        // Use wrapper objects
        int intValue = intObj.intValue();
        double doubleValue = doubleObj.doubleValue();
        boolean booleanValue = booleanObj.booleanValue();

        System.out.println("intObj = " + intObj);
        System.out.println("doubleValue = " + doubleValue);
        System.out.println("booleanObj = " + booleanObj);
        System.out.println("intValue = " + intValue);
        System.out.println("doubleValue = " + doubleValue);
        System.out.println("booleanValue = " + booleanValue);

        // Use static methods of wrapper classes
        Integer maxInt = Integer.MAX_VALUE;
        Double minDouble = Double.MIN_VALUE;
        Boolean parseBoolean = Boolean.parseBoolean("false");

        System.out.println("maxInt = " + maxInt);
        System.out.println("minDouble = " + minDouble);
        System.out.println("parseBoolean = " + parseBoolean);
    }
}

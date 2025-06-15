import java.util.StringTokenizer;

public class JavaApiExamplesApp {

    public static void main(String[] arguments) {
        mathExamples();
        stringExamples();
        stringBufferExamples();
        stringTokenizerExamples();
        wrapperClassExamples();
        bigIntegerExamples();
        bigDecimalExamples();
    }

    private static void mathExamples() {
        System.out.println("Math examples:");
        System.out.println("PI = " + Math.PI);
        System.out.println("E = " + Math.E);
        System.out.println("sqrt(4) = " + Math.sqrt(4.0));
        System.out.println("min(128, -63) = " + Math.min(128, -63));
    }

    @SuppressWarnings({"ConstantValue", "StringEquality", "StringOperationCanBeSimplified", "NewObjectEquality"})
    private static void stringExamples() {
        System.out.println("\nString examples:");
        String text = "Hello World!";
        System.out.println("Length of text: " + text.length());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Char at index 0: " + text.charAt(0));
        System.out.println("Substring (0, 5): " + text.substring(0, 5));
        System.out.println("Contains 'World': " + text.contains("World"));
        String text2 = "Hello World!";
        System.out.println("Equals text2: " + text.equals(text2));
        System.out.println("Is same object: " + (text == text2));
        String text3 = new String("Hello World!");
        System.out.println("Is same object (new String): " + (text == text3));
    }

    @SuppressWarnings("StringBufferMayBeStringBuilder")
    private static void stringBufferExamples() {
        System.out.println("\nStringBuffer examples:");
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(" World!");
        System.out.println("StringBuffer content: " + stringBuffer);
        stringBuffer.insert(5, ",");
        System.out.println("After insert: " + stringBuffer);
        stringBuffer.delete(5, 6);
        System.out.println("After delete: " + stringBuffer);
        stringBuffer.reverse();
        System.out.println("After reverse: " + stringBuffer);
    }

    private static void stringTokenizerExamples() {
        System.out.println("\nStringTokenizer examples:");
        String text = "Hello World from Java";
        StringTokenizer tokenizer = new StringTokenizer(text, " ");
        System.out.println("Token count: " + tokenizer.countTokens());
        while (tokenizer.hasMoreTokens()) {
            System.out.println("Token: " + tokenizer.nextToken());
        }
    }

    @SuppressWarnings({"UnnecessaryBoxing", "UnnecessaryUnboxing", "ConstantValue", "WrapperTypeMayBePrimitive"})
    private static void wrapperClassExamples() {
        System.out.println("\nWrapper class examples:");
        Integer intWrapper = Integer.valueOf(42);
        Double doubleWrapper = Double.valueOf(3.14);
        Boolean booleanWrapper = Boolean.valueOf(true);
        Integer intWrapperFromString = Integer.valueOf("42");
        Double doubleWrapperFromString = Double.valueOf("3.14");
        Boolean booleanWrapperFromString = Boolean.valueOf("true");
        Integer parsedIntWrapper = Integer.parseInt("42");
        Double parsedDoubleWrapper = Double.parseDouble("3.14");
        Boolean parsedBooleanWrapper = Boolean.parseBoolean("true");

        System.out.println("Integer value: " + intWrapper);
        System.out.println("Double value: " + doubleWrapper);
        System.out.println("Boolean value: " + booleanWrapper);
        System.out.println("Integer value from string: " + intWrapperFromString);
        System.out.println("Double value from string: " + doubleWrapperFromString);
        System.out.println("Boolean value from string: " + booleanWrapperFromString);
        System.out.println("Parsed Integer: " + parsedIntWrapper);
        System.out.println("Parsed Double: " + parsedDoubleWrapper);
        System.out.println("Parsed Boolean: " + parsedBooleanWrapper);

        int intPrimitive = intWrapper.intValue();
        double doublePrimitive = doubleWrapper.doubleValue();
        boolean booleanPrimitive = booleanWrapper.booleanValue();

        System.out.println("Unwrapped int: " + intPrimitive);
        System.out.println("Unwrapped double: " + doublePrimitive);
        System.out.println("Unwrapped boolean: " + booleanPrimitive);
    }

    private static void bigIntegerExamples() {
        System.out.println("\nBigInteger examples:");
        java.math.BigInteger bigInt1 = new java.math.BigInteger("123456789012345678901234567890");
        java.math.BigInteger bigInt2 = new java.math.BigInteger("987654321098765432109876543210");
        java.math.BigInteger sum = bigInt1.add(bigInt2);
        java.math.BigInteger product = bigInt1.multiply(bigInt2);
        System.out.println("BigInteger sum: " + sum);
        System.out.println("BigInteger product: " + product);
    }

    private static void bigDecimalExamples() {
        System.out.println("\nBigDecimal examples:");
        java.math.BigDecimal bigDec1 = new java.math.BigDecimal("12345678901234567890.12345678901234567890");
        java.math.BigDecimal bigDec2 = new java.math.BigDecimal("98765432109876543210.98765432109876543210");
        java.math.BigDecimal sum = bigDec1.add(bigDec2);
        java.math.BigDecimal product = bigDec1.multiply(bigDec2);
        System.out.println("BigDecimal sum: " + sum);
        System.out.println("BigDecimal product: " + product);
    }

}



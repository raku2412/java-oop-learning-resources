import java.util.StringTokenizer;

public class JavaApiExamplesApp {

    public static void main(String[] arguments) {
        mathExamples();
        stringExamples();
        stringBufferExamples();
        stringTokenizerExamples();
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

}



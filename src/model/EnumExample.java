package model;

public enum EnumExample {
    UNKNOWN(0),
    SMALL(1, "Small size"),
    MEDIUM(2, "Medium size"),
    LARGE(3, "Large size");

    private final int code;
    private final String description;

    private static final String CATEGORY = "Size";

    EnumExample(int code, String description) {
        this.code = code;
        this.description = description;
    }

    EnumExample(int code) {
        this(code, "No description available");
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static String getCategory() {
        return CATEGORY;
    }

    public String getFormattedDescription() {
        return String.format("%s (%d)", description, code);
    }
}

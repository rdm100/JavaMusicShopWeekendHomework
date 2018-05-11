package Enums;

public enum InstrumentType {

    WOODWIND("Woodwind"),
    KEYBOARD("Keyboard"),
    BRASS("Brass"),
    STRING("String");

    public String type;

    InstrumentType(String type) {

    }
    public String getType() {
        return type;
    }

}
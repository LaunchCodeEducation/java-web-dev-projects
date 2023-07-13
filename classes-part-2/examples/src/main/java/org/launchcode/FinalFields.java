package org.launchcode;

//This code will not run - that is intentional. This is to help you explore access modifiers and fields

//TODO: remove the /* (line 7) and */ (line 36) to explore the code

/*
public class FinalFields {
    public final int intValue = 42;
    public final double doubleValue;
    public final FortyTwo objectValue = new FortyTwo();

    public static void main(String[] args) {

        FinalFields demo = new FinalFields();

        // This would result in a compiler error
        demo.intValue = 6;

        // This would result in a compiler error
        demo.doubleValue = 42.0;

        // This would result in a compiler error
        demo.doubleValue = 6.0;

        // This would result in a compiler error, since we're trying to
        // give objectValue a different object value
        demo.objectValue = new FortyTwo();

        // However, this is allowed since we're changing a field
        // inside the final object, and not changing which object
        // objectValue refers to
        demo.objectValue.intValue = 6;
    }
}
*/
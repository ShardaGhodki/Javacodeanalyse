public void ignoreReturnValue() {
    "Hello".toUpperCase();
}
public void nestedControlFlow(boolean condition1, boolean condition2, boolean condition3) {
    if (condition1) {
        if (condition2) {
            if (condition3) {
                System.out.println("All conditions met");
            }
        }
    }
}
public String concatenateStrings(List<String> strings) {
    String result = "";
    for (String str : strings) {
        result += str;
    }
    return result;
}
public void printLength(String str) {
    if (str == null) {
        System.out.println("String is null");
    }
    System.out.println("Length: " + str.length());
}
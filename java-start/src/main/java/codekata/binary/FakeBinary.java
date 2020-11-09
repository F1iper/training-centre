package codekata.binary;

public class FakeBinary {

    public static String fakeBin(String someNumber) {
        return someNumber.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");

    }

    public static void main(String[] args) {
        System.out.println(fakeBin("1234567890"));
    }
}

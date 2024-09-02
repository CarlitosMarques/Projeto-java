public class Main {
    public static void main(String[] args) {
        byte numByte = 10;
        short numShort;
        int numInt;
        long numLong;

        numShort = numByte;
        numInt = numShort;
        numLong = numInt;

        System.out.println(numLong);

        numInt = 150;

        numShort = (short) numInt;
        System.out.println(numShort);

        numByte = (byte) numShort;
        System.out.println(numByte);

        var numInteiro = 10;
        var numDecimal = 10.0;
        var numFloat = 10f;
        var numIntLong = 10L;

    }
}
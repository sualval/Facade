public class BinOps {

    public String sum(String a, String b) {
        return Integer.toBinaryString(binStr(a) + binStr(b));
    }

    public String mult(String a, String b) {
        return Integer.toBinaryString(binStr(a) * binStr(b));
    }

    private int binStr(String binStr) {
        return Integer.parseInt(binStr, 2);
    }
}


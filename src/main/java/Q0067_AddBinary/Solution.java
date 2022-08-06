package Q0067_AddBinary;

import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        StringBuilder stringBuilder = new StringBuilder();
        int c = 0;
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0 || c > 0; i--, j--) {
            int bitA = i >= 0 ? a.charAt(i) - '0' : 0, bitB = j >= 0 ? b.charAt(j) - '0' : 0;
            int out = bitA + bitB + c;
            c = out / 2;
            out %= 2;
            stringBuilder.append(out == 0 ? "0" : "1");
        }
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

    // No addition op
    public String addBinary2(String a, String b) {
        BigInteger x = new BigInteger(a, 2), y = new BigInteger(b, 2);
        while (y.compareTo(BigInteger.ZERO) != 0) {
            BigInteger out = x.xor(y);
            BigInteger c = x.and(y).shiftLeft(1);
            x = out;
            y = c;
        }
        return x.toString(2);
    }
}
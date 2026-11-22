import java.util.*;

class Solution {
    public String fractionToDecimal(int numerator, int denominator) {

        if (numerator == 0)
            return "0";

        StringBuilder res = new StringBuilder();

        if ((numerator < 0) ^ (denominator < 0))
            res.append("-");

        long num = Math.abs((long) numerator);
        long de = Math.abs((long) denominator);

        res.append(num / de);

        long remainder = num % de;

        if (remainder == 0)
            return res.toString();

        res.append(".");

        HashMap<Long, Integer> map = new HashMap<>();

        while (remainder != 0) {

            if (map.containsKey(remainder)) {
                res.insert(map.get(remainder), "(");
                res.append(")");
                break;
            }

            map.put(remainder, res.length());

            remainder *= 10;

            res.append(remainder / de);

            remainder %= de;
        }

        return res.toString();
    }
}
class Solution {
    public String maskPII(String s) {
        s = s.toLowerCase();

        if(s.contains("@")) {
            int i = s.indexOf('@');
            return s.charAt(0) + "*****" + s.substring(i-1);
        }

        String num = "";
        for(char c : s.toCharArray()) {
            if(Character.isDigit(c))
                num += c;
        }

        String ans = "";
        int n = num.length();

        if(n > 10) {
            ans = "+";
            for(int i = 0; i < n-10; i++)
                ans += "*";
            ans += "-";
        }

        ans += "***-***-" + num.substring(n-4);

        return ans;
    }
}
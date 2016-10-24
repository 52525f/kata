public class CountAndSay {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        } else {
            String s = countAndSay(n - 1);
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (i < s.length()) {
                char c = s.charAt(i);
                int j = 1;
                while (i+j < s.length() && s.charAt(i+j) == c) {
                    j++;
                }
                sb.append(Integer.toString(j));
                sb.append(c);
                i += j;
            }
            return sb.toString();
        }
    }
}

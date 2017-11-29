public class CountAndSay {
    public static String countAndSay(int a) {
        String s = "1";
        while (--a > 0) {
            s = compute(s);
        }
        return s;
    }

    public static String compute(String s) {
        String result = "";
        int n = 1;
        int i = 0;
        for (i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                n++;
            } else {
                result += n + "" + s.charAt(i);
                n = 1;
            }
        }
        result += n + "" + s.charAt(i);
        return result;
    }

    public static void main(String[] args) {
        String s = countAndSay(12);
        System.out.println(s);
    }
}

public class Main {
    public static String[] strings;

    public static void main(String[] args) {
        strings = new String[6];
        strings[0] = "abc";
        strings[1] = "def";
        strings[2] = "abc";
        strings[3] = "ghi";
        strings[4] = "def";
        strings[5] = "xyz";

        for (int i = 0; i < strings.length; i++) {
            String iString = strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if (iString == null) {
                    break;
                } else if (iString.equals(strings[j])) {
                    strings[j] = null;
                }
            }
        }
        StringBuilder resultString = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] != null) {
                resultString.append(strings[i]);
            }
        }
        System.out.println("resultString = " + resultString);
    }
}
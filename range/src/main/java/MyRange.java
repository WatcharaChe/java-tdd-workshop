public class MyRange {
    public String of(String input) {
        String ans = "";
        int lastNumber = getLastNumber(input);
        for (int i = getFirstNumber(input); i <= lastNumber; i++) {
            ans += i;
        }
        return ans;
    }

    public int getLastNumber(String input) {
        return isก้ามปูปิด(input) ? Character.getNumericValue(input.charAt(3)) : Character.getNumericValue(input.charAt(3)) - 1;

    }

    public boolean isก้ามปูปิด(String input) {
        return input.endsWith("]");
    }

    public int getFirstNumber(String input) {
        return isก้ามปูเปิด(input) ? Character.getNumericValue(input.charAt(1)) : Character.getNumericValue(input.charAt(1)) + 1;
    }

    public boolean isก้ามปูเปิด(String input) {
        return input.startsWith("[");
    }
}

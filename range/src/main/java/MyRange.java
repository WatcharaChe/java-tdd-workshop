public class MyRange {
    public String of(String input) {
        return null;
    }

    public int getLastNumber(String input) {
        return 0;
    }

    public boolean isก้ามปูปิด(String input) {
        return false;
    }

    public int getFirstNumber(String input) {
        return isก้ามปูเปิด(input) ? Integer.valueOf(input.indexOf(",") - 1) : Integer.valueOf(input.indexOf(",") - 1) + 1;
    }

    public boolean isก้ามปูเปิด(String input) {
        return input.startsWith("[");
    }
}

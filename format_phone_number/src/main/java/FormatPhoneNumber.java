public class FormatPhoneNumber {

    public String removeNonDigit(String input) {
        return input.replaceAll("-| ", "");
    }

    public String solution(String input) {
        String formatPhoneNumber[] = input.split("(?<=\\G...)");
        int length = formatPhoneNumber.length;
        String ans = "";
        for (int i = 0; i < length; i++) {
            ans += formatPhoneNumber[i] + "-";
        }
        return ans.substring(0,ans.length()-1);
    }

}

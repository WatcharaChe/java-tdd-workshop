public class FormatPhoneNumber {

    public String removeNonDigit(String input) {
        return input.replaceAll("-| ", "");
    }

    public String solution(String input) {
        input = removeNonDigit(input);
        String formatPhoneNumber[] = input.split("(?<=\\G...)");
        int length = formatPhoneNumber.length;
        String ans = "";
        for (int i = 0; i < length; i++) {
            ans += formatPhoneNumber[i] + "-";
        }
        ans = ans.substring(0, ans.length() - 1);
        String result = ans;
        if (length % 3 == 1) {
            String temp = ans.substring(ans.length() - 3);
            temp = temp.replaceAll("-","");
            System.out.println(temp);
            result = ans.substring(0, ans.length() - 3) + "-" + temp;
        }
        return result;
    }

}

package reverseLetter;

public class reverse_letter {
    public static String LetterReverser(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        char[] chars = input.toCharArray();
        int left = 0;//проверка слево направо
        int right = chars.length - 1;//проверка справо налево

        while (left < right) {
            while (left < right && !Character.isLetter(chars[left])) {
                left++;
            }
            while (left < right && !Character.isLetter(chars[right])) {
                right--;
            }

            char tmp = chars[left];
            chars[left] = chars[right];
            chars[right] = tmp;

            left++;
            right--;
        }

        return new String(chars);
    }
}
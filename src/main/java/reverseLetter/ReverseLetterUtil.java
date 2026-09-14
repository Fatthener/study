package reverseLetter;

public final class ReverseLetterUtil {
    public static String reverse(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        char[] chars = input.toCharArray();
        int leftPointer = 0;//указатель, двигающийся налево
        int rightPointer = chars.length - 1;//указатель, двигающийся направо

        while (leftPointer < rightPointer) {
            while (leftPointer < rightPointer && !Character.isLetter(chars[leftPointer])) {
                leftPointer++;
            }
            while (leftPointer < rightPointer && !Character.isLetter(chars[rightPointer])) {
                rightPointer--;
            }

            char tmp = chars[leftPointer];
            chars[leftPointer] = chars[rightPointer];
            chars[rightPointer] = tmp;

            leftPointer++;
            rightPointer--;
        }

        return new String(chars);
    }
}
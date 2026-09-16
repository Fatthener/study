import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import reverseLetter.ReverseLetterUtil;

class ReversLetterTest {

    private final ReverseLetterUtil reverseLetterUtil = new ReverseLetterUtil();

    @Test
    @DisplayName("Обычный случай")

    void reversesOnlyLetters() {
        String result = reverseLetterUtil.reverse("J@va the be$t123!");
        assertEquals("t@eb eht av$J123!", result);
    }

    @Test
    @DisplayName("Пустая строка")

    void isEmptyStr() {
        String result = reverseLetterUtil.reverse("");
        assertEquals("", result);
    }


    @Test
    @DisplayName("Одна буква")

    void itsOnlyOneLetter() {
        String result = reverseLetterUtil.reverse("J");
        assertEquals("J", result);
    }


    @Test
    @DisplayName("Строка без букв")

    void strWithoutLetter() {
        String result = reverseLetterUtil.reverse("123");
        assertEquals("123", result);
    }


    @Test
    @DisplayName("Только буквы")

    void strOnlyLetter() {
        String result = reverseLetterUtil.reverse("Java");
        assertEquals("avaJ", result);
    }


    @Test
    @DisplayName("Небуквенные символы по краям и в середине")

    void chrLeftAndRightBorder() {
        String result = reverseLetterUtil.reverse("1Ja1a1");
        assertEquals("1aa1J1", result);
    }


    @Test
    @DisplayName("Регистр")

    void upperLowerCase() {
        String result = reverseLetterUtil.reverse("1JAVA3");
        assertEquals("1AVAJ3", result);
    }

}

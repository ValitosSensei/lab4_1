package lab4;

public class PalindromeChecker {

    public static boolean isPalindrome(String word) {
        // Видаляємо пробіли та перетворюємо все на нижній регістр
        String cleanedWord = word.replaceAll("\\s", "").toLowerCase();

        // Створюємо обернений рядок
        String reversedWord = new StringBuilder(cleanedWord).reverse().toString();

        // Порівнюємо оригінальний та обернений рядки
        return cleanedWord.equals(reversedWord);
    }

    public static void main(String[] args) {
        // Приклад використання
        String testWord = "level";
        if (isPalindrome(testWord)) {
            System.out.println(testWord + " є паліндромом.");
        } else {
            System.out.println(testWord + " не є паліндромом.");
        }
    }
}

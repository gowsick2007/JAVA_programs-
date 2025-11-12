public class LastWordLength {
    public static void main(String[] args) {
        String input = "   Java is awesome   ";

        // Remove spaces at the beginning and end
        input = input.trim();
System.out.println(input);
        // Split the sentence into words using space as separator
        String[] words = input.split(" ");
System.out.println(words);
        // Get the last word
        String lastWord = words[words.length - 1];

        // Print the length of the last word
        System.out.println("Length of the last word: " + lastWord.length());
    }
}

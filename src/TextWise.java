public class TextWise {
    static String reverse(String input){
        if (input.length() <= 1) return input;
        return reverse(input.substring(1)) + input.charAt(0);
    }

    public static void main(String[] args) {
        String input = "hello world!", output = reverse(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + output);
    }

}

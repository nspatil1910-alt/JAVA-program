public class AlphabetChecker {
    public static void main(String[] args) {
        char ch = 'A';
       
	   String result = (Character.isLetter(ch)) ? "Alphabet" : "Not an Alphabet";

        System.out.println("Output : " + result);
    }
}

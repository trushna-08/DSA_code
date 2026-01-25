public class PangramCheck {

    public static boolean isPangram(String sentence) {

        boolean [] letters = new boolean[26];

        sentence = sentence.toLowerCase();

        for(int i =0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if(ch >= 'a' && ch <= 'z') {
                letters[ch - 'a'] = true;
            }
        }

        for(boolean present : letters) {
            if (!present) {
                return false;
            }
        }

        return true;
        
    }
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog ";

        if (isPangram(str)) {
            System.out.println("Pangram");
        } 
        else 
        {
            System.out.println("Not Pangram");
        }
       
    }
}

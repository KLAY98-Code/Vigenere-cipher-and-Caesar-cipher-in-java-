public class Caesar {
   
    public String crypter(int cle, String message) {
        String tmp = "";
        for (int i = 0; i < message.length(); i++) {
            int charCode = message.charAt(i);
            charCode -= 65;
            charCode = (charCode + cle) % 26;
            charCode += 65;
            tmp += (char) charCode;
        }
        return tmp;
    }
    
    public String derypter(int cle, String message) {
        String tmp = "";
        for (int i = 0; i < message.length(); i++) {
            int charCode = message.charAt(i);
            charCode -= 65;
            charCode = (charCode - cle) % 26;
            charCode += 65;
            tmp += (char) charCode;
        }
        return tmp;
    }
    
}

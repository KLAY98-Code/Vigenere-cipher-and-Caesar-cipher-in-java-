public class vigenere {
    public static char[][] tv = new char [26][26] ;
    public  static String key0 = new String("") ;
    //make table 
    public static void mktv(){
     for(int i=0;i<26;i++){
         for(int j=i;j<i+26;j++){
             int a = j+65;
             if (a>90){
                 tv[i][j-i] = (char)(a%90+64);
             }else{
                tv[i][j-i] = (char)a;
             }
         }
     }   
    }
    public static void mkeyword(int n){
        char mk[]={'G','O','O','G','L','E'};
        for(int i=0;i<n;i++){
            key0 = key0 + Character.toString(mk[i%6]);
        }
    }
     // cryptage
     public  static String encr(String pt){
        char [] enc1=pt.toCharArray();
        char[] charArraykey0 = key0.toCharArray();
        String enc2 = new String("");
        for(int i=0;i<pt.length();i++){
            int j=charArraykey0[i];
            int a = j-65;
            int b = enc1[i];
            b=b-65;
            enc2 =enc2 + Character.toString(tv[a][b]);
        }
        return enc2;
    }
     // decryptage 
     public static String dencr (String encpt){
        char [] denc1=encpt.toCharArray();
        char[] dcharArraykey0 = key0.toCharArray();
        String denc2 = new String("");
        for(int k=0;k<key0.length();k++){
            int i=denc1[k];
            int b=0;
            i = i-65;
            for(int j=0;j<26;j++){
                if (tv[i][j]==dcharArraykey0[k]){
                    b=j;
                    break;
                }
            }
                denc2 = denc2 + Character.toString((char)(b+65));
            }
        
        return denc2;
     }


}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
public class Tp3 {
    
    static Caesar cesar = new Caesar();
    static int cle = 3 ;
    static String msg = "";
    static String decyted = "";
    static String cipher = "";  
    //public  static String key0 = new String("") ;
    public static void main(String[] args) throws Exception {
        
        FileReader reader = new FileReader(new File("E:\\2MSIR\\S.SY.I (Benahmed.K)\\TP03(Cryptage des fichiers textuels Partie I)\\CypteDecryptefile\\Plaintext.txt"));
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            msg += line;
        }
        reader.close();
        System.out.println("Message crypter caesar Method: ");
        System.out.print("enter a key to decrypt the message :");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int key = Integer.parseInt(br.readLine());

        // cryptage 
        System.out.println(" ");
        System.out.println("Message : " + msg);
        cipher = cesar.crypter(key, msg);
       System.out.println("Message crypter: " + cipher);
     BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("E:\\2MSIR\\S.SY.I (Benahmed.K)\\TP03(Cryptage des fichiers textuels Partie I)\\CypteDecryptefile\\encryptedFile.txt"));
        bufferedWriter.write(cipher);
        bufferedWriter.close();
        System.out.println(" The crypted file sroted at  : " + "encryptedFile.txt" );
        // decryptage 
        System.out.println(" ");
        decyted = cesar.derypter(key, cipher);
        BufferedWriter bufferedWrite0 = new BufferedWriter(new FileWriter("E:\\2MSIR\\S.SY.I (Benahmed.K)\\TP03(Cryptage des fichiers textuels Partie I)\\CypteDecryptefile\\DencryptedFile.txt"));
        bufferedWrite0.write(decyted);
        bufferedWrite0.close();
        System.out.println(" The decrypted file sroted at  : " + "DencryptedFile.txt" );
        System.out.println(" ");
        bufferedWrite0.close();
        //////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Message crypter vigener Method: "+ msg.length());
         reader= new FileReader(new File("E:\\2MSIR\\S.SY.I (Benahmed.K)\\TP03(Cryptage des fichiers textuels Partie I)\\CypteDecryptefile\\Plaintext.txt"));
         bufferedReader = new BufferedReader(reader);
        String line1;
        while ((line1 = bufferedReader.readLine()) != null) {
            
			msg += line1;
        }
        reader.close();
          // cryptage 
        vigenere.mktv();
        vigenere.mkeyword(msg.length());
        cipher = vigenere.encr(msg);
        System.out.println("Message crypter: " + cipher);
        bufferedWriter = new BufferedWriter(new FileWriter("E:\\2MSIR\\S.SY.I (Benahmed.K)\\TP03(Cryptage des fichiers textuels Partie I)\\CypteDecryptefile\\encryptedFile -vegener.txt"));
        bufferedWriter.write(cipher);
        bufferedWriter.close();
        System.out.println(" The crypted file sroted at  : " + "encryptedFile -vegener.txt.txt" );

        // decryptage 
        decyted = vigenere.dencr(cipher);
     bufferedWrite0 = new BufferedWriter(new FileWriter("E:\\2MSIR\\S.SY.I (Benahmed.K)\\TP03(Cryptage des fichiers textuels Partie I)\\CypteDecryptefile\\DencryptedFile - vegener.txt"));
     bufferedWrite0.write(decyted);
     bufferedWrite0.close();
     System.out.println(" The decrypted file sroted at  : " + "DencryptedFile - vegener.txt" );
     System.out.println(" ");
     bufferedWrite0.close();


    }
    
}

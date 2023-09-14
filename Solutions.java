import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'decryptMessage' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING encryptedMessage as parameter.
     */

    public static String decryptMessage(String encryptedMessage) {
        String[] s = encryptedMessage.split( " " );
        String decrypt ="";
        for(int i=s.length-1;i>=0;i--){
            String str = s[i]+" ";
            for(int j=0;j<str.length()-1;j++){
                String s1 = str.substring(j, j+1);
                if(s1.equals("1") || s1.equals("2") || s1.equals("3")||s1.equals("4")||s1.equals("5")||s1.equals("6")||s1.equals("7")||s1.equals("8")||s1.equals("9")){
                                    
                    for(int k=1;k<Integer.parseInt(s1);k++){
                        decrypt=decrypt+str.substring(j-1, j);
                    }
                }else{
                     decrypt=decrypt+s1;                }
            }
            decrypt=decrypt+" ";
        }
        
        return decrypt.substring(0, decrypt.length()-1);
        
    }

}

public class Solutions {
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        Scanner sc = new Scanner(System.in);
         
        String encryptedMessage = sc.nextLine();

        String result = Result.decryptMessage(encryptedMessage);
        System.out.println(result);

        // bufferedWriter.write(result);
        // bufferedWriter.newLine();

        // bufferedReader.close();
        // bufferedWriter.close();
    }
}

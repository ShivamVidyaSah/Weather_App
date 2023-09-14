import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;


public class check{


    public boolean isfound(String s){
        Pattern pattern = Pattern.compile("^[0-9]",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);
        boolean found = matcher.find();
        if(found){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        check ch = new check();
        boolean bool = ch.isfound(s);
        if(bool){
            System.out.println("Match found");
        }else{
            System.out.println("Match not found");
        }
        // String s1 = args[1];
        // String s2 = args[0];
        // // String s3 = args[3];
        // System.out.println(s2);
        
        // for(int i =0;i<args.length;i++){
        //     System.out.println(args[i]);
        // }


        // String [][] argCopy = new String[2][2];
        // int x;
        // argCopy[0] = args;
        // x = argCopy[0].length;
        // for (int y = 0; y < x; y++) 
        // {
        //     System.out.print(" " + argCopy[0][y]);
        // }


    // int [] [] [] x = new int [3] [] [];
    // int i, j;
    // x[0] = new int[4][];
    // x[1] = new int[2][];
    // x[2] = new int[5][];
    // for (i = 0; i < x.length; i++)
    // {
    //     for (j = 0; j < x[i].length; j++) 
    //     {
    //         x[i][j] = new int [i + j + 1];
    //         System.out.println("size = " + x[i][j].length);
    //     }
    // }

    //Regular Expression
    }
}
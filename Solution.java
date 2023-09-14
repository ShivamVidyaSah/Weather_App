import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        // String new_String="";
        // int count = 0;
        // int c=0;
        // for(int i=0;i<s.length();i++){
        //     char ch = s.charAt(i);
            
        //     if(ch == ' ' || ch == '!' || ch == '?' || ch==',' ||ch =='.' || ch == '_' || ch == '\'' || ch == '@'){
                
        //         c++;
        //         if(c>1){
        //         continue;
        //         }else{
                    
        //             new_String="";
        //         }
                
        //     }else{
        //         new_String = new_String+Character.toString(ch);
        //         c=0;
        //         if(new_String.length()==1){
        //             count++;   
        //         }else{
        //             continue;
                    
        //         }
        //     }
        // }
        // System.out.println(count);
        
        // for(int i=0;i<s.length();i++){
        //     char ch = s.charAt(i);
            
        //     if(ch == ' ' || ch == '!' || ch == '?' || ch==',' ||ch =='.' || ch == '_' || ch == '\'' || ch == '@'){
               
        //         c++;
        //         if(c>1){
        //         continue;
        //         }else{
        //             if(new_String==""){
        //                 continue;
        //             }else{
        //             System.out.println(new_String);
        //             new_String="";
        //             }
        //         }
        //     }else{
        //         new_String = new_String+Character.toString(ch);
        //         c=0;
        //         if(new_String.length()==1){
        //             count++;   
        //         }else{
        //             continue;
                    
        //         }
        //     }
        // }
        
        String [] str = s.trim().split("[ , ?.@'!#%^&*_-`~:;]+");
        System.out.println(str.length);
       
        for (String i: str){
          
            System.out.println(i);
        }
        
        scan.close();
    }
}

// 6523807844
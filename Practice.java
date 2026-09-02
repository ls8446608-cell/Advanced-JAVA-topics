//--------------------Recursion Problems---------------------//

import java.util.*;

//-------Q-1__ Print numbers n to 1--------//


public static void printNum(int n){
    //--------base-case--------//
    if(n<=1){
        return;
    }

    System.out.println(n);
    //-------recursion---------//
     printNum(n-1);
}







public class Practice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //---------Execute-1---------//

        int n = sc.nextInt();
        printNum(n);
        
    }
    
}

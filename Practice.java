
import java.util.*;
import java.util.ArrayList;

public class Practice {

    //--------------------Recursion Problems---------------------//
    //-------Q-1__ Print numbers n to 1--------//
    public static void printNum(int n) {
        //--------base-case--------//
        if (n < 1) {
            return;
        }

        System.out.println(n);
        //-------recursion---------//
        printNum(n - 1);
    }

    //-------Q-2__sum of first n natural numbers---------//
    public static void calculateSum(int n, int i, int result) {
        if (i == n) {
            result += i;
            System.out.println(result);
            return;
        }

        result += i;

        calculateSum(n, i + 1, result);

    }

    //------Q-3__factorial of a number n-------//
    public static long printFacto(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        long nmin1 = (printFacto(n - 1));
        long result = n * nmin1;
        return result;

    }

    //------Q-4__fibonacci sequence till nth term------//
    public static void printFibo(int n, int a, int b) {
        if (n == 0) {
            return;
        }

        int result = a + b;
        System.out.println(result);

        printFibo(n - 1, b, result);
    }

    //-------Q-5__x^n (with stack height = n)-------//
    public static int xPowerN(int x, int n) {
        // int power;
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }

        int x_ = xPowerN(x, n - 1);
        int xn = x * x_;

        // if(%2==0){
        //      power = xPowerN(x, n/2)*xPowerN(x , n/2) ;
        // }else{
        //     power = xPowerN(x, n/2)*xPowerN(x , n/2)*x ;
        // }
        return xn;

    }

    //------Q-6__Tower of Hanoi------//
    public static void towerOfHanoi(int n, String src, String dest, String helper) {
        if (n == 1) {
            System.out.println("move disk " + n + "from " + src + "to " + dest);
            return;
        }
        towerOfHanoi(n - 1, src, helper, dest);
        System.out.println("move disk " + n + "from " + src + "to " + dest);
        towerOfHanoi(n - 1, helper, dest, src);
    }

    //---------Q-7__Print reverse of String----------//
    public static void printRev(int idx, String str, String newString) {
        if (idx < 0) {
            System.out.println(newString);
            return;

        }
        char current = str.charAt(idx);
        printRev(idx - 1, str, newString + current);
    }

    //-------Q-8__Find first and last occurrence of a character in a string-------//

    public static int first = -1;
    public static int last = -1;
    public static void firstAndLastOccurence(int idx, String str, char element) {
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char current = str.charAt(idx);
        if (current == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        firstAndLastOccurence(idx + 1, str, element);
        
        if(first == -1 &&last == -1){
            System.out.println("Element not found");
            
            
            
        }
    }


    //------Q-9__Find array is sorted or not-------//

    public static boolean isSorted(int arr[], int idx) {
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]<=arr[idx+1]){
            return isSorted(arr, idx+1);
        } 
        
        return false;
    }


    //-------Q-10__Move all n to the end of the string-------//

    public static void moveAllNToEnd(int idx, String str, String newString, char ele , int count){
        
        if(idx==str.length()){
            for(int i =0; i<count; i++){
                newString += ele;
            }
            System.out.println(newString);
            return;

        }
        if(str.charAt(idx) ==ele){
            count++;

        }else{
            newString += str.charAt(idx);
        }
        moveAllNToEnd(idx+1, str, newString, ele, count);
    }



    //-------Q-11__find permutation of a string--------//

    public static void findPermutation(String str , String permuted ){
        if(str.length()==0){
            System.err.println(permuted);
            return;
        }

    
        for(int i =0; i<str.length();i++){
            char current = str.charAt(i);
            String newString = str.substring(0,i) + str.substring(i+1);
            findPermutation(newString , permuted+current );
        }
    }



    //------Q-12__Remove duplicates from String-------//


    public static boolean map[] = new boolean [26];

    public static void removeDupe(int idx , String str, String newString){
        if(idx==str.length()){
            System.err.println(newString);
            return;

        }

        char current = str.charAt(idx);
        if(map[current-'a']){
            removeDupe(idx+1, str, newString);
            
            
            
        }else{
            newString+=current;
            map[current-'a']=true;
            removeDupe(idx+1, str, newString);
        }
    }


    //------Q-13__Print uniqe subSeqences form String-------//


    public static void subSeqences(int idx, String str , String newString,HashSet<String>set){
        if(idx ==str.length()){
            if(set.contains(newString)){
                return;
                
            }else{
                System.out.println(newString);
                set.add(newString);
                return;

            }
            
        }
        char current = str.charAt(idx);
         
        //to be
        subSeqences(idx+1, str, newString+current,set);
        //to not to be
        subSeqences(idx+1, str, newString,set);
    }


    //------Q-14___Print Combinations of Kepad phone-------//


    public static String[] keyPad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printComb(int idx, String str, String combinations){
        if(idx==str.length()){
            System.err.println(combinations);
            return;
        }
         char current= str.charAt(idx);

         String mapping = keyPad[current-'0'];
         for(int i=0; i<mapping.length(); i++){
            printComb(idx+1, str, combinations+mapping.charAt(i));

         }
    }




    //-----Q-15__count the number of Paths to reach the end of the maze-------//


    public static int countPath(int i , int j, int n,int m){
        if(i==n-1 && j==m-1){
            return 1;
        }
        if(i>=n || j>=m){
            return 0;
        }
         

        int down = countPath(i+1, j,n,m);
        int right = countPath(i, j+1, n,m);
        return down+right;

    }


    //------Q-16__count ways to tilling in n*m grid with 1*m tile--------//


    public static int countWays(int n, int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }

        //--way 1-----

        int way1 = countWays(n-1, m);

        //---way 2----
         int way2 = countWays(n-m, m);

         return way1+way2;
    }



    //-----Q-17__Friends pairing problem-------//


    public static int findPair(int n){
        if(n<=1){
            return 1;
        }

        //  if comes single ---
        int way1 =findPair(n-1);

        // if comes in pair-----

        int way2 =(n-1)*findPair(n-2);

        return way1+way2;
    }



    //------Q-18__Subsets of a set-------//

    public static void printSubset(ArrayList<Integer>subSet){
        for(int i=0; i<subSet.size();i++){
            System.out.print(subSet.get(i));
        }
        System.out.println();
        
        return;
    }

    public static void findSubset(int n , ArrayList<Integer>subSet){
        if(n==0){
            
            printSubset(subSet);
            return;

        }

        //if wants to come--
        subSet.add(n);
        findSubset(n-1, subSet);

        //if not wants to come--
        subSet.remove(subSet.size()-1);
        findSubset(n-1,subSet);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //---------Execute-1---------//
        // int n = sc.nextInt();
        // printNum(n);
        //---------Execute-2--------//
        // int n = sc.nextInt();
        // calculateSum(n, 0, 0);
        //--------Execute-3---------//
        // int n = sc.nextInt();
        // long result = printFacto(n);
        // System.out.println(result);
        //--------Execute-4---------//
        // int n = sc.nextInt();
        // System.out.println("0");
        // System.out.println("1");
        // printFibo(n - 2, 0, 1);
        //--------Execute-5----------//
        // int x = sc.nextInt();
        // int n = sc.nextInt();
        // int result =xPowerN(x, n);
        // System.out.println(result);
        //--------Execute-6----------//
        // int n = sc.nextInt();
        // towerOfHanoi(n, "S", "D", "H");
        // -------Execute-7----------//
        // String str = sc.nextLine();
        // int idx= str.length()-1;
        // printRev(idx , str , "");
        // -------Execute-8----------//
        // String str = "akdkjdksjfkejfj";
        // char element = 'j';
        // firstAndLastOccurence(0, str, element);

        // -------Execute-9----------//

        // int arr[] = { 1, 2, 4, 4, 5 };
        // System.out.println(isSorted(arr, 0));
        // sc.close();

        // -------Execute-10----------//

        // String str = "abcxdxhdgxsgdxdsxs";
        // moveAllNToEnd(0, str, "", 'x', 0);

        //---------Execute-11----------//

        // String str = "HTH";
        // findPermutation(str , " " );


        //---------Execute-12----------//

        // String str= "abacdcad";
        // removeDupe(0, str, "");



        
        //---------Execute-13----------//

        // String str= "aaa";
        // HashSet<String> set = new HashSet<>();
        // subSeqences(0, str,"" ,set);

        
        
        //---------Execute-14----------//

        // String str="233";
        // printComb(0, str, "");


        //---------Execute-15----------//


        // int n = 3;
        // int m= 4;
        // System.out.println(countPath(0, 0, n, m));


        //---------Execute-16-----------//


        // int n = 4;
        // int m= 2;

        // System.out.println(countWays(n,m));



        

        //---------Execute-17-----------//


        // int n= 5;
        // System.out.println(findPair(n));


        
        //---------Execute-18-----------//

        int n= 4;
        ArrayList<Integer> subSet = new ArrayList<>();
        findSubset(n,subSet);

    }

}

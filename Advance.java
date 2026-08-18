
// ---------------------------------- DAY-1 ----------------------------------//
// import java.util.Arrays;
// import java.util.Scanner;
// public class Main {
// public static void printHw() {
// System.out.println("hello world");
// }
// public static void printName(String name) {
// System.out.println(name);
// }
// public static void printSum(int a, int b) {
// int sum = a + b;
// System.out.println(sum);
// }
// public static void main(String[] args) {
// System.out.println("Hello, World!");
// --------------------Arrays-------------------//
// int[] marks = { 93, 44, 57, 96, 69 };
// System.out.println(marks[0]);
// Arrays.sort(marks);
// System.out.println(marks[0]);
// -----------------------Inputs----------------------------//
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter Your Age:");
// System.out.println("Enter Your Name:");
// int age = sc.nextInt();
// String name = sc.next();
// System.out.println(age);
// System.out.println(name);
// sc.close();
// ---------------------Conditional Statement---------------//
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the Value :");
// boolean isSunUp = sc.nextBoolean();
// if (isSunUp == true) {
// System.out.println("day");
// } else {
// System.out.println("Night");
// }
// sc.close();
// --------------------Switch Case----------------------//
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter The Day :");
// int day = sc.nextInt();
// switch (day) {
// case 1:
// System.out.println("Monday");
// break;
// case 2:
// System.out.println("Tuesday");
// break;
// case 3:
// System.out.println("Wednesday");
// break;
// case 4:
// System.out.println("Thursday");
// break;
// case 5:
// System.out.println("Friday");
// break;
// case 6:
// System.out.println("Saturday");
// break;
// case 7:
// System.out.println("Sunday");
// break;
// default:
// System.out.println("sunday");
// break;
// }
// sc.close();
// ---------------Loops----------------------//
// for(int i =10; i>=1; i-=2){
// System.out.println(i);
// }
// int i = 10;
// while (i>=1) {
// System.out.println(i);
// i-=3;
// }
// Scanner sc = new Scanner(System.in);
// int number =0;
// do{
// System.out.println("Enter the Number :");
// number = sc.nextInt();
// System.out.println("The number is :");
// System.out.println(number);
// }while(number>=0);
// System.out.println("Negative Number");
// sc.close();
// int i = 0;
// while(true){
// if(i== 3){
// i++;
// continue;
// }
// System.out.println(i);
// i++;
// if(i>5){
// break;
// }
// }
// ------------------Exception Handling-----------------//
// int[] marks = {97,94,76};
// try{
// System.out.println(marks[5]);
// }catch(Exception exception){
// System.out.println(marks[1]);
// }
// System.out.println("Student name is Ram :");
// -----------------Mehtods------------------------//
// printHw();
// printName("lokesh saini");
// printName("vinod saini");
// printName("rahul saini");
// printSum(3,4);
// ------------------ Mini Project--------------------//
// int myNumber = (int)(Math.random()*100);
// Scanner sc = new Scanner(System.in);
// int newNum =0;
// do{
// System.out.println("Guess the number 1-100 :");
// newNum = sc.nextInt();
// if(newNum< myNumber){
// System.out.println("your number is lessthan the original number ! Guess
// Again");
// }else if(newNum > myNumber){
// System.out.println("your number is greater than the original number! Guess
// Again");
// }else{
// System.out.println("you guess the right Number :");
// }
// }while(newNum >= 0);
// System.out.print("my number is :");
// System.out.println(myNumber);
// sc.close();
// }
// }
// void main() {
// System.out.println("Hello, World!");
// }
//-----------------------------Day-2------------------------------//
//-------------------Functions---------------------//
// import java.util.*;
// public class Functions {
//     public static void printMyName (String name){
//         System.out.println(name);
//     }
//     public static void calculateSum(int a, int b){
//         System.out.println(a+b);
//     }
//     public static void calFactorial(int n){
//         if (n<1){
//             System.out.println("Invailid Number");
//             return;
//         }
//         int fact =1;
//         for(int i=n; i>=1; i--){
//             fact*=i;
//         }
//         System.out.println(fact);
//         return;
//     }
//     public static void main (String[] args){
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();
//         printMyName(name);
//         calculateSum(7, 999999);
//         System.out.println("Enter the Number:");
//         int number = sc.nextInt();
//         calFactorial(number);
//         sc.close();
//     }
// }
//----------------------Day-3----------------------//
//---------------Arrays---------------//
// import java .util.*;
// public class arrays{
//     public static void main(String[] args){
// int marks[] = {97,98,94};
// for(int i= 0; i<=marks.length; i++){
//     System.out.println(marks[i]);
// }
// Scanner sc = new Scanner(System.in);
// int size = 5;
// int[] numbers = new int [size];
// for(int i = 0; i<size; i++){
//     numbers[i] = sc.nextInt();
// }
// System.out.print("Enter the X :");
// int x = sc.nextInt();
// for(int i=0; i<size; i++){
//     if(numbers[i]==x){
//         System.out.println("The loop was End x is at index:"+ i);
//     }
// }
//----------------2D Array-------------//
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// int m = sc.nextInt();
// int arr[][] = new int[n][m];
// for(int i =0; i<n; i++){
//     for(int j=0; j<m; j++){
//         arr[i][j] = sc.nextInt();
//     }
//     // System.out.println();
// }
// for(int i=0; i<n; i++){
//     for(int j=0; j<m; j++){
//         System.out.print(arr[i][j]+" ");
//     }
//     System.out.println();
// }
// sc.close();
// }
// }
//----------------------Day-4----------------------//
//-------------------Strings---------------------//
import java.util.*;

public class Advance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name1 = sc.nextLine();
        // String name2 = sc.nextLine();
        // System.out.println(name1);

        // --------------mehtods in string-------------//
        // System.out.println(name1.length());
        // if(name1.compareTo(name2)==0){
        // System.out.println("strings are equal");
        // }else{
        // System.out.println("strings are not equal");
        // }
        // String sentence = "my name is lokesh";
        // String name = sentence.substring(11 , sentence.length());
        // System.out.println(name);
        //----------------String bulider---------------//
        //--------Declaeration-------//
        // StringBuilder sb = new StringBuilder("lokesh");
        // System.out.println(sb);
        // //--------Acsess char---------//
        // System.out.println(sb.charAt(2));
        // //---------Replace char--------//
        // sb.setCharAt(3, 'i');
        // System.out.println(sb);
        // //----------Insert char---------//
        // sb.insert(0, 'p');
        // System.out.println(sb);
        // //----------Delete char---------//
        // sb.delete(0, 1);
        // System.out.println(sb);
        // //--------Append str-------------//
        // sb.append("saini");
        // System.out.println(sb);
        //---------------------Reverse a str-------------//
        // StringBuilder name = new StringBuilder("helloworld");
        // for(int i=0; i<name.length()/2; i++){
        //     int first = i;
        //     int last = name.length()-i-1;
        //     char firstletter = name.charAt(first);
        //     char lastletter = name.charAt(last);
        //     name.setCharAt(first, lastletter);
        //     name.setCharAt(last, firstletter);
        // }
        // System.out.println(name);
        // sc.close();
        //---------------------------Day-5----------------------------//
        //-----------------Bit Manipulation---------------//
        //---------Get bit-------------//
        // int n = 5;
        // int pos = 3;
        // int bitMask = 1<<pos;
        // if((bitMask&n)==0){
        //     System.out.println("the number is zero");
        // }else{
        //     System.out.println("the number is non-zero");
        // }
        //------------Set bit--------------//
        // int n = 5;
        // int pos =1;
        // int bitMask = 1<<pos;
        // int number = bitMask | n;
        // System.out.println(number);
        //-----------Clear bit---------------//
        // int n = 5;
        // int pos =2;
        // int bitMask = 1<<pos;
        // int notNumber = ~(bitMask);
        // int number = notNumber&n;
        // System.out.println(number);
        //---------------update bit-------------//
        // int operation = sc.nextInt();
        // int n = 5;
        // int pos =2;
        // int bitMask = 1<<pos;
        // if(operation==1){
        //     int number = bitMask|n;
        //     System.out.println(number);
        // }else{
        // int newbitmask = ~(bitMask);
        // int number = newbitmask&n;
        // System.out.println(number);
        // }
        sc.close();

    }

}

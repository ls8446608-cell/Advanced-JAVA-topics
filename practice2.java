// import java.util.Scanner;

//public class practice {
//public static void main(String[] args) {
// ---------------to print even/odd numbers till n------------------//
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// for(int i=1; i<=n; i+=2){
// System.out.println(i);
// };
// sc.close();
// -------------------Marks of student------------------------//
// Scanner sc = new Scanner(System.in);
// int choice ;
// int marks;
// do {
// System.out.println("\n--- MENU ---");
// System.out.println("Enter 1 : Enter student marks");
// System.out.println("Enter 0 : Exit");
// System.out.print("Your choice: ");
// choice = sc.nextInt();
// if (choice == 1) {
// marks = sc.nextInt();
// System.out.println("Enter the Marks: ");
// System.out.print(marks);
// if (marks >= 90) {
// System.out.println("good A grade");
// } else if (marks >= 75) {
// System.out.println("good B grade");
// } else if (marks >= 55) {
// System.out.println("good c grade");
// } else {
// System.out.println("fail");
// }
// } else if (choice == 0) {
// System.out.println("Thank you");
// } else {
// System.out.println("No option");
// }
// } while (choice!=0);
// sc.close();
// Scanner sc = new Scanner(System.in);
// int input;
// do {
//     System.out.println("\n--- MENU ---");
//     System.out.println("Enter 1 : Enter student marks");
//     System.out.println("Enter 0 : Exit");
//     System.out.print("Your choice: ");
//     input = sc.nextInt();
//     if (input == 1) {
//         System.out.print("Enter student's marks (out of 100): ");
//         int marks = sc.nextInt();
//         if (marks >= 90 && marks <= 100) {
//             System.out.println("This is Good");
//         } else if (marks >= 60 && marks <= 89) {
//             System.out.println("This is also Good");
//         } else if (marks >= 0 && marks <= 59) {
//             System.out.println("This is Good as well");
//         } else {
//             System.out.println("Invalid Marks! Please enter a value between 0 and 100.");
//         }
//         System.out.println("Because marks don't matter but our effort does.");
//     } else if (input == 0) {
//         System.out.println("Exiting program. Goodbye!");
//     } else {
//         System.out.println("Invalid Choice! Please enter 1 or 0.");
//     }
// } while (input != 0);
// sc.close();
//------------- number is prime or not---------------//
// Scanner sc = new Scanner(System.in);
//  System.out.print("Enter the Number :");
// int n = sc.nextInt();
// int count = 0;
// if(n==0||n==1) {
//     System.out.println("Invalid Number!");
// }else{
//     for(int i =1; i<=n; i++){
//         if(n%i==0){
//             count++;
//         }
//     }
//     if(count==2){
//         System.out.println("prime Number");
//     }else{
//         System.out.println("not prime number");
//     }
// }
// sc.close();
//----------------------Patterns---------------------//
//-----------Hollow pattern----------//
// int n =4;
// int m = 5;
// for(int i=1; i<=n; i++){
//     for(int j= 1; j<=m; j++){
//         if(i==1|| i==n|| j==1||j==m){
//             System.out.print("*");
//         }else{
//             System.out.print(" ");
//         }
//     }
//     System.out.println();
// }
//------------Half pramid------------//
// int n =4;
// for(int i=n; i>=1; i--){
//     for(int j=1; j<=i ; j++){ 
//         System.out.print("*");
//     }
//     System.out.println();
// }
// ----------INverted Half paramid---------//
// int n = 4;
// for(int i =1; i<=n; i++){
//     //-----for sapce-----
//         for(int j=1; j<=n-i; j++){
//             System.out.print(" ");
//         }
//     // ------for star------
//         for(int j = 1; j<=i; j++){
//             System.out.print("*");
//         }
//     System.out.println();
//------------Half number pramid-------------//
// int n =5;
// for(int i= 1; i<=n; i++){
//     for(int j =1; j<=n-i+1; j++){
//         System.out.print(j);
//     }
//     System.out.println();
// }
//-----------floyds triangl------------//
// int n = 5;
// int m = 1;
// for(int i = 1; i<=n; i++){
//     for(int j= 1; j<=i; j++){
//         System.out.print(m+" ");
//         m++;
//     }
//     System.out.println();
// }
//------------- 0-1 triangle------------//
// int n =5;
// for( int i =1; i<=n; i++){
//     for(int j= 1; j<=i; j++){
//         if((i+j) %2==0){
//             System.out.print("1");
//         }else{
//             System.out.print("0");
//         }
//     }
//     System.out.println();
// }
//--------------solid Rhombus square-------------//
// int n = 5;
// for(int i = 1; i<=n; i++){
//     //-----------spacess---------//
//     for(int j= i; j<=n-1; j++){
//         System.out.print(" ");
//     }
//     //---------stars-----------//
//     for(int j=1; j<=n; j++){
//         System.out.print("*"+"");
//     }
//  System.out.println();
// }
//-----------number pyramid--------------//
// int n= 5;
// int m =1;
// for (int i =1; i<=n; i++){
//     //----------for space----------//
//     for(int j= 1; j<=n-i; j++){
//         System.out.print(" ");
//     }
//     //---------for numbers---------//
//     for(int j=1; j<=i; j++){
//         System.out.print(m+" ");
//     }
//     m=m+1;
//     System.out.println();
// }
//------------Palindromic no. pyramid--------------//
// int n = 5;
// for(int i =1; i<=n; i++){
//     //---------for space--------//
//     for(int j= 1; j<=n-i; j++){
//         System.out.print(" ");
//     }
//     //-----for first numbers-----//
//     for( int j =i; j>=1; j--){
//         System.out.print(j);
//     }
//     //----for second numbers-----//
//     for(int j =2; j<=i; j++){
//         System.out.print(j);
//     }
//     System.out.println();
// }
//--------------------Butterfly Pattern---------------------//
// int n = 4;
// for(int i=1; i<=n; i++){
//     //-------------top part-------------//
//     //--------top left-------------//
//     for(int j=1; j<=i; j++){
//         System.out.print(" *");
//     }
//     for(int j=1; j<=n-i; j++){
//         System.out.print("  ");
//     }
//     //---------top right-----------//
//     for(int j=1; j<=n-i; j++){
//         System.out.print("  ");
//     }
//     for(int j=1; j<=i; j++){
//         System.out.print(" *");
//     }
//     System.out.println();
// }
//     //----------------Bottom Part--------------//
//     for(int i=1; i<=n; i++){
//         //---------Bottom left-----------//
//         for(int j=i; j<=n; j++){
//             System.out.print(" *");
//         }
//         for(int j=2; j<=i; j++){
//             System.out.print("  ");
//         }
//         //---------Bottom right-----------//
//         for(int j =2; j<=i; j++){
//             System.out.print("  ");
//         }
//         for(int j=i; j<=n; j++ ){
//             System.out.print(" *");
//         }
//         System.out.println();
//     }
//-------------------Butterfly Pattern-------------------//
// int n = 4;
// //---------------upper part----------------//
// for(int i=1; i<=n; i++){
//     int space = 2*(n-i);
//     //-------part 1---------//
//     for(int j=1; j<=i; j++){
//         System.out.print(" *");
//     }
//     //----------space---------//
//     for(int j =1; j<=space; j++){
//         System.out.print(" -");
//     }
//     //--------second part---------//
//     for(int j=1; j<=i; j++){
//         System.out.print(" *");
//     }
//     System.out.println();
// }
// //------------Bottom Part ---------------//
//         for(int i=n; i>=1; i--){
//     int space = 2*(n-i);
//     //-------part 1---------//
//     for(int j=1; j<=i; j++){
//         System.out.print(" *");
//     }
//     //----------space---------//
//     for(int j =1; j<=space; j++){
//         System.out.print(" -");
//     }
//     //--------second part---------//
//     for(int j=1; j<=i; j++){
//         System.out.print(" *");
//     }
//     System.out.println();
// }
//-------------------------Diamond Pattern-----------------------//
// int n = 4; 
//---------------upper part--------------//
// for(int i=1; i<=n; i++){
//     //--------Space----------//
//     for(int j=1; j<=n-i; j++){
//         System.out.print("  ");
//     }
//     //--------Stars----------//
//     for(int j= 1; j<=(2*i)-1; j++){
//         System.out.print(" *");
//     }
//     System.out.println();
// }
//--------------Bottom Part--------------//
// for(int i=n; i>=1; i--){
//     //--------Space----------//
//     for(int j=1; j<=n-i; j++){
//         System.out.print("  ");
//     }
//     //--------Stars----------//
//     for(int j= 1; j<=(2*i)-1; j++){
//         System.out.print(" *");
//     }
//     System.out.println();
// }
//}
//}
import java.util.*;

public class practice2 {

    // public static void calAverage(float a, float b, float c) {
    // float average = (a + b + c) / 3;
    // System.out.println(average);
    // }
    // public static void oddSum(int n) {
    // int sum = 0;
    // for (int i = 1; i <= n; i += 2) {
    // sum = sum + i;
    // }
    // System.out.println(sum);
    // return;
    // }
    // public static void bigNumber(int a, int b) {
    // if (a > b) {
    // System.out.println(a + "is grater than" + b);
    // } else {
    // System.out.println(b + "is grater than" + a);
    // }
    // return;
    // }
    // public static void calCurcumference(float r) {
    // double pie = 3.14;
    // double cricle = 2 * pie * r;
    // System.out.println(cricle);
    // }
    // public static void eligibleForVote(int age) {
    // if (age >= 18) {
    // System.out.println("You can vote");
    // } else {
    // System.out.println("You can't vote");
    // }
    // return;
    // }
    // public static void calPower(int x, int n) {
    // int power = 1;
    // for (int i = n; i >= 1; i--) {
    // power = power * x;
    // }
    // System.out.println(power);
    // return;
    // }
    // public static void getGcd(int a, int b){
    // while(b!=0){
    // int remainder = a % b;
    // a= b ;
    // b= remainder;
    // }
    // System.out.println(a);
    // }
    public static void toBinary(int n) {
        while () {
            
        }
    }

    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // float a = sc.nextFloat();
        // float b = sc.nextFloat();
        // float c = sc.nextFloat();
        // calAverage(a,b,c);
        // int number = sc.nextInt();
        // oddSum(number);
        // int firstNum = sc.nextInt();
        // int SecondNum = sc.nextInt();
        // bigNumber(firstNum, SecondNum);
        // float radius = sc.nextFloat();
        // calCurcumference(radius);
        // int age = sc.nextInt();
        // eligibleForVote(age);
        // int evencount = 0;
        // int oddcount =0;
        // int number ;
        // do{
        // System.out.println("If you to Exit Enter 0 or a negative number");
        // number = sc.nextInt();
        // if(number%2==0){
        // evencount++;
        // }else if(number==0){
        // return;
        // }else{
        // oddcount++;
        // }
        // }while(number!=0);
        // System.out.println("total evencount is"+evencount);
        // System.out.println("total oddcount is"+oddcount);
        // System.out.println("Enter the Numbers:");
        // int firstNum = sc.nextInt();
        // int secondNum = sc.nextInt();
        // calPower(firstNum,secondNum);
        // int number = sc.nextInt();
        // int count1 = 0;
        // int count2 = 1;
        // for(int i =0; i<=number; i++){
        // int next = 0;
        // System.out.println(count1);
        // next = count1+count2;
        // count1= count2;
        // count2 = next;
        // }
        // int first = sc.nextInt();
        // int second = sc.nextInt();
        // getGcd(first, second);
        // ----------------------2D Array---------------------//
        // --------------traverse 2DArray--------------//
        // int n = sc.nextInt();
        // int m = sc.nextInt();
        // int arr[][] = new int[n][m];
        // for(int i =0; i<n; i++){
        // for(int j=0; j<m; j++){
        // arr[i][j] = sc.nextInt();
        // }
        // // System.out.println();
        // }
        // for(int j=0; j<m; j++){
        // for(int i=0; i<n; i++){
        // System.out.print(arr[i][j]+" ");
        // }
        // System.out.println();
        // }
        // ------------Searching X--------------//
        // int n = sc.nextInt();
        // int m = sc.nextInt();
        // int arr[][] = new int[n][m];
        // for(int i =0; i<n; i++){
        // for(int j=0; j<m; j++){
        // arr[i][j] = sc.nextInt();
        // }
        // // System.out.println();
        // }
        // System.out.println("Enter the Value of x");
        // int x = sc.nextInt();
        // for(int i=0; i<n; i++){
        // for(int j=0; j<m; j++){
        // if(arr[i][j]==x){
        // System.out.println("X found at "+i +" :"+ j +" "+ "index");
        // }
        // // System.out.print(arr[i][j]+" ");
        // }
        // // System.out.println();
        // }
        // ------------print Spiral metrix------------//
        // int n = sc.nextInt();
        // int m = sc.nextInt();
        // int rowStart = 0;
        // int rowEnd = n-1;
        // int colStart = 0;
        // int colEnd = m-1;
        // int matrix[][] = new int[n][m];
        // for(int i =0; i<n; i++){
        // for(int j=0; j<m; j++){
        // matrix[i][j] = sc.nextInt();
        // }
        // // System.out.println();
        // }
        // //To print spiral order matrix
        // while(rowStart <= rowEnd && colStart <= colEnd) {
        // //1
        // for(int col=colStart; col<=colEnd; col++) {
        // System.out.print(matrix[rowStart][col] + " ");
        // }
        // rowStart++;
        // //2
        // for(int row=rowStart; row<=rowEnd; row++) {
        // System.out.print(matrix[row][colEnd] +" ");
        // }
        // colEnd--;
        // //3
        // for(int col=colEnd; col>=colStart; col--) {
        // System.out.print(matrix[rowEnd][col] + " ");
        // }
        // rowEnd--;
        // //4
        // for(int row=rowEnd; row>=rowStart; row--) {
        // System.out.print(matrix[row][colStart] + " ");
        // }
        // colStart++;
        // System.out.println();
        // }
        // sc.close();
        // }
        // }
        // --------------------Strings----------------------------//
        // -----for claculate total lenth of stings after concatination-----//
        Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // String newname = "";
        // String name[] = new String[size];
        // for (int i = 0; i < size; i++) {
        // name[i] = sc.next();
        // }
        // for (int i = 0; i < size; i++) {
        // newname = newname+name[i];

        // }
        // System.out.println(newname+ newname.length());
        // ----------for replace a letter from input string----------//
        // String name = sc.nextLine();
        // String newName = "";
        // for(int i=0; i<name.length(); i++){
        // if(name.charAt(i)== 'e'){
        // newName+="i";
        // }else{
        // newName+= name.charAt(i);
        // }
        // }
        // System.out.println(newName);
        // ------for deleting a part from string----------//
        // String mail = "";
        // String eMail = sc.nextLine();
        // for (int i = 0; i < eMail.length(); i++) {
        // if (eMail.charAt(i) == '@') {
        // break;
        // } else {
        // mail += eMail.charAt(i);
        // }
        // }
        // System.out.println(mail);
        // -------------------Bit Manipulation--------------------//
        // ----------------for 2's power or not---------------//
        // int n = sc.nextInt();
        // if((n&n-1)==0){
        // System.out.println("the number is power of 2");
        // }else{
        // System.out.println("the number is not power of 2");
        // }
        // ----------------toggle bit ------------------//
        // int n = sc.nextInt();
        // int pos = sc.nextInt();
        // int togNum = n^(1<<pos);
        // System.out.println(togNum);
        // ----------------count of 1 in nmuber------------//
        // int n = sc.nextInt();
        // int bitMask = 0;
        // int count = 0;
        // for (int i = 0; i <= 3; i++) {
        //     bitMask = 1 << i;
        //     int number = bitMask & n;
        //     if (number != 0) {
        //         count++;
        //     }
        // }
        // System.out.println(count);
        //------------------to convert n in b to d , d to b----------------//
        // int n = sc.nextInt();
        // int method = sc.nextInt();
        sc.close();

    }

}

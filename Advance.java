
public class Advance {

    public static void toPrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void toPrintArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void toPrintNumber(int n) {
        if (n == 5) {
            return;
        }
        System.out.println(n);
        toPrintNumber(n + 1);
    }

    public static void toPrintSum(int i, int n, int result) {
        if (i == n) {
            result += i;
            System.out.println(result);
            return;
        }

        result += i;

        toPrintSum(i + 1, n, result);

    }



    public static long toPrintFact(long n){
        if(n==0||n==1){
            // System.out.println(1);
            return 1;
            
        }
    
        long fact_nm1 = (toPrintFact(n-1));
       long  fact_n = n*fact_nm1 ;
       

       return fact_n;
 
    }

    public static void toPrintFibo(int n ,int a, int b){
         
        if(n==0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        toPrintFibo(n-1, b,c);

    }


    public static int printXPowerN(int x, int n){
        int xPower ;
        if(n==0){
            return 1;

        }
        if(x==0){
            return 0;
        }

        if(n%2==0){

         xPower = printXPowerN(x, n/2)*printXPowerN(x, n/2);
         
        }else{

        xPower = printXPowerN(x, n/2)*printXPowerN(x, n/2)*x;
         
        }
        

        // int xMin1 = printXPowerN(x, n-1);
        // int xPower = x*xMin1 ;
        
        return xPower;

    }

    public static void main(String[] args) {

        //-------------------Bubbole Sort-------------------//
        // int swaps = 0;
        // int[] arr = {7, 3, 4, 5, 1};
        // for (int i = 0; i < arr.length - 1; i++) {
        //     for (int j = 0; j < arr.length - i - 1; j++) {
        //         if (arr[j] > arr[j + 1]) {
        //             int temp = arr[j];
        //             arr[j] = arr[j + 1];
        //             arr[j + 1] = temp;
        //             swaps++;
        //         }
        //     }
        // }
        // System.out.println("Number of swaps: " + swaps);
        // toPrintArray(arr);
        //-------------------Selection Sort-------------------//
        // int[] arr = {7, 3, 6, 2, 1};
        // for(int i=0; i<arr.length; i++){
        //     int smallest =i;
        //     for(int j=i+1; j<arr.length;j++){
        //         if(arr[smallest]>arr[j]){
        //             smallest = j;
        //         }
        //     }
        //     int temp = arr[smallest];
        //     arr[smallest] = arr[i];
        //     arr[i] = temp;
        // }
        // toPrintArray(arr);
        //-------------------Insertion Sort-------------------//
        // int[] arr = {4, 7, 9, 2, 5};
        // for(int i=0; i<arr.length; i++){
        //     int current = arr[i];
        //     int j=i-1;
        //     while(j>=0 && arr[j]<current){
        //         arr[j+1] = arr[j];
        //         j--;
        //     }
        //     arr[j+1]=current;
        // }
        // toPrintArray(arr);
        // String[] arr = {"java","python","c++","javascript"};
        // for(int i=0; i<arr.length; i++){
        //     String current = arr[i];
        //     int j=i-1;
        //     while(j>=0 && arr[j].compareTo(current)>0){
        //         arr[j+1] = arr[j];
        //         j--;
        //     }
        //     arr[j+1]=current;
        // }
        // toPrintArray(arr);
        //-----------------Recursion-----------------//
        // int n = 5;
        // int i = 1;
        // int result = 0;
        // toPrintSum(i, n, result);
       

        // long result =  toPrintFact(20);
        // System.out.println(result);
        // int a=0;
        // int b=1;
        // int n=10;
        // System.out.println(a);
        // System.out.println(b);
        // toPrintFibo(n,a,b);

      int ans =  printXPowerN(2, 5);
      System.out.println(ans);
    }

}

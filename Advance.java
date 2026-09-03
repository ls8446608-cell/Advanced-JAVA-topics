
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

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

    public static long toPrintFact(long n) {
        if (n == 0 || n == 1) {
            // System.out.println(1);
            return 1;

        }

        long fact_nm1 = (toPrintFact(n - 1));
        long fact_n = n * fact_nm1;

        return fact_n;

    }

    public static void toPrintFibo(int n, int a, int b) {

        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        toPrintFibo(n - 1, b, c);

    }

    public static int printXPowerN(int x, int n) {
        int xPower;
        if (n == 0) {
            return 1;

        }
        if (x == 0) {
            return 0;
        }

        if (n % 2 == 0) {

            xPower = printXPowerN(x, n / 2) * printXPowerN(x, n / 2);

        } else {

            xPower = printXPowerN(x, n / 2) * printXPowerN(x, n / 2) * x;

        }

        // int xMin1 = printXPowerN(x, n-1);
        // int xPower = x*xMin1 ;
        return xPower;

    }

    public static void towerOfHanoi(int n, String source, String helper, String dest) {
        if (n == 1) {
            System.out.println("Transfer " + n + " from " + source + " to " + dest);
            return;

        }
        towerOfHanoi(n - 1, source, dest, helper);
        System.out.println("Transfer " + n + " from " + source + " to " + dest);
        towerOfHanoi(n - 1, helper, source, dest);

    }

    public static void printRev(String str, int idx) {
        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.println(str.charAt(idx));
        printRev(str, idx - 1);
    }

    public static int first = -1;
    public static int last = -1;

    public static void findOccuerence(String str, int idx, char ele) {

        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentChar = str.charAt(idx);
        if (currentChar == ele) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }

        }

        if (first == -1 && last == -1) {
            System.out.println("Character does not belongs to this string");
            return;

        }

        findOccuerence(str, idx + 1, ele);

    }

    public static boolean findSorted(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return true;

        }
        if (arr[idx] >= arr[idx + 1]) {
            return false;
        }
        return findSorted(arr, idx + 1);
        // if(arr[idx]<arr[idx+1]){

        //     return findSorted(arr, idx+1);
        // }else{
        //     return false;
        // }
    }

    public static void moveToLast(String str, int idx, int count, char ele, String newStr) {
        if (idx == str.length() - 1) {
            for (int i = 0; i <= count; i++) {
                newStr += ele;
            }
            System.out.println(newStr);
            return;
        }

        if (str.charAt(idx) != ele) {
            newStr += str.charAt(idx);

        } else {
            count++;

        }
        moveToLast(str, idx + 1, count, ele, newStr);
    }

    public static boolean[] map = new boolean[26];

    public static void removeDupe(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char current = str.charAt(idx);
        if (map[current - 'a'] == true) {
            removeDupe(str, idx + 1, newString);

        } else {
            newString += current;
            map[current - 'a'] = true;
            removeDupe(str, idx + 1, newString);
        }
    }

    public static void subsequence(String str, int idx, String newString, HashSet<String> set) {
        if (idx == str.length()) {

            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }

        }
        char current = str.charAt(idx);

        subsequence(str, idx + 1, newString + current, set);

        subsequence(str, idx + 1, newString, set);
    }

    public static String[] keyPad = {".", "abc", "efg", "hig", "klm", "no", "pqrs", "tu", "vwx", "yz"};

    public static void printComb(String str, int idx, String combination) {
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }
        char current = str.charAt(idx);

        String mapping = keyPad[current - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            printComb(str, idx + 1, combination + mapping.charAt(i));
        }

    }

    public static void permutation(String str, String permu) {
        if (str.length() == 0) {
            System.out.println(permu);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            String newsString = str.substring(0, i) + str.substring(i + 1);
            permutation(newsString, permu + current);
        }
    }

    public static int countPath(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        int downPath = countPath(i + 1, j, n, m);

        int rightPath = countPath(i, j + 1, n, m);

        return downPath + rightPath;
    }

    public static int palceItems(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }

        int verticalPlace = palceItems(n - m, m);
        int horijontalPlace = palceItems(n - 1, m);

        return verticalPlace + horijontalPlace;
    }

    public static int ways(int n) {
        if (n <= 1) {
            return 1;
        }

        int way1 = ways(n - 1);

        int way2 = (n - 1) * ways(n - 2);

        return way1 + way2;
    }

    public static void printSubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.println(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void findSubset(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            printSubset(subset);
            return;
        }

        subset.add(n);
        findSubset(n - 1, subset);

        subset.remove(subset.size() - 1);
        findSubset(n - 1, subset);
    }

    //------------Backtracking----------------//
    public static void printpermutaion(String str, int idx, String permu) {
        if (str.length() == 0) {

            System.out.println(permu);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i + 1);
            printpermutaion(newString, idx + 1, permu + current);
        }
    }

    //---------------------N-Queen problem----------------------//
    public static boolean isSafe(int row, int col, char[][] board) {
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        for (int j = 0; j < board.length; j++) {
            if (board[j][col] == 'Q') {
                return false;
            }
        }

        int r = row;
        for (int c = col; c >= 0 && r >= 0; c--, r--) {
            if (board[r][c] == 'Q') {
                return false;

            }
        }

        r = row;
        for (int c = col; c < board.length && r >= 0; c++, r--) {
            if (board[r][c] == 'Q') {
                return false;

            }
        }
        r = row;
        for (int c = col; c >= 0 && r < board.length; c--, r++) {
            if (board[r][c] == 'Q') {
                return false;

            }
        }
        r = row;
        for (int c = col; c < board.length && r < board.length; c++, r++) {
            if (board[r][c] == 'Q') {
                return false;

            }
        }

        return true;

    }

    public void saveBoard(char[][] board, List<List<String>> allBoard) {
        String row = "";

        List<String> newBoard = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            row = "";
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'Q') {
                    row += "Q ";

                } else {
                    row += "_ ";
                }
            }
            newBoard.add(row);
        }
        allBoard.add(newBoard);

    }

    public void helpper(char[][] board, List<List<String>> allBoard, int col) {

        for (int row = 0; row < board.length; row++) {
            if (col == board.length) {
                saveBoard(board, allBoard);
                return;
            }
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helpper(board, allBoard, col + 1);
                board[row][col] = '.';
            }

        }

    }

    public List<List<String>> solveQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        helpper(board, allBoards, 0);
        return allBoards;

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
        //   int ans =  printXPowerN(2, 5);
        //   System.out.println(ans);
        // int n =4;
        // String S ="S";
        // String H = "H";
        // String D = "D";
        // towerOfHanoi(n, S, H, D);
        // String name = "lokesh";
        // printRev(name, name.length()-1);
        // String word = "abbcdasdadcdsa";
        // findOccuerence(word, 0, 'a');
        // int[] arr = {1,2,3,6,5};
        // System.out.println(findSorted(arr, 0));
        // String str ="abxcsdfdgddfgbxcdxd";
        // String newStr =" ";
        // moveToLast(str, 0, 0, 'c', newStr);
        // String str ="abbcdefghiiiessikwwwlaaad";
        // removeDupe(str, 0, " ");
        // String str = "aaa";
        // HashSet<String> set = new HashSet<>();
        // subsequence(str, 0, "" , set);
        String str ="abc";
        permutation(str, "");
        // int n=3;
        // int m=3;
        // int totalCount =countPath(0, 0 , n ,m );
        // System.out.println(totalCount);
        // int n =4;
        // System.out.println(ways(n));
        // int n =3;
        // ArrayList<Integer> subset = new ArrayList<>();
        // findSubset(n , subset);
        //-----------------Backtracking-----------------//
        // String str = "lokesh";
        // printpermutaion(str, 0, "");
        // Advance solver = new Advance(); // Instantiating the class
        // int n = 4;
        // List<List<String>> solutions = solver.solveQueens(n);

        // System.out.println("Total solutions for N = " + n + ": " + solutions.size());
        // for (int i = 0; i < solutions.size(); i++) {
        //     System.out.println("\nSolution " + (i + 1) + ":");
        //     for (String row : solutions.get(i)) {
        //         System.out.println(row);

        //     }

        // }
    }

}

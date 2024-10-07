// problem 1 Print numbers from 5 to 1.
// public class Recursion{
//     public static void printNum(int n){
//         if(n < 1){
//             return;
//         }
//         System.out.println(n);
//         printNum(n-1);
//     }
//     public static void main(String args[]){
//         printNum(5);
//     }
// }

//problem 2 Print numbers from 1 to 5.
//  public class Recursion{
//     public static void PrintNum(int n){
//         if(n > 5){
//             return;
//         }
//         System.out.println(n);
//         PrintNum(n+1);
//     }
//      public static void main(String args[]){
//         PrintNum(1);
//      }
//  }

////problem 3 Print the sum of first n natural numbers.
//public class Recursion{
//    public  static void SumNum(int i, int n, int sum){
//        if(i == n){
//            sum += i;
//            System.out.println(sum);
//            return;
//        }
//        sum += i;
//        SumNum(i+1, n, sum);
//        System.out.println(i);
//    }
//    public static void main(String args[]){
//        SumNum(1, 10, 0);
//    }
//}

 import java.util.Scanner;

////problem 4 Print factorial of a number n.
//public class Recursion {
//    public static void factorial(int n, int fac){
//        if(n == 0){
//            System.out.println(fac);
//            return;
//        }
//        fac *= n;
//        factorial(n-1, fac);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        factorial(num, 1);
//    }
//}

////problem 4 Print factorial of a number n.
//public class Recursion {
//    public static int factorial(int n) {
//        if (n == 1 || n == 0) {
//            return 1;
//        }
//        return n * factorial(n - 1);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(factorial(n));
//        ;
//    }
//}

////problem 5 Print the fibonacci sequence till nth term.
//public class Recursion {
//    public static void fib(int n, int a , int b){
//        if(n == 0){
//            return;
//        }
//        int c = a+b;
//        System.out.println(c);
//        fib(n-1,b,c);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a = 0;
//        int b = 1;
//        System.out.println(a);
//        System.out.println(b);
//        fib(n-2, 0, 1);
//    }
//}

////problem 6 Print x^n (with stack height = n)
//public class Recursion {
//    public static int seq(int x, int n){
//        if(n == 0){
//            return 1;
//        }
// if(x == 0){
    // return 0;
// } 
//        return x * seq(x, n-1);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int sum = seq(2, n);
//        System.out.println(sum);
//    }
//}

////problem 7 Print x^n (with stack height = logn)
//class Recursion {
//    public static int printPower(int x, int n) {
//        if (n == 0) {
//            return 1;
//        }
//        if (n % 2 == 0) {
//            return printPower(x, n / 2) * printPower(x, n / 2);
//        } else {
//            return x * printPower(x, n / 2) * printPower(x, n / 2);
//        }
//    }
//
//    public static void main(String args[]) {
//        int x = 2, n = 5;
//        int output = printPower(x, n);
//        System.out.println(output);
//    }
//}

// problem 1 Tower of Hanoi
// public class Recursion {
//     public static void towerOfHanio(int n, String src, String helper, String dest) {
//         if(n == 1){
//             System.out.println("tranfer disk "+n+" from "+src+" to "+dest);
//             return;
//         }
//         towerOfHanio(n-1, src, dest, helper);
//         System.out.println("tranfer disk "+n+" from "+src+" to "+dest);
//         towerOfHanio(n-1, helper, src, dest);
//     }
//     public static void main(String[] args) {
//         int n = 3;
//         towerOfHanio(n, "S", "H", "D");
//     }
// }
 
// problem 2 Print string in reverse
// public class Recursion { 
//     public static void printRevers(int index, String str){
//         if(index < 0){
//             return ;
//         }
//         System.out.print(str.charAt(index));
//         printRevers(index-1, str);
//     }
//       public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//         String str = sc.next();

//         int index = str.length()-1;
//         printRevers(index, str);
//       }
// }

// problem 3 Find first & last occurrence of element
// public class Recursion {
//     public static int first = -1;
//     public static int last = -1;
    
//     public static void findOccurance(String str, int idx, char element){
//         if(idx == str.length()){
//            System.out.println(first);
//            System.out.println(last);
//            return ;
//         }

//         if(str.charAt(idx) == element){
//             if(first == -1){
//                 first = idx;
//             }
//             else{
//                 last = idx;
//             }
//         }
//         findOccurance(str, idx+1, element);
//     }
//       public static void main(String[] args) {
//         String str = "abaadfkfhfah";
//           findOccurance(str, 0, 'a');
//       }
// }

// problem 4 Check if the array is sorted (strictly increasing)
// public class Recursion {
//     public static boolean Arraysorted(int arr[], int index){
//         if(index == arr.length-1){
//             return true;
//         }
//         if(arr[index] < arr[index+1]){
//             return Arraysorted(arr, index+1); 
//         }
//         else{
//             return false;
//         }
//     }
//       public static void main(String args[]) {
//         int [] arr = {1, 2, 3, 4, 5};

//         System.out.print( Arraysorted(arr, 0));
//       }
//     }

// problem 5  Move all 'x' to the end
// public class Recursion{
//     public static void moveAllX(String str, int idx, int count, String newString){
//         if(idx == str.length()){
//             for(int i = 0; i<count; i++){
//                 newString += "x";
//             }
//             System.out.print(newString);
//             return;
//         }
//         char currChar = str.charAt(idx);
//         if(currChar == 'x'){
//             count++;
//             moveAllX(str, idx+1, count, newString);
//         }
//         else{
//             newString += currChar;
//             moveAllX(str, idx+1, count, newString);
//         }
//     }
//     public static void main(String args[]){
//         String str = "axbcxxd";
//         moveAllX(str, 0, 0, "");
//     }
// }

// problem 6 Remove all duplicates in String
// public class Recursion{
//     public static void RemoveDuplicate(String str, int idx, String newStr){
//         if(idx == str.length()){
//             System.out.print(newStr);
//             return; 
//         }

//         if(newStr.indexOf(str.charAt(idx)) == -1){
//             newStr += str.charAt(idx);
//         } 
//             RemoveDuplicate(str, idx+1, newStr); 
//     }
    
//     public static void main(String args[]){
//         String str = "sdbaegbvdsdgazduvfj";
//         RemoveDuplicate(str, 0, "");
//     }
// }

// problem 7 Print all subsequence
// public class Recursion{
//     public static void subsequencde(String str, int idx, String newStr){

//         if(idx == str.length()){
//             System.out.println(newStr);
//             return;
//         }

//         char currChar = str.charAt(idx);

//         //to be 
//         subsequencde(str, idx+1, newStr+currChar);

//         //to not be
//         subsequencde(str, idx+1, newStr);
//     }
//     public static void main(String args[]){
//         String str = "abc";
//         subsequencde(str, 0, "");
//     }
// }

// problem 8 Print all unique subsequence
// import java.util.HashSet;
// public class Recursion{
//     public static void subsequencde(String str, int idx, String newStr, HashSet<String> set){

//         if(idx == str.length()){
//             if(set.contains(newStr)){
//                 return;
//             }
//             else{
//                 System.out.println(newStr);
//                 set.add(newStr);
//                  return;
//             }
//         }

//         char currChar = str.charAt(idx);

//         //to be 
//         subsequencde(str, idx+1, newStr+currChar, set);

//         //to not be
//         subsequencde(str, idx+1, newStr, set);
//     }
//     public static void main(String args[]){
//         String str = "abc";
//         HashSet<String> set = new HashSet<>();
//         subsequencde(str, 0, "", set);
//     }
// }

// problem 9 Print Keypad Combination
// public class Recursion{
//     public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", " yz"};

//     public static void printComb(String str, int idx, String combination){
//         if(idx == str.length()){
//             System.out.println(combination);
//             return;
//         }
//         char currChar = str.charAt(idx);
//         String mapping = keypad[currChar - '0'];

//         for(int  i = 0; i<mapping.length(); i++){
//             printComb(str,  idx+1, combination+mapping.charAt(i));
//         }
//     }
//     public static void main(String args[]){
//         String str = "23";
//         printComb(str, 0, "");
//     }
// }

// problem 1 Print all permutation of string
// public class Recursion{
//     public static void Permutation(String str, String newstr){

//         if(str.length() == 0){
//             System.out.println(newstr);
//             return;
//         }

//         for(int i = 0; i<str.length(); i++){
//             char currChar = str.charAt(i);
//             String permutation = str.substring(0, i) + str.substring(i+1);
//             Permutation(permutation, newstr+currChar);
//         }
//     }
//     public static void main(String args[]){
//         String str = "abc";
//         Permutation(str, "");
//     }
// }

// problem 2 Count total paths in maze to move from (0,0) to (n,m)
// public class Recursion{
//     public static int CountPath(int i, int j, int n, int m){
//         if(i == n || j == m){
//             return 0;
//         }
//         if(i == n-1 && j == m-1){
//             return 1;
//         }
//         //move downwards
//         int downPath = CountPath(i+1, j, n, m);

//         // move rightPath 
//         int rightPath = CountPath(i, j+1, n, m);

//         return downPath + rightPath;
//     }
//     public static void main(String args[]){
//        System.out.println( CountPath(0, 0, 3, 3));
//     }
// }
// problem 3 Place tiles of size 1Xm im a floor of size n*m
// public class Recursion{
//      public static int placetitle(int n, int m){

//         if(n == m){
//             return 2;
//         }
//         if(n < m){
//             return 1;
//         }

//             //vertical
//             int vertical = placetitle(n-m, m);

//             //horizental
//             int horizental = placetitle(n-1, m);

//             return vertical + horizental;
//         }
//     public static void main (String args[]){
//        System.out.print(placetitle(4, 3));
//     }
//     }

// problem 4 Find the number of ways in which you can invite n people to your party, single or in pairs.
// public class Recursion{
//     public static int InvitePeople(int n){

//         if(n <= 1){
//             return 1;
//         }

//         // invite single persobn
//         int single = InvitePeople(n-1);

//         // invite pair 
//         int pair = (n-1) * InvitePeople(n-2);

//         return single + pair;
//     }
//     public static void main(String args[]){
//       System.out.println(InvitePeople(4));
//     }
// }

//problem 5 Print all the subset of first n natural number
public class Recursion{
    public static void printSuset(ArrayList<Integer> subset){
        for(int i = 0; i<subset.size(); i++){
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }
    public static void findSubset(int n, ArrayList<Integer> subset){

        if(n == 0){
            printSuset(subset);
            return;
        }

        //add
        subset.add(subet);
        findSubset(n-1, subset);

        //not add
        subset.remove(subset.size() - 1);
        findSubset(n-1, subset);
    }
    public static void main(String args[]){
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubset(n, subset);
    }
}
import java.util.*;
// GET
//  public class Pattern {
//      public static void main(String[] args) {
//         int n = 5;
//         int pos = 3;

//         int num = 1<<pos;
//         if((num & n) == 0){
//             System.out.println("0");
//         }
//         else{
//             System.out.println("1");
//         }
//      }
//  }

//SET
//  public class Pattern {
//      public static void main(String[] args) {
//         int n = 5;
//         int pos = 1;

//         int num = 1<<pos;
//         int bitnum = num | n;
//         System.out.println(bitnum);
//      }
//  }

//CLEAR
//  public class Pattern {
//      public static void main(String[] args) {
//         int n = 5;
//         int pos = 1;

//         int num = ~(1<<pos);
//         int bitnum = num & n;
//         System.out.println(bitnum);
//      }
//  }

//UPDATE
// public class Bits {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int oper = sc.nextInt();
//        // oper=1 -> set; oper=0 -> clear
//       int n = 5;
//       int pos = 1;
     
//       int bitMask = 1<<pos;
//       if(oper == 1) {
//           //set
//           int newNumber = bitMask | n;
//           System.out.println(newNumber);
//       } else {
//        //clear
//        int newBitMask = ~(bitMask);
//        int newNumber = newBitMask & n;
//        System.out.println(newNumber);
//       }
     
//    }
// }

//Write a program to find if a number is a power of 2 or not.
// public class Bits {
//     public static boolean isPower(int n){
//         if(n <= 0){
//             return false;
//         }
//         return (n & (n - 1)) == 0;
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

        // if (isPowerOfTwo(number)) {
        //  System.out.println(number + " is a power of 2.");
        // } else {
        //     System.out.println(number + " is not a power of 2.");
        // }

    //  if(n <= 0){
    //     System.out.println(n + " is not a power of 2.");
    //  }
    //  else if((n & (n-1)) == 0){
    //     System.out.println(n + " is a power of 2.");
    //     }
    //     else{
    //         System.out.println(n + " is not a power of 2.");
    //     }
// }
// }

//Write a program to toggle a bit a position = “pos” in a number “n”.
// public class Bits{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int pos = sc.nextInt();

//         int mask = 1<<pos;
//         int num = n ^ mask;
//         System.out.println("The number after toggling the bit at position " + pos + " is: " + num);
//     }
// } 

//Write a program to count the number of 1’s in a binary representation of the number.
// public class Bits{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int count = 0;

//         String num = Integer.toBinaryString(n);
//         for(int i = 0; i<num.length(); i++){
//             if(num.charAt(i) == '1'){
//                 count++;
//             }
//         }
//             System.out.println(count);
//     }
// }

//Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a number from one number system to another
// public class Bits{
//     public static void DTOB(int n) {
//         String num = Integer.toBinaryString(n);
//         System.out.println(num);
//     }
//     public static void BTOD(String n) {
//           int res = Integer.parseInt(n, 2);
//           System.out.println(res);
//     }
//      public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         String m = sc.next();
//         DTOB(n);
//         BTOD(m);
//      }
// }
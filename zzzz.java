// import java.math.BigInteger;
// import java.util.*;

// public class zzzz {    
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         BigInteger n = sc.nextBigInteger();
//         ArrayList<Integer> arr = new ArrayList<Integer>();

//         ArrayList<Integer> result = new ArrayList<Integer>();

//         while(n-- > new BigInteger("0") >= 0) {
//             arr.add(sc.nextInt());
//         }
//         sc.close();
//         int a = 0, b = 0;
//         int rem;
//         for(int i = 0; i < arr.size(); i++) {
//             if(arr.get(i) % 2 == 0) {
//                 rem = arr.remove(i);
//                 Collections.reverse(arr);
//             } else {
//                 rem = arr.remove(i);
//             }
//             result.add(rem);
//         }
        
//         for(int i = 0; i < result.size(); i++) {
//             if(i % 2 == 0) {
//                 a += result.get(i);
//             }
//              else {
//                 b += result.get(i);
//             }
//         }
//         System.out.println("a: " + a);
//         System.out.println("b: " + b);
//         int sum = a - b;
//         System.out.println(sum);
//     }
// }
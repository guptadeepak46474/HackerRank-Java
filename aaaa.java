// import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
// import java.util.*;
// import java.util.concurrent.*;
// import java.util.function.*;
// import java.util.regex.*;
// import java.util.stream.*;
// import static java.util.stream.Collectors.joining;
// import static java.util.stream.Collectors.toList;



// class Result {
//     public static BigInteger getScoreDifference(List<BigInteger> arr) {
//     // Write your code here
//     ArrayList<BigInteger> result = new ArrayList<BigInteger>();
//     // Write your code here
//     // int a = 0, b = 0;
//         BigInteger a = 0, b = 0;
//         BigInteger rem;
//         for(int i = 0; i < arr.size(); i++) {
//         if(arr.get(i) % 2 == 0) {
//             rem = arr.remove(i);
//             Collections.reverse(arr);
//         } else {
//             rem = arr.remove(i);
//         }
//         result.add(rem);
//     }
//     for(int i = 0; i < result.size(); i++) {
//         if(i % 2 == 0) {
//             a += result.get(i);
//         }
//          else {
//             b += result.get(i);
//         }
//     }
    
//     long sum =  a - b;
//     return (int) sum;

//     }

// }

// public class aaaa {
//     public static void main(String[] args) throws IOException {
//         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//         BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//         int numSeqCount = Integer.parseInt(bufferedReader.readLine().trim());

//         List<Integer> numSeq = IntStream.range(0, numSeqCount).mapToObj(i -> {
//             try {
//                 return bufferedReader.readLine().replaceAll("\\s+$", "");
//             } catch (IOException ex) {
//                 throw new RuntimeException(ex);
//             }
//         })
//             .map(String::trim)
//             .map(Integer::parseInt)
//             .collect(toList());

//         int result = Result.getScoreDifference(numSeq);

//         bufferedWriter.write(String.valueOf(result));
//         bufferedWriter.newLine();

//         bufferedReader.close();
//         bufferedWriter.close();
//     }
// }

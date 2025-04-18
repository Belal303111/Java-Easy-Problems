import java.io.*;
<<<<<<< HEAD
import java.util.*;
=======
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
>>>>>>> 65c803b6a17433c9801d2718ee585c103566bac0
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * The 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
  int l=0,r=0;
  int k=arr.size()-1;
  for(int i=0;i<arr.size();i++)
  {
    
    for(int j=0;j<arr.size();j++)
  {
    if(i==j)  //left
    {
        l+=arr.get(i).get(j);
    }
    // right
    if(j==k)
    {
        r+=arr.get(i).get(j);
    }
  }
  k--;
  }
  int sum =l-r;
  if(sum<0) sum*=-1;
  return sum;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

<<<<<<< HEAD
        int result = AveryBigSum.diagonalDifference(arr);
=======
        int result = Result.diagonalDifference(arr);
>>>>>>> 65c803b6a17433c9801d2718ee585c103566bac0

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

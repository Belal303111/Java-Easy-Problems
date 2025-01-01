import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * The 'plusMinus' function below.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
double p=0,n=0,z=0;
int i=0;
while(i<arr.size())
{
    if(arr.get(i)>0) p++;
    else if(arr.get(i)<0) n++;
    else z++;
    i++;
}
double m=arr.size();
// precision(6)
System.out.printf("%.6f%n",p/m);
System.out.printf("%.6f%n",n/m);
System.out.printf("%.6f%n",z/m);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        AveryBigSum.plusMinus(arr);

        bufferedReader.close();
    }
}

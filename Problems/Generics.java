import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
     List l=new ArrayList();
     l.add(1);
     l.add(2);
     l.add(3);
     l.add("Hello");
     l.add("World");
     for(int i=0;i<l.size();i++)
     System.out.println(l.get(i));
    }
}

//Java program to demonstrate working of splitting a text by a
//given pattern
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class spliteStringPattern {
 public static void main(String args[])
 {
     String text = "geeks for geeks ";

     // Specifies the string pattern which is to be searched
     String delimiter =  " ";
     Pattern pattern = Pattern.compile(delimiter,
                                     Pattern.CASE_INSENSITIVE);

     // Used to perform case insensitive search of the string
     String[] result = pattern.split(text);


     for (String temp : result)
         System.out.println(temp);
 }
}
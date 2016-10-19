// t9 dictonary for mobile keypad phones   NEED TO UNDERSTAND
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;



//1             2 (abc)     3 (def)
//4 (ghi)       5 (jkl)     6 (mno)
//7 (pqrs)      8 (tuv)     9 (wxyz)
//*             space       #

// Implements the T9 predictive text input by generating all
// possible words for each keypad sequence
public class GenerateAndDiscard {

	public static void main(String[] args){
		//path to dictionary file
		String dictFile = "/home/nitin/workspace/Practice/t9/wordsForPrediction";

		//word for which keypad equivalents have to be found
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the word for which all possible T9 you want");
		//eg : hoof
		String word = sc.nextLine();

		List buckets = createBuckets();

		try{
			Set dict = getDict(dictFile);
			System.out.println("wordcount: "+dict.size());

			//long startTime = System.currentTimeMillis(); //to calculate execution time  ---> step.1
			Set matches = getMatchingWords(word, dict, buckets);
			//System.out.println("match time: "+ (System.currentTimeMillis()-startTime));  //to calculate execution time  ---> step.2
			System.out.println("word is : "+word +" matches are : "+matches);
		} catch(FileNotFoundException e){
			System.out.println("Could not find dict: "+dictFile);
			e.printStackTrace();
		} catch(IOException e){
			System.out.println("Error loading dict: "+dictFile);
			e.printStackTrace();
		} finally {
		    sc.close();
		}
	}

	static Set getMatchingWords(String word, Set dict, List buckets){
		Set matches = new HashSet();
		List wordBuckets = getWordBuckets(word, buckets);
		getBucketWords(wordBuckets, 0, "", matches);
		matches.retainAll(dict);
		return matches;
	}

	/**
	 * Import function make all possible combination of words...
	 * @param wordBuckets
	 * @param bucketIndex
	 * @param curStr
	 * @param result
	 * @return
	 */
	static Set getBucketWords(List wordBuckets, int bucketIndex, String curStr,
			Set result){
		if(bucketIndex == wordBuckets.size()){
			result.add(curStr);
		}else{
		    String curBucket = (String)wordBuckets.get(bucketIndex);
		    for(int i=0;i<curBucket.length();i++){
		    	String newStr = new String(curStr);
		    	newStr = newStr + curBucket.charAt(i);
		    	getBucketWords(wordBuckets, bucketIndex+1, newStr, result);
		    }
		}
		return result;
	}

	static List createBuckets(){
		List buckets = Arrays.asList(new String[]{"abc", "def","ghi", "jkl",
				"mno","pqrs","tuv","wxyz"});
		return buckets;
	}

	static Set getDict(String dictFile) throws FileNotFoundException, IOException{
		Set dict = new HashSet();
		FileReader fr = null;
		try{
			fr = new FileReader(dictFile);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while((line=br.readLine()) != null){
				line = line.trim();
				dict.add(line);
			}
		}finally{
			if(fr != null){
				try{
				    fr.close();
				}catch(IOException e){

				}
			}
		}
		return dict;
	}

	static List getWordBuckets(String word, List buckets){
		List wordBuckets = new ArrayList();
		for(int i=0;i<word.length();i++){
		    char ch = word.charAt(i);
			boolean isFound = false;
			for(Iterator it=buckets.iterator();!isFound && it.hasNext();){
				String bucket = (String)it.next();
				if(bucket.indexOf(ch) != -1){
					wordBuckets.add(bucket);
					isFound = true;
				}
			}
		}
		//add all the char of a string where one char is lie eg: a will add -> "abc"
		return wordBuckets;
	}
}
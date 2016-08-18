import java.io.*;

public class ReadFile {
	public static void main (String args[]) throws IOException {
		FileReader file = new FileReader("/home/nitin/Documents/nitin/java Algorithm Derek/readFileSample.txt");
		BufferedReader br = new BufferedReader(file);
		
		for(int i =0; i < 5; i++)
			System.out.println(br.readLine());
		
		br.close();
		
	}
}

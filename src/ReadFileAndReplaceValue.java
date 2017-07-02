import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ReadFileAndReplaceValue {
    static Map<String, String> map = new HashMap<String, String>();

    public static void main(String[] args) throws IOException {
        String path = "/home/nitinnigam/Desktop/ACT";

        map.put("1,206.00", "2,298.00");
        map.put("1,206.36", "2,298.36");
        map.put("1,306.00", "2,398.00");
        map.put("1,049.00", "1,999.00");
        map.put("5.25", "10.00");
        map.put("ACT Blaze", "ACT Incredible");
        map.put("146.86", "279.36");

        readFilesOfFolders(path, map);
    }

    private static void readFilesOfFolders(String path, Map<String, String> map) throws IOException {
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles) {
            if (file.isFile()) {
                try {
                    System.out.println("Update File " + file.getName() + "...");
                    modifiedFile(file, map);
                } catch (FileNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

    }

    private static void modifiedFile(File file, Map<String, String> map) throws IOException {
        FileReader page = new FileReader(file);
        BufferedReader br = new BufferedReader(page);
        String line = "";
        String s = "";
        while ((line = br.readLine()) != null) {
            s = s + line;
        }

        Iterator<Entry<String, String>> itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Entry<String, String> e = itr.next();
            String key = e.getKey();
            String val = e.getValue();

            s = s.replaceAll(key, val);

        }

        System.out.println("hiii" + s);
        FileWriter fw = new FileWriter(file);
        fw.write(s);

        fw.close();
        br.close();

    }
}

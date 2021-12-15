package add.console;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

// class that reads data from file
// and return the data
public class TextFileReader {
    Logger log = Logger.getLogger(this.getClass().getName());
     public List<String> readFromProjectPath (String fileName) {
         List<String> lines = new ArrayList<>();
         String projectPath = "src/data/director/" + fileName;
         // using path to create a file
         File file = new File(projectPath);
         // getting full path
         String fullPath = file.getAbsolutePath();

         try {
             BufferedReader reader = new BufferedReader(new FileReader(fullPath));
             String line;
             while ((line = reader.readLine()) != null) {
                 lines.add(line);
             }
             reader.close();
         } catch (FileNotFoundException e) {
             log.severe(e.getMessage());
         } catch (IOException e) {
             log.severe(e.getStackTrace().toString());
         }
         return  lines;
     }
}

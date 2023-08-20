package fileread;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FolderExtractor {

    public static void main(String[] args) {
        String folderPath = "/Users/megha/Documents/Placement/Educative/Grokking_Patterns for Coding/Grokking_Patterns_for_Coding";
        String csvFilePath = "/Users/megha/Documents/Placement/Educative/Grokking_Patterns for Coding/output_1.csv";

        try {
            FileWriter csvWriter = new FileWriter(csvFilePath);
            csvWriter.append("Folder Name\n");
            extractFolderNames(folderPath, csvWriter);
            csvWriter.flush();
            csvWriter.close();
            System.out.println("Data successfully extracted to " + csvFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void extractFolderNames(String folderPath, FileWriter csvWriter) throws IOException {
        File folder = new File(folderPath);
        int count=1;
        if (folder.isDirectory()) {
            File[] files = folder.listFiles();
            Arrays.sort(files);
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        String rootFileName=file.getName();
                        File[] subFolderName = file.listFiles();
                        Arrays.sort(subFolderName);
                        for (File subfile : subFolderName) {
                            if (subfile.isDirectory()) {
                                csvWriter.append(count+" | "+rootFileName+" | "+subfile.getName() + "\n");
                                //extractFolderNames(file.getAbsolutePath(), csvWriter);
                                count++;
                            }
                        }
                    }
                }
            }
        }
    }
}


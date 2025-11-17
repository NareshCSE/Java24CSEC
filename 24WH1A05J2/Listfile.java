package vaishnavi;
import java.io.File;

public class Listfile {
    public static void main(String[] args) {
        // Change this path to the directory you want to scan
        String path = "C:\\Users\\admin\\Documents.";

        File folder = new File(path);

        if (folder.exists() && folder.isDirectory()) {
            System.out.println("Listing files in: " + folder.getAbsolutePath());
            listFiles(folder);
        } else {
            System.out.println("Invalid directory path.");
        }
    }

    // Recursive method to list files and subdirectories
    public static void listFiles(File dir) {
        File[] files = dir.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println("File: " + file.getAbsolutePath());
                } else if (file.isDirectory()) {
                    System.out.println("Directory: " + file.getAbsolutePath());
                    listFiles(file); // recursive call
                }
            }
        }
    }
}
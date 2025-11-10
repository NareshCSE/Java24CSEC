package src;

import java.io.File;

public class ListFilesRecursive {
    public static void main(String[] args) {
        // Change this path to the directory you want to scan
        String path = "C:\\Users\\admin\\Desktop\\24wh1a05J1"; 
        File folder = new File(path);

        if (folder.exists() && folder.isDirectory()) {
            listFiles(folder);
        } else {
            System.out.println("Invalid directory path.");
        }
    }

    // Recursive method to list files
    public static void listFiles(File dir) {
        File[] files = dir.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println("File: " + file.getAbsolutePath());
                } else if (file.isDirectory()) {
                    System.out.println("Directory: " + file.getAbsolutePath());
                    listFiles(file); // Recursively list subdirectory
                }
            }
        }
    }
}

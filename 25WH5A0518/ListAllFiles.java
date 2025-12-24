package sathvika_25wh5a0518;
import java.io.File;
public class ListAllFiles {
    public static void listFiles(String directoryPath) {
        File dir = new File(directoryPath);
        if (!dir.exists()) {
            System.out.println("Directory does not exist: " + directoryPath);
            return;
        }
        File[] filesList = dir.listFiles();
        if (filesList == null) {
            System.out.println("No files found or directory is empty.");
            return;
        }
        for (File file : filesList) {
            if (file.isFile()) {
                System.out.println("File: " + file.getAbsolutePath());
            } else if (file.isDirectory()) {
                System.out.println("Directory: " + file.getAbsolutePath());
                listFiles(file.getAbsolutePath());
            }}}
    public static void main(String[] args) {
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
			System.out.print("Enter directory path: ");
			String path = sc.nextLine();
			listFiles(path);
		}
    }
}

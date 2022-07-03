import java.io.File; // Import the File class

public class JavaFile {

  public static void main(String[] args) {
    File file = new File("filename.txt"); // Create a File object
    System.out.println(file.canWrite()); // Print the name of the file
  }
}

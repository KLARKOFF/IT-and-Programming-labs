import java.io.*;
import java.nio.file.*;

public class Program {
  static class FileOpeningException extends Exception {
    public FileOpeningException(String filename) {
      super("Не удалось открыть файл " + filename);
    }
  }

  static class FileWritingException extends Exception {
    public FileWritingException(String filename) {
      super("Не удалось записать в файл " + filename);
    }
  }

  public static void main(String[] args) {
    if (args.length != 2) {
      System.out.println("Usage: java Main.java <file to copy FROM> <file to copy IN>");
      return;
    }
    String from = args[0];
    String to = args[1];

    try {
      File source = new File(from);
      if (!source.exists() || !source.isFile())
        throw new FileOpeningException(from);

      if (from.equals(to))
        throw new Exception("Вы пытаетесь скопировать файл в него самого!");

      File copy = new File(to);

      try (FileInputStream input = new FileInputStream(source);
           FileOutputStream output = new FileOutputStream(copy)) {

        byte[] buf = new byte[8192];
            int bytesRead;
            
            while ((bytesRead = input.read(buf)) != -1) {
                output.write(buf, 0, bytesRead);
                
                if (bytesRead == -1 || bytesRead > buf.length) {
                    throw new FileWritingException(to);
                }
            }
        
      } catch (FileWritingException e) {
        return;
      } catch (Exception e) {
        return;
      }
    } catch (FileOpeningException e) {
      return;
    } catch (Exception e) {
      return;
    }
  }
}

package classwork.IO;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by CCowalsky on 19.11.2015.
 */
public class IOMain {

    public static void main(String[] args) {

        try (DataOutputStream stream = new DataOutputStream(new FileOutputStream("c:/myData.txt"))){

            long[]longs = new long[]{1,2,3,4,5,6};

            for(long aLong : longs){
                stream.writeLong(aLong);
            }

        }catch (IOException e){
            System.out.println(e);
        }

        try (DataInputStream inputStream = new DataInputStream(new FileInputStream("c:/myData.txt"))){

            try {
                while (true){
                    System.out.print(inputStream.readLong() + " ");
                }
            }catch (EOFException e){
                System.out.println("END");
            }

        }catch (IOException e){
            System.out.println(e);
        }


    }

    private static void bufferRead() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("C://myFile.txt"), Charset.forName("windows-1251")))) {
                String value;
                while((value=reader.readLine())!=null){
                    System.out.println(value);
                }

            }catch(IOException e){
                System.out.println(e);
            /*throw new RuntimeException();*/
            }
    }


    private static void charRead() {
        try {
            InputStreamReader reader = new InputStreamReader(new FileInputStream("C://myFile.txt"), Charset.forName("windows-1251"));
            int value;
            while ((value = reader.read()) != -1) {
                System.out.print((char) value);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }


    private static void copyBytes() {
        try (InputStream inputStream = new FileInputStream("C://myFile.txt");
             OutputStream outputStream = new FileOutputStream("C://myFile_copy.txt")) {
            int value;
            while ((value = inputStream.read()) != -1) {
                System.out.print((char) value);
                outputStream.write(value);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private static void readWithResourses() {
        try (InputStream inputStream = new FileInputStream("C://myFile.txt")) {
            int value;
            while ((value = inputStream.read()) != -1) {
                System.out.print((char) value);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private static void uglyRead() {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("C://myFile.txt");
            int value;
            while ((value = inputStream.read()) != -1) {
                System.out.print((char) value);
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            if (inputStream != null)
                try {
                    inputStream.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
        }
    }

    private static void pathesAndFileCreation() throws IOException {
        String win = "c:\\HaxLogs.txt";
        String unix = "c://MSI";

        File winfile = new File(win);

        System.out.println("win file exists: " + winfile.exists());

        File unixfile = new File(unix);

        System.out.println("unix file exists: " + unixfile.exists());


        Path path = Paths.get("myFile.txt");
        System.out.println(path);
        System.out.println(path.toAbsolutePath());

        Path absolutli = Paths.get("/myFile.txt");
        System.out.println(absolutli);
        System.out.println(absolutli.toAbsolutePath());

        if (!Files.exists(absolutli)) {
            Files.createFile(absolutli);
            System.out.println("file created");
        } else {
            System.out.println("file already exists");
        }
    }
}
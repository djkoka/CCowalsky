package classwork.IO;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

/**
 * Created by CCowalsky on 19.11.2015.
 */
public class IOMain {

    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("C:\\Users\\CCowalsky\\MyHillelJava\\Hillel\\config.properties")) {
            Properties properties = new Properties();
            properties.load(inputStream);
            String carOwner = properties.getProperty("carOwner");
            String carModel = properties.getProperty("carModel");
            String carYear = properties.getProperty("carYear");

            CarOwner owner = new CarOwner(carOwner);
            Car car = new Car(carModel, Integer.parseInt(carYear),owner,"black");
            System.out.println(car);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private static void objectStore() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("c:/myData.txt"))) {

            CarOwner carOwner = new CarOwner("Ivan");

            List<Car> cars = Arrays.asList(new Car("Wolf", 1996, carOwner, "Green"),
                    new Car("Cat", 2313, carOwner, "Blue"));

            for (Car car : cars) {
                carOwner.addCar(car);
            }

            outputStream.writeObject(cars);
        } catch (IOException e) {
            System.out.println(e);
        }

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("c:/myData.txt"))) {
            List<Car> cars = (List<Car>) inputStream.readObject();
            System.out.println(cars);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }


    private static void arrays() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("c:/myData.txt"))) {
            long[] longs = new long[]{1, 2, 3, 4, 5, 6};
            outputStream.writeObject(longs);
        } catch (IOException e) {
            System.out.println(e);
        }

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("c:/myData.txt"))) {
            long[] longs = (long[]) inputStream.readObject();
            //Object longAsObj = inputStream.readObject();
            System.out.println(Arrays.toString(longs));
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }

    private static void primitiveTypes() {
        try (DataOutputStream stream = new DataOutputStream(new FileOutputStream("c:/myData.txt"))) {

            long[] longs = new long[]{1, 2, 3, 4, 5, 6};

            for (long aLong : longs) {
                stream.writeLong(aLong);
            }

        } catch (IOException e) {
            System.out.println(e);
        }

        try (DataInputStream inputStream = new DataInputStream(new FileInputStream("c:/myData.txt"))) {

            try {
                while (true) {
                    System.out.print(inputStream.readLong() + " ");
                }
            } catch (EOFException e) {
                System.out.println("END");
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private static void bufferRead() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("C://myFile.txt"), Charset.forName("windows-1251")))) {
            String value;
            while ((value = reader.readLine()) != null) {
                System.out.println(value);
            }

        } catch (IOException e) {
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
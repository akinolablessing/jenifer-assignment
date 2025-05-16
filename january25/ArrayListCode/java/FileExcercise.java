import com.sun.jdi.PathSearchingVirtualMachine;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.nio.file.*;
import java.util.Arrays;

public class FileExcercise {
    public  static void main(String[] args){
        File file = new File("C:\\Users\\DELL\\Desktop\\assignment\\january25\\ArrayListCode\\java\\myfiles.txt");


        try {

            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bytes = new byte[5];
            int result = fileInputStream.readNBytes(bytes, 0,5);
            System.out.println(Arrays.toString(bytes));
            String  value = new String(bytes);
            System.out.println(value);
            System.out.println(result);
    } catch (Exception e) {
       System.err.println(e);

    }
    }
    }

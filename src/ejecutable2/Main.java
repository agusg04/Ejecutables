package ejecutable2;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    //Hacer un loop de echos sin .bat
    public static void main(String[] args) throws IOException {

        System.out.println(System.getProperty("os."));

        String escritorio = System.getProperty("user.home");

        FileWriter fw = new FileWriter("si");

        ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", "start", "cmd.exe", "/k", "for /l %i in (0, 0, 1) do echo Hola");
        try {
            processBuilder.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

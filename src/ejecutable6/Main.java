package ejecutable6;

import java.io.IOException;

public class Main {
    //Apagar ordenador

    public static void main(String[] args) throws IOException {
        ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", "shutdown", "/s", "/t", "0");
        processBuilder.start();
    }
}

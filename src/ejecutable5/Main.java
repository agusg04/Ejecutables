package ejecutable5;

import java.io.IOException;

public class Main {
    //Bloquear pantalla
    public static void main(String[] args) throws IOException {
        ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", "rundll32.exe", "user32.dll,LockWorkStation");
        processBuilder.start();
    }
}

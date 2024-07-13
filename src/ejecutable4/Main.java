package ejecutable4;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    //Hacer un loop de echos con .bat

    public static void main(String[] args) throws IOException {
        String script = System.getProperty("user.home") + "\\Escritorio\\loop.bat";
        FileWriter fw = new FileWriter(script);
        fw.write("@echo off\n:loop\necho Hola\ngoto loop");
        fw.close();

        ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", "start", script);
        processBuilder.start();


    }
}

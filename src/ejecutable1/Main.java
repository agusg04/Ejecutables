package ejecutable1;

public class Main {
    //Abrir terminal en C:
    public static void main(String[] args) {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", "start", "cmd.exe", "/k", "cd /d C:\\");
            processBuilder.start();

        } catch (Exception e) {

        }
    }

}

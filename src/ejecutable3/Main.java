package ejecutable3;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    //Escribir propiedades del sistema en un .txt
    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter(System.getProperty("user.home") + "\\Escritorio\\datos.txt");

        fw.write("Sistema Operativo: " + System.getProperty("os.name") + System.lineSeparator());
        fw.write("Versión del Sistema Operativo: " + System.getProperty("os.version") + System.lineSeparator());
        fw.write("Arquitectura del Sistema Operativo: " + System.getProperty("os.arch") + System.lineSeparator());
        fw.write("Versión de Java: " + System.getProperty("java.version") + System.lineSeparator());
        fw.write("Proveedor de Java: " + System.getProperty("java.vendor") + System.lineSeparator());
        fw.write("URL del proveedor de Java: " + System.getProperty("java.vendor.url") + System.lineSeparator());
        fw.write("Directorio de instalación de Java: " + System.getProperty("java.home") + System.lineSeparator());
        fw.write("Nombre de usuario: " + System.getProperty("user.name") + System.lineSeparator());
        fw.write("Directorio principal del usuario: " + System.getProperty("user.home") + System.lineSeparator());
        fw.write("Directorio de trabajo actual: " + System.getProperty("user.dir") + System.lineSeparator());
        fw.write("Separador de líneas: " + System.getProperty("line.separator"));
        fw.write("Separador de archivos: " + System.getProperty("file.separator") + System.lineSeparator());
        fw.write("Separador de ruta: " + System.getProperty("path.separator") + System.lineSeparator());
        fw.write("Directorio temporal por defecto: " + System.getProperty("java.io.tmpdir") + System.lineSeparator());
        fw.write("Ruta de búsqueda de clases Java: " + System.getProperty("java.class.path") + System.lineSeparator());

        fw.close();
    }
}

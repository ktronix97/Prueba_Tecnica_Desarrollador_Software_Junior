package fuentes;

import java.util.ArrayList;
import java.util.List;

import modelos.Documento;

/**
 * Fuente de datos que simula la lectura de archivos locales.
 */

public class FuenteArchivo implements FuenteDatos {
    @Override
    public List<Documento> obtenerDocumentos() {
        System.out.println("Obteniendo documentos desde archivos locales...");
        List<Documento> docs = new ArrayList<>();
        docs.add(new Documento("Archivo 1", "Contenido archivo 1", "Archivo"));
        docs.add(new Documento("Archivo 2", "Contenido archivo 2", "Archivo"));
        return docs;
    }
}

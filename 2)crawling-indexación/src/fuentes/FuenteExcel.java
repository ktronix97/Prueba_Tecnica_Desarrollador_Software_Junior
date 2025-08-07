package fuentes;

import java.util.ArrayList;
import java.util.List;

import modelos.Documento;

/**
 * Fuente de datos que simula la extracción de documentos desde un archivo Excel.
 */

public class FuenteExcel implements FuenteDatos {
    @Override
    public List<Documento> obtenerDocumentos() {
        System.out.println("Leyendo documentos desde archivo Excel...");
        List<Documento> docs = new ArrayList<>();
        docs.add(new Documento("Excel 1", "Contenido Excel 1", "Excel"));
        return docs;
    }
}

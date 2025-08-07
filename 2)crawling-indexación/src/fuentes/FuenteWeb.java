package fuentes;

import java.util.ArrayList;
import java.util.List;

import modelos.Documento;

/**
 * Fuente de datos que simula el crawling de páginas web.
 */

public class FuenteWeb implements FuenteDatos {
    @Override
    public List<Documento> obtenerDocumentos() {
        System.out.println("Crawleando documentos desde la web...");
        List<Documento> docs = new ArrayList<>();
        docs.add(new Documento("Web 1", "Contenido web 1", "Web"));
        docs.add(new Documento("Web 2", "Contenido web 2", "Web"));
        return docs;
    }
}
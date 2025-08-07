package fuentes;
import java.util.List;
import modelos.Documento;

/**
 * Interfaz que representa una fuente de datos.
 * Cada clase que la implemente debe devolver una lista de documentos simulados.
 */

public interface FuenteDatos {
    List<Documento> obtenerDocumentos();
}
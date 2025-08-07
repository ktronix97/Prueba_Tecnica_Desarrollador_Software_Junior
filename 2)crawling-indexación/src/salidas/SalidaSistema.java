package salidas;
import java.util.List;

import modelos.Documento;

/**
 * Interfaz que representa una forma de salida de los resultados del sistema.
 */

public interface SalidaSistema {
    void mostrarResultados(List<Documento> documentos);
}

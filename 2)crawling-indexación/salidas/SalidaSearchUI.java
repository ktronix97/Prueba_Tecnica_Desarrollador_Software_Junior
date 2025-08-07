package salidas;
import java.util.List;

import modelos.Documento;

/**
 * Salida que simula mostrar los resultados en una interfaz de búsqueda.
 */

public class SalidaSearchUI implements SalidaSistema {
    @Override
    public void mostrarResultados(List<Documento> documentos) {
        System.out.println("🔍 Resultados en Search UI:");
        for (Documento doc : documentos) {
            System.out.println("  - " + doc);
        }
    }
}

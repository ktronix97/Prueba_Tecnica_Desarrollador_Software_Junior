package salidas;
import java.util.List;

import modelos.Documento;

/**
 * Salida que simula mostrar los resultados en un dashboard visual.
 */

public class SalidaDashboard implements SalidaSistema {
    @Override
    public void mostrarResultados(List<Documento> documentos) {
        System.out.println("📊 Resultados en Dashboard:");
        for (Documento doc : documentos) {
            System.out.println("  * " + doc);
        }
    }
}

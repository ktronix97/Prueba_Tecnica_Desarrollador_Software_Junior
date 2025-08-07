package servicios;

import modelos.Documento;
import java.util.*;

/**
 * Clase que simula el buscador del sistema.
 * Realiza una "búsqueda simulada" y retorna documentos de distintas fuentes.
 */
public class Buscador {

    /**
     * Simula una búsqueda que retorna un documento por fuente (sin repetir origen).
     * @param consulta Texto de búsqueda (no se usa en lógica real).
     * @param documentos Lista total de documentos disponibles.
     * @return Lista con hasta un documento por fuente de origen diferente.
     */
    public List<Documento> buscar(String consulta, List<Documento> documentos) {
        System.out.println("Realizando búsqueda simulada con la consulta: '" + consulta + "'");

        List<Documento> resultado = new ArrayList<>();
        Set<String> fuentesAgregadas = new HashSet<>();

        for (Documento doc : documentos) {
            if (!fuentesAgregadas.contains(doc.getFuenteOrigen())) {
                resultado.add(doc);
                fuentesAgregadas.add(doc.getFuenteOrigen());
            }

            // Opcional: limitar a 3 resultados
            if (resultado.size() >= 3) break;
        }

        return resultado;
    }
}



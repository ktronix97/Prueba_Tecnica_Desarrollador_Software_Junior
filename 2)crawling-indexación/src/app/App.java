package app;
import java.util.ArrayList;
import java.util.List;

import fuentes.FuenteDatos;
import fuentes.FuenteDatosFactory;
import modelos.Documento;
import salidas.SalidaDashboard;
import salidas.SalidaSearchUI;
import salidas.SalidaSistema;
import servicios.Buscador;

/**
 * Clase principal que simula el sistema completo de crawling, indexación y salida.
 */
public class App {
    public static void main(String[] args) {
        // Lista de tipos de fuentes de datos a simular
        List<String> tiposFuentes = List.of("archivo", "web", "excel");
        List<Documento> todosLosDocumentos = new ArrayList<>();
        // Usar factory para crear fuentes y obtener documentos
        for (String tipo : tiposFuentes) {
            FuenteDatos fuente = FuenteDatosFactory.crearFuente(tipo);
            todosLosDocumentos.addAll(fuente.obtenerDocumentos());
        }

        // Simular búsqueda sobre todos los documentos
        Buscador buscador = new Buscador();
        List<Documento> resultados = buscador.buscar("proyecto", todosLosDocumentos);

        // Mostrar los resultados en diferentes salidas
        List<SalidaSistema> salidas = List.of(new SalidaSearchUI(), new SalidaDashboard());
        for (SalidaSistema salida : salidas) {
            salida.mostrarResultados(resultados);
        }
    }
}

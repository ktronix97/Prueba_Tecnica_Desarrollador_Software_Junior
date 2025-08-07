package fuentes;

/**
 * Clase Factory que se encarga de crear instancias de diferentes fuentes de datos.
 */

public class FuenteDatosFactory {
	
	/**
	 * Crea una fuente de datos en función del tipo especificado.
	 * @param tipo Tipo de fuente (por ejemplo: "archivo", "web", "excel").
	 * @return Instancia de FuenteDatos correspondiente.
	 */
    public static FuenteDatos crearFuente(String tipo) {
        return switch (tipo.toLowerCase()) {
            case "archivo" -> new FuenteArchivo();
            case "web" -> new FuenteWeb();
            case "excel" -> new FuenteExcel();
            default -> throw new IllegalArgumentException("Tipo de fuente no soportado: " + tipo);
        };
    }
}
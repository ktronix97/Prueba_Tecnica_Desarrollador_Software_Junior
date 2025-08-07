package modelos;

/**
 * Clase que representa un documento extraído desde alguna fuente de datos.
 */

public class Documento {
    private String titulo;
    private String contenido;
    private String fuenteOrigen;

    public Documento(String titulo, String contenido, String fuenteOrigen) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.fuenteOrigen = fuenteOrigen;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public String getFuenteOrigen() {
        return fuenteOrigen;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "titulo='" + titulo + '\'' +
                ", fuenteOrigen='" + fuenteOrigen + '\'' +
                '}';
    }
}

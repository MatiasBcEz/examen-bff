package cl.duoc.examen.model.dto;

import java.util.List;

public class categoria {
    private int    idCategoria;
    private String nombre;
    private List<instrumento> instrumentosByIdCategoria;
    
    public categoria(int idCategoria, String nombre, List<instrumento> instrumentosByIdCategoria) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.instrumentosByIdCategoria = instrumentosByIdCategoria;
    }
    public categoria() {
    }
    public int getIdCategoria() {
        return idCategoria;
    }
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public List<instrumento> getInstrumentosByIdCategoria() {
        return instrumentosByIdCategoria;
    }
    public void setInstrumentosByIdCategoria(List<instrumento> instrumentosByIdCategoria) {
        this.instrumentosByIdCategoria = instrumentosByIdCategoria;
    }
}

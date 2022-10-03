package biblioteca.proyecto.Model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table (name="Libros")
public class Libros implements Serializable {

    @Id
    @Column(name="Cod_libro")
    private int Cod_libro;

    @Column(name="Nombre_libro")
    private String Nombre_libro;

    @Column(name="Editorial")
    private String Editorial;

    @Column(name="Autor")
    private String Autor;
    
    @Column(name="Genero")
    private String Genero;

    @Column(name="No_paginas")
    private int No_paginas;

    @Column(name="Fecha_lanzamiento")
    private String Fecha_lanzamiento;

    public int getCod_libro() {
        return Cod_libro;
    }

    public void setCod_libro(int cod_libro) {
        Cod_libro = cod_libro;
    }

    public String getNombre_libro() {
        return Nombre_libro;
    }

    public void setNombre_libro(String nombre_libro) {
        Nombre_libro = nombre_libro;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String editorial) {
        Editorial = editorial;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public int getNo_paginas() {
        return No_paginas;
    }

    public void setNo_paginas(int no_paginas) {
        No_paginas = no_paginas;
    }

    public String getFecha_lanzamiento() {
        return Fecha_lanzamiento;
    }

    public void setFecha_lanzamiento(String fecha_lanzamiento) {
        Fecha_lanzamiento = fecha_lanzamiento;
    }

    
}

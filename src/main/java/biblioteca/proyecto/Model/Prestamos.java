package biblioteca.proyecto.Model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table (name="Prestamos")
public class Prestamos implements Serializable{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="No_prestamo")
    private int No_prestamo;

    @Column(name="Codi_libro")
    private int Codi_libro;

    @Column(name="Codi_usuario")
    private int Codi_usuario;

    @Column(name="Fecha_prestamo")
    private String Fecha_prestamo;

    @Column(name="Fecha_devolucion")
    private String Fecha_devolucion;

    public int getCodi_libro() {
        return Codi_libro;
    }

    public void setCodi_libro(int codi_libro) {
        Codi_libro = codi_libro;
    }

    public int getCodi_usuario() {
        return Codi_usuario;
    }

    public void setCodi_usuario(int codi_usuario) {
        Codi_usuario = codi_usuario;
    }

    public String getFecha_prestamo() {
        return Fecha_prestamo;
    }

    public void setFecha_prestamo(String fecha_prestamo) {
        Fecha_prestamo = fecha_prestamo;
    }

    public String getFecha_devolucion() {
        return Fecha_devolucion;
    }

    public void setFecha_devolucion(String fecha_devolucion) {
        Fecha_devolucion = fecha_devolucion;
    }

    public int getNo_prestamo() {
        return No_prestamo;
    }

    public void setNo_prestamo(int no_prestamo) {
        No_prestamo = no_prestamo;
    }


}
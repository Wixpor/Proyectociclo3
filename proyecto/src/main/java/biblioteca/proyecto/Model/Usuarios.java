package biblioteca.proyecto.Model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table (name="Usuarios")
public class Usuarios implements Serializable{

    @Id
    @Column(name="Numero_ident")
    private int Numero_ident;

    @Column(name="Nombre")
    private String Nombre;

    @Column(name="Apellidos")
    private String Apellidos;

    @Column(name="Tipo_ident")
    private String Tipo_ident;

    @Column(name="Direccion")
    private String Direccion;

    @Column(name="Edad")
    private int Edad;

    @Column(name="Ciudad")
    private String Ciudad;

    @Column(name="Correo_e")
    private String Correo_e;

    @Column(name="Contra")
    private String Contra;

    @Column(name="Administrador")
    private String Administrador;

    public int getNumero_ident() {
        return Numero_ident;
    }

    public void setNumero_ident(int numero_ident) {
        Numero_ident = numero_ident;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getTipo_ident() {
        return Tipo_ident;
    }

    public void setTipo_ident(String tipo_ident) {
        Tipo_ident = tipo_ident;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public String getCorreo_e() {
        return Correo_e;
    }

    public void setCorreo_e(String correo_e) {
        Correo_e = correo_e;
    }

    public String getContra() {
        return Contra;
    }

    public void setContra(String contra) {
        Contra = contra;
    }

    public String getAdministrador() {
        return Administrador;
    }

    public void setAdministrador(String administrador) {
        Administrador = administrador;
    }

    

    
}

package biblioteca.proyecto.Model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table (name="Formulas")
public class Formulas implements Serializable {

    @Id
    @Column(name="Id")
    private int Id;

    @Column(name="Codigo")
    private String Codigo;

    @Column(name="Nombre")
    private String Nombre;

    @Column(name="Descripcion")
    private String Descripcion;

    @Column(name="NameAG1")
    private String NameAG1;

    @Column(name="NameAG2")
    private String NameAG2;
    
    @Column(name="NameAG3")
    private String NameAG3;

    @Column(name="NameAG4")
    private String NameAG4;

    @Column(name="NameCemento1")
    private String NameCemeneto1;
    
    @Column(name="NameCemento2")
    private String NameCemeneto2;
    
    @Column(name="NameCemento3")
    private String NameCemeneto3;
    
    @Column(name="NameCemento4")
    private String NameCemeneto4;

    @Column(name="NameAD1")
    private String NameAD1;

    @Column(name="NameAD2")
    private String NameAD2;

    @Column(name="NameAD3")
    private String NameAD3;

    @Column(name="NameAD4")
    private String NameAD4;
    
    @Column(name="NameAD5")
    private String NameAD5;
    
    @Column(name="NameAD6")
    private String NameAD6;
    
    @Column(name="ValueAG1")
    private double valueAG1;
    
    @Column(name="ValueAG2")
    private double ValueAG2;
    
    @Column(name="ValueAG3")
    private double ValueAG3;
    
    @Column(name="ValueAG4")
    private double ValueAG4;

    // @Column(name="ValueCemento1")
    // private double ValueCemento1;
    
    // @Column(name="ValueCemento2")
    // private double ValueCemento2;
    
    // @Column(name="ValueCemento3")
    // private double ValueCemento3;
    
    // @Column(name="ValueCemento4")
    // private double ValueCemento4;

    @Column(name="ValueAD1")
    private double ValueAD1;
    
    @Column(name="ValueAD2")
    private double ValueAD2;
    
    @Column(name="ValueAD3")
    private double ValueAD3;
    
    @Column(name="ValueAD4")
    private double ValueAD4;

    // @Column(name="ValueAD5")
    // private double ValueAD5;
    
    // @Column(name="ValueAD6")
    // private double ValueAD6;
    
    // @Column(name="ValueAgua")
    // private double ValueAgua;

    // @Column(name="HumAG1")
    // private double HumAG1;
    
    // @Column(name="HumAG2")
    // private double HumAG2;
    
    // @Column(name="HumAG3")
    // private double HumAG3;
    
    // @Column(name="HumAG4")
    // private double HumAG4;

    // @Column(name="AbsAG1")
    // private double AbsAG1;

    // @Column(name="AbsAG2")
    // private double AbsAG2;
    
    // @Column(name="AbsAG3")
    // private double AbsAG3;
    
    // @Column(name="AbsAG4")
    // private double AbsAG4;
    
    // @Column(name="PrecioM3")
    // private double PrecioM3;
    
    // @Column(name="IVA")
    // private double IVA;
    
    // @Column(name="PrecioAD1")
    // private double PrecioAD1;

    // @Column(name="PrecioAD2")
    // private double PrecioAD2;
    
    // @Column(name="PrecioAD3")
    // private double PrecioAD3;
    
    // @Column(name="PrecioAD4")
    // private double PrecioAD4;

    @Column(name="IdPlanta")
    private String IdPlanta;
    
    // @Column(name="MOIS_REL_TABLE")
    // private String MOIS_REL_TABLE;
    
    @Column(name="CREADOR")
    private String CREADOR;
    
    @Column(name="Responsable")
    private String Responsable;
    
    // @Column(name="FechaCreacion")
    // private Date FechaCreacion;
    
    // @Column(name="FechaEdicion")
    // private Date FechaEdicion;
    
    // @Column(name="FAMILY")
    // private String FAMILY;
    
    @Column(name="NameAgua2")
    private String NameAgua2;
    
    @Column(name="ValueAgua2")
    private Double ValueAgua2;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getNameAG1() {
        return NameAG1;
    }

    public void setNameAG1(String nameAG1) {
        NameAG1 = nameAG1;
    }

    public String getNameAG2() {
        return NameAG2;
    }

    public void setNameAG2(String nameAG2) {
        NameAG2 = nameAG2;
    }

    public String getNameAG3() {
        return NameAG3;
    }

    public void setNameAG3(String nameAG3) {
        NameAG3 = nameAG3;
    }

    public String getNameAG4() {
        return NameAG4;
    }

    public void setNameAG4(String nameAG4) {
        NameAG4 = nameAG4;
    }

    public String getNameCemeneto1() {
        return NameCemeneto1;
    }

    public void setNameCemeneto1(String nameCemeneto1) {
        NameCemeneto1 = nameCemeneto1;
    }

    public String getNameCemeneto2() {
        return NameCemeneto2;
    }

    public void setNameCemeneto2(String nameCemeneto2) {
        NameCemeneto2 = nameCemeneto2;
    }

    public String getNameCemeneto3() {
        return NameCemeneto3;
    }

    public void setNameCemeneto3(String nameCemeneto3) {
        NameCemeneto3 = nameCemeneto3;
    }

    public String getNameCemeneto4() {
        return NameCemeneto4;
    }

    public void setNameCemeneto4(String nameCemeneto4) {
        NameCemeneto4 = nameCemeneto4;
    }

    public String getNameAD1() {
        return NameAD1;
    }

    public void setNameAD1(String nameAD1) {
        NameAD1 = nameAD1;
    }

    public String getNameAD2() {
        return NameAD2;
    }

    public void setNameAD2(String nameAD2) {
        NameAD2 = nameAD2;
    }

    public String getNameAD3() {
        return NameAD3;
    }

    public void setNameAD3(String nameAD3) {
        NameAD3 = nameAD3;
    }

    public String getNameAD4() {
        return NameAD4;
    }

    public void setNameAD4(String nameAD4) {
        NameAD4 = nameAD4;
    }

    public String getNameAD5() {
        return NameAD5;
    }

    public void setNameAD5(String nameAD5) {
        NameAD5 = nameAD5;
    }

    public String getNameAD6() {
        return NameAD6;
    }

    public void setNameAD6(String nameAD6) {
        NameAD6 = nameAD6;
    }

    public double getValueAG1() {
        return valueAG1;
    }

    public void setValueAG1(double valueAG1) {
        this.valueAG1 = valueAG1;
    }

    public double getValueAG2() {
        return ValueAG2;
    }

    public void setValueAG2(double valueAG2) {
        ValueAG2 = valueAG2;
    }

    public double getValueAG3() {
        return ValueAG3;
    }

    public void setValueAG3(double valueAG3) {
        ValueAG3 = valueAG3;
    }

    public double getValueAG4() {
        return ValueAG4;
    }

    public void setValueAG4(double valueAG4) {
        ValueAG4 = valueAG4;
    }

    public double getValueAD1() {
        return ValueAD1;
    }

    public void setValueAD1(double valueAD1) {
        ValueAD1 = valueAD1;
    }

    public double getValueAD2() {
        return ValueAD2;
    }

    public void setValueAD2(double valueAD2) {
        ValueAD2 = valueAD2;
    }

    public double getValueAD3() {
        return ValueAD3;
    }

    public void setValueAD3(double valueAD3) {
        ValueAD3 = valueAD3;
    }

    public double getValueAD4() {
        return ValueAD4;
    }

    public void setValueAD4(double valueAD4) {
        ValueAD4 = valueAD4;
    }

    public String getIdPlanta() {
        return IdPlanta;
    }

    public void setIdPlanta(String idPlanta) {
        IdPlanta = idPlanta;
    }

    public String getCREADOR() {
        return CREADOR;
    }

    public void setCREADOR(String cREADOR) {
        CREADOR = cREADOR;
    }

    public String getResponsable() {
        return Responsable;
    }

    public void setResponsable(String responsable) {
        Responsable = responsable;
    }

    public String getNameAgua2() {
        return NameAgua2;
    }

    public void setNameAgua2(String nameAgua2) {
        NameAgua2 = nameAgua2;
    }

    public Double getValueAgua2() {
        return ValueAgua2;
    }

    public void setValueAgua2(Double valueAgua2) {
        ValueAgua2 = valueAgua2;
    }
    

    

}

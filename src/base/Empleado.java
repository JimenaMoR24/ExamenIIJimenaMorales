package base;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Student
 */
import java.time.LocalDate;

public class Empleado {

    
    private int cedula;
    private String nombre;
    private String apellidos;
    private char genero;
    private String fechaNac;
    private String email;
    private double salario;
    private double porcComision;
    public Object getEmail;

    public Empleado(int cedula, String nombre, String apellidos, char genero, String fechaNac,
            String email, double salario, double porcComision) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.genero = genero;
        this.fechaNac = fechaNac;
        this.email = email;
        this.salario = salario;
        this.porcComision = porcComision;
    }

    public Empleado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getPorcComision() {
        return porcComision;
    }

    public void setPorcComision(double porcComision) {
        this.porcComision = porcComision;
    }

    @Override
    public String toString() {
        return "Empleado{"
                + "cedula=" + cedula
                + ", nombre='" + nombre + '\''
                + ", apellidos='" + apellidos + '\''
                + ", genero=" + genero
                + ", fechaNac=" + fechaNac
                + ", email='" + email + '\''
                + ", salario=" + salario
                + ", porcComision=" + porcComision
                + '}';

    }

    public void setFechaNacimiento(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setNombre(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setApellidos(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setGenero(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setEmail(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
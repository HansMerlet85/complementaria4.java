/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desarrollo_de_software;

/**
 *
 * @author jeyso
 */
public class paciente {
    private int id_paciente,telefono,ficha;
    private String nombre_paciente, correo, direccion;

    public paciente() {
        
        
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getFicha() {
        return ficha;
    }

    public void setFicha(int ficha) {
        this.ficha = ficha;
    }

    public String getNombre_paciente() {
        return nombre_paciente;
    }

    public void setNombre_paciente(String nombre_paciente) {
        this.nombre_paciente = nombre_paciente;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public paciente(int id_paciente, int telefono, int ficha, String nombre_paciente, String correo, String direccion) {
        this.id_paciente = id_paciente;
        this.telefono = telefono;
        this.ficha = ficha;
        this.nombre_paciente = nombre_paciente;
        this.correo = correo;
        this.direccion = direccion;
    }
    
}

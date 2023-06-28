/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desarrollo_de_software;

/**
 *
 * @author jeyso
 */
public class sede {
    private int id_sede;
    private String nombre_sede,ubicacion_sede;

    public sede() {
    }

    public sede(int id_sede, String nombre_sede, String ubicacion_sede) {
        this.id_sede = id_sede;
        this.nombre_sede = nombre_sede;
        this.ubicacion_sede = ubicacion_sede;
    }

    public int getId_sede() {
        return id_sede;
    }

    public void setId_sede(int id_sede) {
        this.id_sede = id_sede;
    }

    public String getNombre_sede() {
        return nombre_sede;
    }

    public void setNombre_sede(String nombre_sede) {
        this.nombre_sede = nombre_sede;
    }

    public String getUbicacion_sede() {
        return ubicacion_sede;
    }

    public void setUbicacion_sede(String ubicacion_sede) {
        this.ubicacion_sede = ubicacion_sede;
    }
    
}

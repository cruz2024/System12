package org.example.casesdatos;

public class ClienteData {

    private String nombre;
    private String direccion;
    private String ubicacion;
    private String telefono;


    public ClienteData(String nombre, String direccion, String ubicacion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ubicacion = ubicacion;
        this.telefono = telefono;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "ClienteData{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}

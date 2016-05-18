package persistencia_dto;


import interfaces.palaPadel;

/**
 * Created by ignaciosantonjamolina on 13/5/16.
 */
public class ClienteDTO{

    String dni;
    String nombre;
    String direccion;
    String telefono;
    palaPadel pa;
    boolean material;

    public ClienteDTO(String dni, String nombre, String direccion, String telefono, palaPadel pa, boolean material) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.pa = pa;
        this.material = material;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public palaPadel getPa() {
        return pa;
    }

    public void setPa(palaPadel pa) {
        this.pa = pa;
    }

    public boolean isMaterial() {
        return material;
    }

    public void setMaterial(boolean material) {
        this.material = material;
    }
}

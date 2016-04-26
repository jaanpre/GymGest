package gymGest;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

/**
 * Created by javia_000 on 22/04/2016.
 */
public class Actividad {
    private String nombre;
    private LocalDateTime inicioAct;
    private LocalDateTime finAct;
    private DayOfWeek dia;
    private Instalacion instalacion;

    public Actividad(String nombre, LocalDateTime inicioAct, LocalDateTime finAct, DayOfWeek dia, Instalacion instalacion) {
        this.nombre = nombre;
        this.inicioAct = inicioAct;
        this.finAct = finAct;
        this.dia = dia;
        this.instalacion = instalacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getInicioAct() {
        return inicioAct;
    }

    public void setInicioAct(LocalDateTime inicioAct) {
        this.inicioAct = inicioAct;
    }

    public LocalDateTime getFinAct() {
        return finAct;
    }

    public void setFinAct(LocalDateTime finAct) {
        this.finAct = finAct;
    }

    public Instalacion getInstalacion() {
        return instalacion;
    }

    public void setInstalacion(Instalacion instalacion) {
        this.instalacion = instalacion;
    }

    public DayOfWeek getDia() {
        return dia;
    }

    public void setDia(DayOfWeek dia) {
        this.dia = dia;
    }
}

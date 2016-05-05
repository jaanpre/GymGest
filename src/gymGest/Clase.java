package gymGest;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Clase {

	public enum tipoClase {PADEL, TENIS, NATACIÓN}

	private tipoClase tC;
	private DayOfWeek dw1, dw2;
	private LocalTime hora;
	private int duracion;
	private Monitor monitor;

	public Clase(DayOfWeek dw1, DayOfWeek dw2, tipoClase tC, LocalTime hora, int duracion, Monitor monitor) {

		this.tC = tC;
		this.dw1 = dw1;
		this.dw2 = dw2;
		this.hora = hora;
		this.duracion = duracion;
		this.monitor = monitor;
	}


	public tipoClase gettC() {
		return tC;
	}

	public void settC(tipoClase tC) {
		this.tC = tC;
	}

	public DayOfWeek getDw1() {
		return dw1;
	}

	public void setDw1(DayOfWeek dw1) {
		this.dw1 = dw1;
	}

	public DayOfWeek getDw2() {
		return dw2;
	}

	public void setDw2(DayOfWeek dw2) {
		this.dw2 = dw2;
	}

	public DayOfWeek getDia1() {

		return dw1;
	}

	public void setFechaDia1(DayOfWeek dw) {

		this.dw1 = dw;
	}

	public DayOfWeek getDia2() {

		return dw1;
	}

	public void setFechaDia2(DayOfWeek dw) {

		this.dw2 = dw;
	}

	public LocalTime getHora() {

		return hora;
	}

	public void setHora(LocalTime hora) {

		this.hora = hora;
	}

	public int getDuracion() {

		return duracion;
	}

	public void setDuracion(int duracion) {

		this.duracion = duracion;
	}

	public Monitor getMonitor() {

		return monitor;
	}

	public void setMonitor(Monitor monitor) {

		this.monitor = monitor;
	}

}

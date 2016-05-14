package gymGest;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ignaciosantonjamolina on 14/5/16.
 */
public class Reserva {

    int año;
    Month mes;
    int dia;
    int hora;
    int minutos;

    private List<Reserva> listaDeReservas = new ArrayList<Reserva>();

    // listadeReservas que se añaden si está libre

    public Reserva(int año, Month mes, int dia, int hora, int minutos) {
        this.año = año;
        this.mes = mes;
        this.dia = dia;
        this.hora = hora;
        this.minutos = minutos;
    }

    public void reservar(Reserva r){
        for(Reserva re : listaDeReservas){
            if(r.año == re.año && r.mes.equals(re.mes) && r.dia==re.dia && r.hora==re.hora && r.minutos==re.minutos) {
                listaDeReservas.add(r);
            }else{
                System.out.println("La pista está ocupada en ese horario");
            }
        }
    }
}

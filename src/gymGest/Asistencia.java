package gymGest;


import java.util.List;

public class Asistencia {

    Entrada entrada;
    Salida salida;

    public Asistencia(Entrada e, Salida s){
        this.entrada = e;
        this.salida = s;
    }

    public Entrada getEntrada() {
        return entrada;
    }

    public void setEntrada(Entrada entrada) {
        this.entrada = entrada;
    }

    public Salida getSalida() {
        return salida;
    }

    public void setSalida(Salida salida) {
        this.salida = salida;
    }

    //    public List<Entrada> getListaEntradas() {
//        return listaEntradas;
//    }
//
//    public List<Salida> getListaSalida() {
//        return listaSalida;
//    }
//
//    public void addEntrada(Entrada e){listaEntradas.add(e);}
//    public void deleteEntrada(Entrada e){listaEntradas.remove(e);}
//    public void addSalida(Salida s){listaSalida.add(s);}
//    public void deleteSalida(Salida s){listaSalida.remove(s);}

}

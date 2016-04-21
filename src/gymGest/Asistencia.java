package gymGest;


import java.util.List;

public class Asistencia {

    public Asistencia(Entrada e, Salida s){
        listaEntradas.add(e);
        listaSalida.add(s);
    }

    private List<Entrada> listaEntradas;
    private List<Salida> listaSalida;

    public List<Entrada> getListaEntradas() {
        return listaEntradas;
    }

    public List<Salida> getListaSalida() {
        return listaSalida;
    }

    public void addEntrada(Entrada e){listaEntradas.add(e);}
    public void deleteEntrada(Entrada e){listaEntradas.remove(e);}
    public void addSalida(Salida s){listaSalida.add(s);}
    public void deleteSalida(Salida s){listaSalida.remove(s);}

}

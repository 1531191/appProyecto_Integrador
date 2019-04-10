package mis.clases;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Divercity {

    private ArrayList<Ciudadano> listaC;

    public Divercity() {
        listaC = new ArrayList<>();

    }

    public ArrayList<Ciudadano> getListaC() {
        return listaC;
    }

    public void ingresarCiudadano(Ciudadano refC) {
        Ciudadano objC = busquedaS(refC.getCui());

        if (objC == null) {
            listaC.add(refC);
            JOptionPane.showMessageDialog(null, "El ciudadano ha ingresado");
        } else {
            JOptionPane.showMessageDialog(null, "El ciudadano ya esta en Divercity");
        }
    }

    public Ciudadano busquedaS(int cod) {
        Ciudadano refC = null;

        boolean estado = false;

        int i = 0;

        while (i < listaC.size() && estado == false) {

            if (cod == listaC.get(i).getCui()) {
                estado = true;
                refC = listaC.get(i);
            } else {
                i++;
            }
        }
        return refC;
    }

    public void ordenarCiudadanosAscPorCui() {

        int i, j;

        Ciudadano aux;

        for (i = 0; i < listaC.size() - 1; i++) {
            for (j = i + 1; j < listaC.size(); j++) {
                if (listaC.get(i).getCui() > listaC.get(i).getCui()) {
                    aux = listaC.get(i);
                    listaC.set(i, listaC.get(j));
                    listaC.set(j, aux);

                }
            }

        }
    }

    public void ordenarCiudadanosPorApellidos() {
        int i, j;

        Ciudadano aux;

        for (i = 0; i < listaC.size() - 1; i++) {
            for (j = i + 1; j < listaC.size(); j++) {
                if (listaC.get(i).getApellido().compareToIgnoreCase(listaC.get(j).getApellido()) > 0) {
                    aux = listaC.get(i);
                    listaC.set(i, listaC.get(j));
                    listaC.set(j, aux);
                }

            }
        }
    }

    public void ordenarCiudadanosPorApellidosYNombres() {
        int i, j;
        Ciudadano aux;

        for (i = 0; i < listaC.size() - 1; i++) {
            for (j = i + 1; j < listaC.size(); j++) {

                if (listaC.get(i).getApellido().compareTo(listaC.get(j).getApellido()) >= 0 && listaC.get(i).getNombre().compareToIgnoreCase(listaC.get(j).getNombre()) > 0) {
                    aux = listaC.get(i);
                    listaC.set(i, listaC.get(j));
                    listaC.set(j, aux);

                }
            }

        }
    }

    public Ciudadano busquedaBinariaPorCui(int cuiBusq) {

        Ciudadano refCiuBusq = null;

        int cen = 0, izq = 0, der = listaC.size() - 1;

        while (izq <= der && refCiuBusq == null) {

            cen = (izq + der) / 2;
            
            if (cuiBusq == listaC.get(cen).getCui()) {
                refCiuBusq = listaC.get(cen);
            } else if (cuiBusq < listaC.get(cen).getCui()) {
                der = cen - 1;
            } else {
                izq = cen + 1;
            }
        }

        return refCiuBusq;

    }

}

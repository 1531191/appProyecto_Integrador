package mis.clases;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Divercity {

    private ArrayList<Ciudadano> listaC;

    public Divercity() {
        listaC = new ArrayList<>();
        
        
    }
    
    public ArrayList<Ciudadano>getListaC(){
        return listaC;
    }
    
    public void ingresarCiudadano(Ciudadano refC){
        Ciudadano objC = busquedaS(refC.getCui());
    }

    private Ciudadano busquedaS(int cui) {
       /**/
    }

}

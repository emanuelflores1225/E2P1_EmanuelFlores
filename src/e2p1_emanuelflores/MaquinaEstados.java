package e2p1_emanuelflores;

import java.util.ArrayList;
import javax.swing.JOptionPane;
//import static e2p1_emanuelflores.E2P1_EmanuelFlores;

public class MaquinaEstados {
    String estado_actual;
    String aristas;
    
    public String getEstado_actual(){
        return estado_actual;
    }
    public void setEstado(String estado_actual){
        this.estado_actual = estado_actual;
    }
    public String getAristas(String par){
        return aristas;
    }
    public void setAristas(){
        this.aristas = aristas;
    }
    
    public ArrayList<String> estados() {
        ArrayList<String> ES = new ArrayList<>();
        estado_actual = JOptionPane.showInputDialog(null, 
                "Ingrese la cadena de estados: ", JOptionPane.INFORMATION_MESSAGE);
        return ES;
    }
    public ArrayList<String> estados_aceptacion(){
        ArrayList<String> acept = new ArrayList<>();
        int punt = 0;
        char ver = 1;
        int verificacion=0;
        for (int i = 0; i < estado_actual.length();i++){
            char val = estado_actual.charAt(i);
            if (val == 0 && ver == 1){
                punt++;
                verificacion = 1;
            }
            else if (val == 1 &&  ver == 1){
                punt++;
                verificacion = 2;
            }
            else if (val == 0 && ver == 2){
                punt++;
                verificacion = 2;
            }
            else if (val == 1 && ver ==2){
                punt++;
                verificacion = 1;
            }
            
            if (verificacion == 1){
                JOptionPane.showMessageDialog(null, "Rechazado");
            }
            else{
                JOptionPane.showMessageDialog(null, "Aceptado");
            }
        }
        return acept;
    }
    public ArrayList<String> aristas(){
        ArrayList<String> ar = new ArrayList<>();
        
        return ar;
    }
    
    public String computar(){
    String cadena = " ";
    for (int i = 0; i < cadena.length() - 1; i++){
        String ar = getAristas(estado_actual + ',' + cadena.charAt(i));
        if (!ar.equals("")){
            estado_actual = ar.split(",")[2];
        }
        else{
            return estado_actual;
            }
        }
    return estado_actual;
    }

}

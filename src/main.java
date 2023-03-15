
import Controladores.ListaController;
import Modelos.ListaModel;
import Vistas.frmListas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author rodrigovelasquez
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        frmListas VistaListas = new frmListas(null,true);
        ListaModel ModeloLista = new ListaModel();
        ListaController ControladorLista = new ListaController(VistaListas,ModeloLista);
        
    }
    
}

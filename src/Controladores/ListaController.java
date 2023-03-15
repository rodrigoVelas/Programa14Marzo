/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.Clientes;
import Modelos.ListaModel;
import Vistas.frmListas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author rodrigovelasquez
 */
public class ListaController implements ActionListener{
frmListas VistaLista;
ListaModel ModeloLista;

    public ListaController(frmListas VistaLista, ListaModel ModeloLista) {
        this.VistaLista = VistaLista;
        this.ModeloLista = ModeloLista;
        
        //PONER A LA ESCUCHA LOS BOTONES
        this.VistaLista.btnAtenderCliente.addActionListener(this);
        this.VistaLista.btnAtenderTodos.addActionListener(this);
        this.VistaLista.btnIngresarClientes.addActionListener(this);
        
        //LEVANTAR LA VISTA LISTA
        this.VistaLista.setLocationRelativeTo(null);
        this.VistaLista.setVisible(true);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
    if(e.getSource()==this.VistaLista.btnIngresarClientes)
    {
    this.ModeloLista.EncolarCliente(this.VistaLista.txtApellidos.getText(),
            this.VistaLista.txtNombre.getText());
    
    //TRAE LA LISTA CLIENTES DESDE EL MODELO
    Queue<Clientes> listaLocal = this.ModeloLista.ListarClientes();
    
            //RECORRE LA LISTA Y ASIGNA A TEXT AREA
            String Cadena = "";
            for(Clientes MiListaClientes: listaLocal)
            {
              Cadena = Cadena + MiListaClientes.getApellidos()+" "+MiListaClientes.getNombre()+"\n";
              this.VistaLista.txtListasClientes.setText(Cadena);
            }
    }    
    }
    
}

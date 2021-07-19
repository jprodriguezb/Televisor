/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Televisor;

/**
 *
 * @author jprod
 */
public class ControladorTelevisor {
    private FrmTelevisor vista;
    private Televisor modelo;
    
    public void power(){
        if(!modelo.isEstado()){
            modelo.encender();
            vista.getLblCanal().setVisible(true);
            vista.getLblCanal().setText(String.valueOf(modelo.getCanal()));
            vista.getPgbVBC().setVisible(true);
            vista.getPgbVBC().setValue(modelo.getVolumen());
            vista.getPgbVBC().setString(String.valueOf(modelo.getVolumen()));
            vista.getLblPantalla().setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/"+ modelo.getCanal() +".GIF")));
            vista.getLblPantalla().setOpaque(false);
        }else{
            modelo.apagar();
            vista.getLblCanal().setVisible(false);
            vista.getPgbVBC().setVisible(false);
            vista.getLblPantalla().setIcon(null);
            vista.getLblPantalla().setOpaque(true);
        }
    }

    public ControladorTelevisor(FrmTelevisor vista, Televisor modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }
    
    
}

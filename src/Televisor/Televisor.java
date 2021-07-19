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
public class Televisor {
    private boolean estado;
    private int canal;
    private boolean silenciado;
    private int volumen;
    private int brillo;
    private int contraste;
    private Entradas entrada;
    
    private final int CANALMAX=100;
    private final int CANALMIN=2;
    
    private final int VBCMAX=100;
    private final int VBCMIN=0;

    public boolean isEstado() {
        return estado;
    }

    public int getCanal() {
        return canal;
    }

    public boolean isSilenciado() {
        return silenciado;
    }

    public int getVolumen() {
        return volumen;
    }

    public int getBrillo() {
        return brillo;
    }

    public int getContraste() {
        return contraste;
    }

    public Entradas getEntrada() {
        return entrada;
    }
    
    public void encender(){
        this.estado=true;
    }
    
    public void apagar(){
        this.estado=false;
    }
    
    public void cambiarEntrada(Entradas entrada){
        this.entrada=entrada;
    }
    
    public void cambiarCanal(int canal){
        if (this.canal>=this.CANALMIN && canal<=this.CANALMAX){
            this.canal=canal;
        }
    }
    
    public void subirCanal(){
        if(this.canal<this.CANALMAX){
            this.canal++;
        }else{
            this.canal=this.CANALMIN;
        }
    }
    
    public void bajarCanal(){
        if(this.canal>this.CANALMIN){
            this.canal--;
        }else{
            this.canal=this.CANALMAX;
        }
    }
    
    public void activarSonido(){
        this.silenciado=false;
    }
    
    public void desactivarSonido(){
        this.silenciado=true;
    }
    
    public void subirVolumen(){
        if (this.volumen<this.VBCMAX){
            this.volumen++;
        }
    }
    
    public void bajarVolumen(){
        if (this.volumen>this.VBCMIN){
            this.volumen--;
        }
    }
       
    public void subirBrillo(){
        if (this.brillo<this.VBCMAX){
            this.brillo++;
        }
    }
    
    public void bajarBrillo(){
        if (this.brillo>this.VBCMIN){
            this.brillo--;
        }
    }
    
    public void subirContraste(){
        if (this.contraste<this.VBCMAX){
            this.contraste++;
        }
    }
    
    public void bajarContraste(){
        if (this.contraste>this.VBCMIN){
            this.contraste--;
        }
    }

    public Televisor() {
        this.estado = false;
        this.canal = this.CANALMIN;
        this.silenciado = false;
        this.volumen = 1;
        this.brillo = 50;
        this.contraste = 50;
        this.entrada = Entradas.Cable;
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aividademilitares;

/**
 *
 * @author João Igor
 */
public class MilitarAeronautica extends Militar {
    //atributos
    private int anosDePatente;
    private int horasDeVoo;
    
    //método construtor
    public MilitarAeronautica(int matricula, String patente, int anosDePatente, int horasDeVoo ) {
        //atribuindo valores da classe abstrata
        super(matricula, patente);
        this.setAnosDePatente(anosDePatente);
        this.setHorasDeVoo(horasDeVoo);
    }
    
    //métodos de acesso e modificadores
    public int getAnosDePatente() {
        return anosDePatente;
    }

    public void setAnosDePatente(int anosDePatente) {
        this.anosDePatente = anosDePatente;
    }

    public int getHorasDeVoo() {
        return horasDeVoo;
    }

    public void setHorasDeVoo(int horasDeVoo) {
        this.horasDeVoo = horasDeVoo;
    }
    //sobrescrita do método abstrato
    @Override
    public boolean podeProgredir() {
        if (this.getAnosDePatente() > 2 && this.horasDeVoo > 100){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "MilitarAeronautica{" + "\n anosDePatente = " + anosDePatente + "\n horasDeVoo = " + horasDeVoo + "\n Patente Atual = " + super.getPatente()+ '}';
    }
    
    

}

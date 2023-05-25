/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aividademilitares;

/**
 *
 * @author João Igor
 */
public class MilitarMarinha extends Militar{
    //atributo
    private boolean participouConsertoAviao;
    
    //construtor
    public MilitarMarinha(int matricula, String patente, boolean participouConsertoAviao) {
        super(matricula, patente);
        this.setParticipouConsertoAviao(participouConsertoAviao);
    }
    
    //método de acesso e modificador
    public boolean isParticipouConsertoAviao() {
        return participouConsertoAviao;
    }

    public void setParticipouConsertoAviao(boolean participouConsertoAviao) {
        this.participouConsertoAviao = participouConsertoAviao;
    }
    //sobrescrita do método abstrato
    @Override
    public boolean podeProgredir() {
        if (this.isParticipouConsertoAviao() == true){
            return true;
        }   
        else{
            return false;
        }
    
    }

    @Override
    public String toString() {
        return "MilitarMarinha{" + "\n participouConsertoAviao = " + participouConsertoAviao + "Patente Atual = " + super.getPatente() + '}';
    }
    
}

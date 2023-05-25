/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aividademilitares;

/**
 *
 * @author João Igor
 */
public class MilitarExercito extends Militar{
    //atributos
    private boolean participacaoEmGuerra;
    private boolean venceuAGuerra;
    
    //construtor
    public MilitarExercito(int matricula, String patente, boolean participacaoEmGuerra, boolean venceuAGuerra) {
        super(matricula, patente);
        this.participacaoEmGuerra = participacaoEmGuerra;
        this.venceuAGuerra = venceuAGuerra;
    }
    //métodos de acesso e modificadores 
    public boolean isParticipacaoEmGuerra() {
        return participacaoEmGuerra;
    }

    public void setParticipacaoEmGuerra(boolean participacaoEmGuerra) {
        this.participacaoEmGuerra = participacaoEmGuerra;
    }

    public boolean isVenceuAGuerra() {
        return venceuAGuerra;
    }

    public void setVenceuAGuerra(boolean venceuAGuerra) {
        this.venceuAGuerra = venceuAGuerra;
    }
    //sobrescrita do método abstrato
    @Override
    public boolean podeProgredir() {
        if (this.isParticipacaoEmGuerra() == true && this.isVenceuAGuerra()){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "MilitarExercito{" + "\n participacaoEmGuerra = " + participacaoEmGuerra + "\n venceuAGuerra = " + venceuAGuerra + "Patente Atual = " + super.getPatente() +'}';
    }
    
    
    
}

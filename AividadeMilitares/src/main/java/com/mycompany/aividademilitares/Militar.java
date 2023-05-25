/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aividademilitares;

/**
 *
 * @author João Igor
 */
public abstract class Militar implements Carreira {
    
    //atributos    
    //OBS: patentes disponíveis: SOLDADO, CABO, TENENTE
    private int matricula;
    private String patente;
    
    //construtor
    public Militar(int matricula, String patente) {
        this.setMatricula(matricula);
        this.setPatente(patente);
    }
    
    //métodos de acesso e modificadores 
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
    
    
    
    

    
}

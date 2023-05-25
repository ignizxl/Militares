/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aividademilitares;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author João Igor
 */
public class CadastroMilitar {
    //atributo
    private List<Militar> militares;
    //construtor
    public CadastroMilitar(){
        //fazendo a instância do arraylist
        this.militares = new ArrayList<Militar>();
    }
    
    
    public void adicionarMilitar(Militar militar){
        militares.add(militar);
        
    }
    
    public void imprimePodeProgredir(){
        for (Militar indice : militares){
            if (indice.podeProgredir() == true){
                System.out.println(indice);
                System.out.println("Pode progredir!");
            }
            else{
                System.out.println("Não pode progredir! ");
            }
        }
    }
    
    public void realizarProgressao(){
        for(Militar indice : militares){
            if (indice.podeProgredir() == true){ //polimorfismo!
                if("Soldado".equals(indice.getPatente())){
                    indice.setPatente("Cabo");
                    System.out.println("Promovido de Soldado a Cabo!");
                    
                }
                else if ("Cabo".equals(indice.getPatente())){
                    indice.setPatente("Tenente");
                    System.out.println("Promovido de Cabo a Tenente!");
                    
                }
                else if ("Tenente".equals(indice.getPatente())){
                    System.out.println("Atingiu a patente Máxima!");
                    
                }
                
            }
            else{
                System.out.println("Impossível realizar progressão!");
            }
            
        }
        
    }
}

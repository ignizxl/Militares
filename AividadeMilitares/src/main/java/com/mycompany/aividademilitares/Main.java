/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aividademilitares;

/**
 *
 * @author João Igor
 */
public class Main {

    public static void main(String[] args) {
        
        CadastroMilitar cadastrandoMilitares = new CadastroMilitar();
        
        Militar militarDaAeronautica = new MilitarAeronautica(12345, "Soldado", 4, 300);
        Militar militarDoExercito = new MilitarExercito(67891, "Cabo", true, true);
        Militar militarDaMarinha = new MilitarMarinha(54321, "Tenente", true);
        
        cadastrandoMilitares.adicionarMilitar(militarDaAeronautica);
        cadastrandoMilitares.adicionarMilitar(militarDoExercito);
        cadastrandoMilitares.adicionarMilitar(militarDaMarinha);
        
        cadastrandoMilitares.imprimePodeProgredir(); //polimorfismo!
        System.out.println("-=-=--=-=-==-=--");
        cadastrandoMilitares.realizarProgressao(); //polimorfismo!
        System.out.println("=-=-=-===-=-=-=-");
        cadastrandoMilitares.imprimePodeProgredir();
    }
}

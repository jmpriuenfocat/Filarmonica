/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.enfocat.instrumental;

/**
 *
 * @author Alex Torregrosa
 */
public class Test {
    public static void main(String[] args) {
        // comentario
        InstrumentoMusical trompeta = new Trompeta();
        InstrumentoMusical guitarra = new Guitarra();
        InstrumentoMusical violin = new Violin();
        trompeta.sonar();
        guitarra.sonar();
        violin.sonar();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufc.pds.serpentesEscadas.casa;

import java.util.Random;

/**
 *
 * @author paulo
 */
public class CasaEspRandomRaves implements iEstrategia{

    @Override
    public int getDestinoRandom(int numCasa) {
        return numCasa - (1+new Random().nextInt(3));
    }
    
}

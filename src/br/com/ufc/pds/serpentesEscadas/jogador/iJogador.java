/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufc.pds.serpentesEscadas.jogador;

import JPlay.Sprite;

/**
 *
 * @author paulo
 */
public interface iJogador {
    
    public void setNumCasa(int numCasa);
    public int getNumCasa();
    
    public String getNome();
    public void setNome(String nome);
    
    public void setPosicao(int x, int y);
    public int getX();
    public int getY();
    
    public Sprite getImage();
    public void setImage(Sprite image);
 
    public void draw();
}

package br.com.ufc.pds.serpentesEscadas.viewe;


import javax.swing.JOptionPane;

import JPlay.GameImage;
import JPlay.Mouse;
import JPlay.Window;
import br.com.ufc.pds.serpentesEscadas.tabuleiro.Dado;
import br.com.ufc.pds.serpentesEscadas.tabuleiro.TabuleiroController;
import br.com.ufc.pds.serpentesEscadas.tabuleiro.iObservadorTabuleiro;
import br.com.ufc.pds.serpentesEscadas.tabuleiro.iTabuleiroController;

public class ConfigJogo implements iConfigJogo {
	
	private Button buttons = null;
	private Window    window;
    private GameImage background;
    private Mouse     mouse;
    private iTabuleiroController ctrlTabuleiro = null;
    private Panel panelDado = null;
    private Panel panelCasaAtual = null;
    private Panel panelCasaDestino = null;
    private Panel panelNomeJogador = null; 
    private boolean rand = false;
    private boolean endGame = false;
    
    public void setSizeWindow(int winWidth, int winHeight) {
    	this.window = new Window(winWidth, winHeight);
    }
    
    public ConfigJogo() {
	}
    
    public void configureBasic(iObservadorTabuleiro obs) {
    	ctrlTabuleiro = TabuleiroController.getInstance();
    	ctrlTabuleiro.addObserver(obs);
        mouse = window.getMouse();
    }
    
    public void configurePanel() {
	    panelDado = new Panel("Valor do Dado: ","text.png",window,window.getWidth() -200, window.getHeight() - 500);
	    panelNomeJogador = new Panel("Jogador: ","text.png", window, window.getWidth() -200, window.getHeight() - 440);
	    panelCasaAtual = new Panel("Casa Atual: ","text.png" ,window, window.getWidth() -200, window.getHeight() - 410);
	    panelCasaDestino = new Panel("Casa Destino: ","text.png", window, window.getWidth() -200, window.getHeight() - 380);
    }
    
    @Override
    public void definirCasas(){
        // 7 RANDOM
        ctrlTabuleiro.setCasa("random",0,0, 3);
        ctrlTabuleiro.setCasa("random",0,0, 20);
        ctrlTabuleiro.setCasa("random",0,0, 25);
        ctrlTabuleiro.setCasa("random",0,0, 51);
        ctrlTabuleiro.setCasa("random",0,0, 71);
        ctrlTabuleiro.setCasa("random",0,0, 79);
        ctrlTabuleiro.setCasa("random",0,0, 85);
        // 8 ESCADAS
        ctrlTabuleiro.setCasa("escada",0,0, 2, 36);
        ctrlTabuleiro.setCasa("escada",0,0, 5, 15);
        ctrlTabuleiro.setCasa("escada",0,0, 13, 31);
        ctrlTabuleiro.setCasa("escada",0,0, 26, 54);
        ctrlTabuleiro.setCasa("escada",0,0, 38, 42);
        ctrlTabuleiro.setCasa("escada",0,0, 40, 84);
        ctrlTabuleiro.setCasa("escada",0,0, 68, 86);
        ctrlTabuleiro.setCasa("escada",0,0, 88, 90);
        // 7 COBRAS
        ctrlTabuleiro.setCasa("cobra",0,0, 14, 8);
        ctrlTabuleiro.setCasa("cobra",0,0, 41, 16);
        ctrlTabuleiro.setCasa("cobra",0,0, 48, 11);
        ctrlTabuleiro.setCasa("cobra",0,0, 56, 45);
        ctrlTabuleiro.setCasa("cobra",0,0, 74, 46);
        ctrlTabuleiro.setCasa("cobra",0,0, 87, 35);
        ctrlTabuleiro.setCasa("cobra",0,0, 96, 64);
        
    }
    
    @Override
    public void definirJogadores(){
        //ctrlTabuleiro.addJogador("Pedro","pino1.png", 15, 620);
    	ctrlTabuleiro.addJogador("Pedro","pino1.png", 0, 0);
        ctrlTabuleiro.addJogador("Lana","pino2.png", 55, 0);
        ctrlTabuleiro.addJogador("Ravi","pino3.png", 0, 35);
        ctrlTabuleiro.addJogador("Irineu","pino4.png", 55, 35);
    }
    
    public boolean confereVencedor() {
    	 ctrlTabuleiro.confereVencedor();
    	 if(endGame) {
    		Draw(); 
			JOptionPane.showMessageDialog(null, getNomeJogadorAtual()+" ganhou o jogo");
			return true;
    	 }
    	 return false;
    }
    
    public int getDadoValue() {
    	int dado = Dado.getInstance().getValorDado();
    	setTelaDadoValue(dado);
    	return dado;
    }
    
    public boolean casaRand() {
    	return rand = ctrlTabuleiro.caiuNaRandom();
    }
    
    public int getCasaDestino() {
    	int casa = ctrlTabuleiro.confereNovoDestino();
    	setTelaCasaDestino(casa+1);
    	return casa;
    }
    
    public int getCasaAtual() {
    	int casa = ctrlTabuleiro.getCasaAtual();
    	setTelaCasaAtual(casa+1);
    	return casa;
    }
    
    public String getNomeJogadorAtual() {
    	String nome = ctrlTabuleiro.getNomeJogador();
    	setTelaNomeJogador(nome);
    	return nome;
    }
    
    public void setCasaDestino(int casaDestino) {
    	ctrlTabuleiro.setCasaDestino(casaDestino);
    }
    
    public void defineDado() {
    	addButton("dado.png", 1100, 50);
    }
    
    public void addButton(String img, int x, int y) { // Adiciona um botão ao menu
        buttons = new Button(img, x, y, mouse);
    }
    
    public void defineBackground() { // Muda o fundo do menu
        background = new GameImage("serpentes-e-escadas.png");
    }
    
    public void setPosicaoJogador(int x, int y) {
		ctrlTabuleiro.setPosicaoJogadorAtual(x, y);
	}

	public boolean dadoClicked() {
		while(true)
			if(mouse.isLeftButtonPressed() && buttons.isMouseOn())
				return true;
	}
    
	public void setTelaNomeJogador(String nome) {
    	panelNomeJogador.setText("Jogador: " + nome);
    	panelNomeJogador.Draw();
    }
    
    public void setTelaCasaDestino(int casaDestino) {
    	panelCasaDestino.setText("Casa Destino: " + casaDestino);
    	panelCasaDestino.Draw();
    }
    
    public void setTelaCasaAtual(int casaAtual) {
    	panelCasaAtual.setText("Casa Atual: " + casaAtual);
    	panelCasaAtual.Draw();
    }
    
    public void setTelaDadoValue(int valorDado) {
    	panelDado.setText("Valor do Dado: "+valorDado);
    }
    
	public void Draw() { // Desenha o menu
        background.draw();
        buttons.draw();
        ctrlTabuleiro.DrawTodosJogador();
        panelDado.Draw();
        panelNomeJogador.Draw();
        panelCasaAtual.Draw();
        panelCasaDestino.Draw();
        window.display();
        if(rand) {
    		JOptionPane.showMessageDialog(null, "Voce caiu na casa sortReves");
    		rand = false;
        }
    }

	public iTabuleiroController getCtrlTabuleiro() {
		return ctrlTabuleiro;
	}

	public void setCtrlTabuleiro(iTabuleiroController ctrlTabuleiro) {
		this.ctrlTabuleiro = ctrlTabuleiro;
	}

	public void nextJogador() {
		ctrlTabuleiro.nextJogador();
	}

	@Override
	public void fimDeJogo() {
		endGame = true;
	}
}


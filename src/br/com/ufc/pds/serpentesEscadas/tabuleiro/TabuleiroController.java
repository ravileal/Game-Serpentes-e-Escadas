
package br.com.ufc.pds.serpentesEscadas.tabuleiro;

public class TabuleiroController implements iTabuleiroController {
 
    private iTabuleiro tabuleiro = null;
    private static TabuleiroController instance = null;
    private int casaDestino;
    
    private TabuleiroController(){
        tabuleiro = Tabuleiro.getInstance();
    }
    
    public static TabuleiroController getInstance(){
        if(instance == null)
            instance = new TabuleiroController();
        
        return instance;
    }
    
    // set iCasas Especiais
    
    @Override
    public void setCasa(String nome, int x, int y, int indice){
        tabuleiro.setCasa(nome,x,y, indice); 
    }
    
    @Override
    public void setCasa(String nome,int x, int y, int indice, int destino){
        tabuleiro.setCasa(nome,x,y, indice, destino);
    }
    
    @Override
    public void addJogador(String nome, String img ,int x, int y){
        tabuleiro.addJogador(nome, img ,x, y);
    }
    
    public void setPosicaoJogadorAtual(int x, int y) {
    	tabuleiro.setPosicaoJogadorAtual(x, y);
    }
    
    private int getNumCasaDestino(int numCasa){
        return tabuleiro.getNumCasaDestino(numCasa);
    }
    
    public void setCasaDestino(int casaDestino) {
    	this.casaDestino = casaDestino;
    }
    
    public int getCasDestino(){
        return this.casaDestino;
    }
    
/////////////////////////////
// Métodos da jogabilidade//
////////////////////////////    

    
    public int getCasaAtual() {
    	return tabuleiro.getNumCasaJogadorAtual(); //Casa atual
    }
    
    
    public boolean confereVencedor() {
        if(casaDestino > 98){
            tabuleiro.notifyObserver();
            //System.out.println("O jogador(a) "+tabuleiro.getNomeJogadorAtual()+" ganhou");
            return true;
        }
        return false;
    }
    
    public int confereNovoDestino() {
        //salva o numero da casa do possivel novo destino
        int destinoSecundario = getNumCasaDestino(casaDestino);
        /* Atencao!!!
            No caso de casa ser NORMAL, ao chamar getNumCasaDestino, ela retorna 
                seu proprio numero.
            No caso de casa ser ESPECIAL, ao chamar getNumCasaDestino, ela 
                retorna o numero da proximo casa de destino.
        */
        
        while(casaDestino != destinoSecundario ){
        	
        	casaDestino = destinoSecundario;
            destinoSecundario = getNumCasaDestino(destinoSecundario);
            System.out.println("Novo destino: "+(1+casaDestino));
        }
        
        tabuleiro.setNumCasaJogadorAtual(casaDestino);
        int x = tabuleiro.getX(casaDestino);
        int y = tabuleiro.getY(casaDestino);
        tabuleiro.setPosicaoJogadorAtual(x, y);
        return casaDestino;
    }
    
    public boolean caiuNaRandom() {
    	return tabuleiro.getCaiuNaRand();
    }
    
    public void nextJogador() {
        tabuleiro.nextJogador();
    }
    
    public String getNomeJogador() {
    	return tabuleiro.getNomeJogadorAtual();
    }
    
    @Override
    public void addObserver(iObservadorTabuleiro obs) {
        tabuleiro.addObserver(obs);
    }

    @Override
    public void DrawJogadorAtual() {
    	tabuleiro.DrawJogadorAtual();
    }
    @Override
    public void DrawTodosJogador() {
    	tabuleiro.DrawTodosJogador();
    }
    
    @Override
    public void removeObserver() {
        tabuleiro.removeObserver();
    }
    
}

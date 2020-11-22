package br.com.ufc.pds.serpentesEscadas.viewe;

import java.io.FileNotFoundException;
import java.io.IOException;

public class StartGame {

	public StartGame() {
		
	}

	public static void main(String[] args) {
        try {
			Game.getInstance().Run();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

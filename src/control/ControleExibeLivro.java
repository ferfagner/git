package control;

import model.BDSimulado;
import model.Livro;
import view.ViewExibeLivro;
import view.ViewSolicitaLivro;

public class ControleExibeLivro {
	//Criar BD Simulado
	
	BDSimulado bda = new BDSimulado();
	
	//criar view solicitar Livro
	
	ViewSolicitaLivro vsl = new ViewSolicitaLivro();
	String livro = vsl.getLivro();

	
	
	Livro lv = bda.getLivroPorNome(livro);
	ViewExibeLivro vel = new ViewExibeLivro (lv);
}

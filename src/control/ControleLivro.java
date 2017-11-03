package control;

import java.util.ArrayList;

import model.BDSimulado;
import model.Livro;
import view.ViewCadastraLivro;
import view.ViewListaLivro;

public class ControleLivro {
		public BDSimulado bds;
	
		public ControleLivro(BDSimulado bds){
			
			this.bds = bds;
			
			ViewCadastraLivro vcl = new ViewCadastraLivro();
			
			//Criando Livro
			
			Livro livro = new Livro(vcl.getTitulo(), vcl.getAutor(), vcl.getEditora(), vcl.getAnoLancamento(), vcl.getISBN());
			
			bds.insereLivro(livro);
			
			ArrayList<Livro> livros = this.bds.getLivros();
			
			String g = "";
			
			for (int i = 0; i < livros.size(); i++) {
				g = g + "-----------------" + "\n" + livros.get(i);
			
			}
			ViewListaLivro vll = new ViewListaLivro(g);
			
			
		}
	
	
	
}

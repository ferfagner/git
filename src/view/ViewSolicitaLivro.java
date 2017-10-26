package view;

import javax.swing.JOptionPane;

public class ViewSolicitaLivro {
	private String livro;

	public String getLivro() {
		return livro;
	}
	
	public ViewSolicitaLivro(){
		this.livro = 
		 JOptionPane.showInputDialog("Digite o Nome do Livro");
	}
}

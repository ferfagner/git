package view;

import javax.swing.JOptionPane;

import model.Livro;


public class ViewExibeLivro {
	
	public ViewExibeLivro(Livro livro){
		//Exibir com JOptionPane
		JOptionPane.showMessageDialog(null, livro);
	}
}

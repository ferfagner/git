package view;

import javax.swing.JOptionPane;

import model.Livro;


public class ViewExibeLivro {
	
	public ViewExibeLivro(Livro livro){
		if (livro == null) {
			JOptionPane.showMessageDialog(null, "Toca pro Neymar");
		} else {
			JOptionPane.showMessageDialog(null, livro );
		}
	}
}

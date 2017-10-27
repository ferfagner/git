package view;

import javax.swing.JOptionPane;

public class ViewCadastraLivro {
	private String titulo;
	private String autor;
	private String editora;
	private String anoLancamento;
	private String ISBN;
	
	


	//metodo contrutor
	public ViewCadastraLivro(){
		
		this.titulo = JOptionPane.showInputDialog("Digiteo o titulo");
		this.autor = JOptionPane.showInputDialog("Digiteo o autor");
		this.editora = JOptionPane.showInputDialog("Digiteo o editora");
		this.anoLancamento = JOptionPane.showInputDialog("Digiteo o Ano de Lançamento");
		this.ISBN = JOptionPane.showInputDialog("Digiteo o ISBN");
		
		
		
		
	}
	

	public String getTitulo() {
		return titulo;
	}


	public String getAutor() {
		return autor;
	}


	public String getEditora() {
		return editora;
	}


	public String getAnoLancamento() {
		return anoLancamento;
	}


	public String getISBN() {
		return ISBN;
	}
	
}

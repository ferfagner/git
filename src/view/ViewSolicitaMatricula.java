package view;

import javax.swing.JOptionPane;

public class ViewSolicitaMatricula {
	//atributos
	private String Matricula;
	//metodos
	public String getMatricula() {
		return Matricula;
	}
	//pedido
	public ViewSolicitaMatricula(){
		this.Matricula = 
		 JOptionPane.showInputDialog("Digite sua Matricula");
	}
	
}

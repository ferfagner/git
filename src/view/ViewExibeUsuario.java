package view;

import javax.swing.JOptionPane;

import model.Usuario;

public class ViewExibeUsuario {
	
	public ViewExibeUsuario(Usuario usuario){
		//Exibir com JOptionPane
		JOptionPane.showMessageDialog(null, usuario);
	}

}

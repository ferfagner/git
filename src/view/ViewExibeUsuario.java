package view;

import javax.swing.JOptionPane;

import model.Usuario;

public class ViewExibeUsuario {
	
	public ViewExibeUsuario(Usuario usuario){
		if (usuario == null) {
			JOptionPane.showMessageDialog(null, "Toca pro Neymar");
		} else {
			JOptionPane.showMessageDialog(null, usuario);
		}
		
		//Exibir com JOptionPane
		
		
	}
		
		//JOptionPane.showMessageDialog(null, usuario);
		
	}



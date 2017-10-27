package control;

import java.util.ArrayList;

import model.BDSimulado;
import model.Usuario;
import view.ViewCadastraUsuario;
import view.ViewExibeListaUsuario;

public class ControleUsuario {
	 
	//metodo construtor
	public ControleUsuario(){
		//criar bds
		BDSimulado bds = new BDSimulado();
		
		//solicitar dados do usuario
		ViewCadastraUsuario vcu = new ViewCadastraUsuario();
		
		//criar objeto usuario com os dados digitados
		Usuario usuario = new Usuario(vcu.getNome(), vcu.getMatricula(), vcu.getCurso());
		
		//colocar usuario na Lista de usuario
		bds.insereUsuario(usuario);
	
		//recuperar lista de usuario
		ArrayList<Usuario> usuarios = bds.getUsuario();
		
		//criar uma string representando todos usuarios da lista
		
		String s = "";
		for (int i = 0; i < usuarios.size(); i++) {
			s = s + "-----------------" + "\n" + usuarios.get(i);
		}
		
		//exibir a lista de usuario
		
		ViewExibeListaUsuario velu = new ViewExibeListaUsuario(s);
		
	}
	
	
	
	
}

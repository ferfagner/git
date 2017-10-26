package control;

import model.BDSimulado;
import model.Usuario;
import view.ViewExibeUsuario;
import view.ViewSolicitaMatricula;

public class ControlePesquisaUsuario {
	
	public ControlePesquisaUsuario(){
		//Criar o BDSimulado
		BDSimulado bds = new BDSimulado();
		//Criar view para solicitar a matriculoa
		ViewSolicitaMatricula vsm= new ViewSolicitaMatricula();
		String matricula = vsm.getMatricula();
		//Retornar dados de usuario de acordo com a matricula
		Usuario usu = bds.getUsuarioPorMatricula(matricula);
		
		//Exibir os dados do usuario
		ViewExibeUsuario veu = new ViewExibeUsuario(usu);
	}

}

package control;

import model.BDSimulado;
import model.Usuario;
import view.ViewExibeUsuario;
import view.ViewSolicitaMatricula;

public class ControlePesquisaUsuario {
		public BDSimulado bds;
	public ControlePesquisaUsuario(BDSimulado bds){
		
		this.bds = bds;
	}
	//controle Pesquisa usuario
		public void PesquisarUsuario(){
			//Criar view para solicitar a matriculoa
			ViewSolicitaMatricula vsm= new ViewSolicitaMatricula();
			String matricula = vsm.getMatricula();
			//Retornar dados de usuario de acordo com a matricula
			Usuario usu = this.bds.getUsuarioPorMatricula(matricula);
			
			//Exibir os dados do usuario
			ViewExibeUsuario veu = new ViewExibeUsuario(usu);
		}

}

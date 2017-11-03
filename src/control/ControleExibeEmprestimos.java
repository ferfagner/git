package control;

import java.util.ArrayList;

import model.BDSimulado;
import model.Emprestimo;
import view.ViewExibeEmprestimos;
import view.ViewExibeEmprestimosString;

public class ControleExibeEmprestimos {
	public BDSimulado bds;
	public ControleExibeEmprestimos(BDSimulado bds){
		
		this.bds = bds;
		
	}
	public void ExiberEmprestimos(){
		//Recuperar todos os emprestimos
		ArrayList<Emprestimo> emprestimos = this.bds.getEmprestimos();
		
		//Exibir todos os emprestimos
		ViewExibeEmprestimos vee = new ViewExibeEmprestimos(emprestimos);
		
		//Exibir todos os emprestimos usando outra classe
		String s = "";
		
		for (int i = 0; i < emprestimos.size(); i++) {
			s = s + "--------------\n" + emprestimos.get(i);
		}
		
		ViewExibeEmprestimosString vees = new ViewExibeEmprestimosString(s);
		
		
		
		
		
		
		
		
		
		
	}

}

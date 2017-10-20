package control;

import java.util.ArrayList;

import model.BDSimulado;
import model.Emprestimo;

public class ControleExibeEmprestimos {
	
	public ControleExibeEmprestimos(){
		//Criando o BD Simulado
		BDSimulado bds = new BDSimulado();
		
		//Recuperar todos os emprestimos
		ArrayList<Emprestimo> emprestimos = bds.getEmprestimos();
		
		//Exibir todos os emprestimos
		
		
		
	}

}

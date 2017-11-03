package view;

import javax.swing.JOptionPane;

public class ViewPrincipal {
	
	private String opcao;
	
	//metodos
	public String getOpcao(){
		this.opcao = JOptionPane.showInputDialog(
			"Escolha Uma Opção \n" + 
			"1- Cadastrar Usuario \n" +
			"2- Pesquisar Usuario \n" +
			"3 - Listar Emprestimos \n" +
			"4- Sair");
		return this.opcao;
	}
}

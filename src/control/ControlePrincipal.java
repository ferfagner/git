package control;

import javax.swing.JOptionPane;

import model.BDSimulado;
import view.ViewPrincipal;

public class ControlePrincipal {
	//atributos
	public BDSimulado bds;
	public ViewPrincipal vp;
	public ControleExibeEmprestimos cee;
	public ControlePesquisaUsuario cpu;
	public ControleUsuario cu;
	
	
		public ControlePrincipal (){
			//instanciar o objeto BDSimulado
			this.bds = new BDSimulado();
			
			
			//instanciar a view principal
			this.vp = new ViewPrincipal();
			
			//Criar Controles
			this.cee = new ControleExibeEmprestimos(this.bds);
			this.cpu = new ControlePesquisaUsuario(this.bds);
			this.cu = new ControleUsuario(this.bds);
			//exibira a janela 
			
			tratarOpcao(this.vp.getOpcao());
		}
			//metodo pra tratar opçãodo usuario
		
		public void tratarOpcao (String opcao){
			while (true) {
				switch (opcao) {
				case "1": this.cu.CadastrarUsuario();
					break;
				case "2": this.cpu.PesquisarUsuario();
					break;
				case "3": this.cee.ExiberEmprestimos();
					break;
				case "4": JOptionPane.showMessageDialog(null, "XAU XIA");
					return;
				default: JOptionPane.showMessageDialog(null, "ERRO, ERRO. VAI EXPLODIR!");
					break;
				}
			//exibir janela novamente
				opcao = this.vp.getOpcao();
				
			}
			
			
		}
		
		
		
		
}

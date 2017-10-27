package view;

import javax.swing.JOptionPane;

public class ViewCadastraUsuario {
	//atributos
	private String nome;
	private String matricula;
	private String curso;
	
		public ViewCadastraUsuario(){
			//solicitar um nome
			this.nome =
			JOptionPane.showInputDialog("Digiteo o nome do Usuario");
			//solicitar a matricula
			this.matricula =
					JOptionPane.showInputDialog("Digiteo o Matricula do Usuario");
			//solicitar o curso
			this.curso =
					JOptionPane.showInputDialog("Digiteo o Curso do Usuario");
		}

		public String getNome() {
			return nome;
		}

		public String getMatricula() {
			return matricula;
		}

		public String getCurso() {
			return curso;
		}
		
		
	
}

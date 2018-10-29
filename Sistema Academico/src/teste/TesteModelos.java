package teste;

import modelo.Aluno;
import modelo.Pessoa;
import modelo.Professor;

public class TesteModelos {
	public static void main(String[] args){
		Aluno a1 = new Aluno();
		Pessoa p1 = new Professor();
		
		System.out.println(p1.toString());
	}
}

package modelo;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	private String nome;
	private String codigo;
	private int sala;
	private int cargaHoraria;
	private double custo;
	private List<Aluno> chamada = new ArrayList();
	private Professor professor;
	
	public Disciplina(){
		
	}

	
	public Disciplina(String nome, String codigo, int sala, int cargaHoraria, double custo, Professor professor) {
		
		this.nome = nome;
		this.codigo = codigo;
		this.sala = sala;
		this.cargaHoraria = cargaHoraria;
		this.custo = custo;
		this.professor = professor;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getSala() {
		return sala;
	}

	public void setSala(int sala) {
		this.sala = sala;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}
	
	public List<Aluno> getChamada() {
		return chamada;
	}

	public void setChamada(List<Aluno> listaDeChamada) {
		this.chamada = listaDeChamada;
	}


	@Override
	public String toString() {
		return "Disciplina [nome=" + nome + ", codigo=" + codigo + ", sala=" + sala + ", cargaHoraria=" + cargaHoraria
				+ ", custo=" + custo + ", chamada=" + chamada + ", professor=" + professor + "]";
	}
	
	
	

		
	
	

}

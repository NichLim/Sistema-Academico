package modelo;

public abstract class Pessoa {
		private String nome;
		private String cpf;
		private String endereco;
		private String email;
		
		public Pessoa(){
			
		}
		
		public Pessoa(String nome, String cpf, String endereco, String email) {
			super();
			this.nome = nome;
			this.cpf = cpf;
			this.endereco = endereco;
			this.email = email;
		}

		private String getNome() {
			return nome;
		}

		private void setNome(String nome) {
			this.nome = nome;
		}

		private String getCpf() {
			return cpf;
		}

		private void setCpf(String cpf) {
			this.cpf = cpf;
		}

		private String getEndereco() {
			return endereco;
		}

		private void setEndereco(String endereco) {
			this.endereco = endereco;
		}

		private String getEmail() {
			return email;
		}

		private void setEmail(String email) {
			this.email = email;
		}



		@Override
		public String toString() {
			return "Pessoa [Nome=" + nome + ", CPF=" + cpf + ", Endereco=" + endereco + ", Email=" + email + "]";
		}
		
		
		
}

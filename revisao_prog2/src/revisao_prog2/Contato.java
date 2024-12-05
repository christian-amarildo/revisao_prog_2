package revisao_prog2;

public class Contato {
	private String nome;
	private String email;
	
	public Contato(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	public String getNome () {
		return this.nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}

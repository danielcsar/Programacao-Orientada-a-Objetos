package exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Contato {
	private String nome;
	private Endereco endereco;
	private List<Telefone> telefones;

	public Contato(String nome, Endereco endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefones = new ArrayList<Telefone>();
	}

	public List<Telefone> getTelefones() {
		return this.telefones;
	}

	public void setTelefones(Telefone telefones) {
		this.telefones.add(telefones);
	}

	public String getNome() {
		return nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void mostrarTelefones() {
		System.out.println("Telefones: ");
		for (Telefone t : telefones) {			
			System.out.println(t.getNumero());
		}
	}

	public String toString() {
		return ("Nome: " + this.getNome() + 
				"\nEndereço: " + this.getEndereco()+ 
				"\nTelefones: " + this.getTelefones());
	}
}

package exercicio1;

public class Atleta implements Olimpiadas {
	private String nome;
	private double peso;
	private String modalidade;
	private Pais pais;
	private static int totalParticipantes = 0;

	

	public Atleta(String nome, double peso, String modalidade, Pais pais) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.modalidade = modalidade;
		this.pais = pais;
		totalParticipantes += 1;
	}

	public String getNome() {
		return nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public String getModalidade() {
		return modalidade;
	}

	public Pais getPais() {
		return pais;
	}

	public static int getTotalParticipantes() {
		return totalParticipantes;
	}

	@Override
	public String verificaSituacao() {
		if (this.peso > 90) {			
			this.modalidade = "Peso Pesado";
			return "Participar�!";
		} else if (this.peso >= 60 && this.peso <= 90) {			
			this.modalidade = "Peso M�dio";
			return "Participar�!";
		} else {			
			this.modalidade = "Sem Modalidade";
			return "N�o Participar�!";
		}
	}
	
	@Override
	public String toString() {
		return ("Nome: " + this.getNome() + " Peso: " + this.getPeso()+" Modalidade: "+this.getModalidade()+" Pais: "+this.getPais());
	}
}

package prjPokemonV2;

public class Pokemon {
	//Atributos
	private	String nome;
	private String tipo;
	private int nivel;
	private int hp;
	private int defesa;
	
	//Construtores
	
	public Pokemon () {
				
	}
	
    public Pokemon(String nome, String tipo, int nivel, int hp, int defesa) {
    	this.nome = nome;
		this.tipo = tipo;
		this.nivel = nivel;
		this.hp = hp;
		this.defesa = defesa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getDefesa() {
		return defesa;
	}

	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}
    
	//metodos
	public void exibirInfo() {
		System.out.println("Nome: " + this.nome);
		System.out.println("tipo: " + this.tipo);
		System.out.println("Nivel: " + this.nivel);
		System.out.println("hp: " + this.hp);
	}
	public void atacar() {
		System.out.println(this.nome + " atacou");
    }
	public void evoluir() {
		System.out.println(this.nome + " evloluiu");
	}
}

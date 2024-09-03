package prjPokemonV2;

public class PokemonVoador extends Pokemon {
	
	//metodos
	public void voar() {
		System.out.println(this.getNome() + " Está voando");
	}
	
	@Override
    public void atacar () {
		System.out.println(this.getNome() + " Fez um ataque de asa");
	}
}

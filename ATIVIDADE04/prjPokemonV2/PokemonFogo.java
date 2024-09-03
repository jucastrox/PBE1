package prjPokemonV2;

public class PokemonFogo extends Pokemon {
	
	//metodos
	public void bolaFogo () {
		System.out.println(this.getNome() + " Soltou uma bola de fogo");
	}
	public void explosaoFogo() {
		System.out.println(this.getNome() + " Fez uma explosão de fogo");
	}
	
	@Override
    public void atacar () {
		System.out.println(this.getNome() + " Lançou chamas");
	}
}

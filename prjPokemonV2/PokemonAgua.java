package prjPokemonV2;

public class PokemonAgua extends Pokemon {
	//metodos
	public void surfar () {
		System.out.println(this.getNome() + " Está surfando");
	}
	
	@Override
    public void atacar () {
		System.out.println(this.getNome() + " Caminhou na água");
	}
}

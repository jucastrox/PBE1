package prjPokemonV2;

public class aplicacao {

	public static void main(String[] args) {
		Pokemon Persian = new Pokemon();
		Persian.setNome("Persian");
		Persian.setTipo("Normal");
		Persian.setNivel(16);
		Persian.setHp(0);
		Persian.setDefesa(0);
		
		Pokemon Meowth = new Pokemon();
		Meowth.setNome("Meowth");
		Meowth.setTipo("Normal");
		Meowth.setNivel(0);
		Meowth.setHp(0);
		Meowth.setDefesa(0);
		
		Pokemon Charizard = new Pokemon();
		Charizard.setNome("Charizard");
		Charizard.setTipo("Fogo");
		Charizard.setNivel(15);
		Charizard.setHp(0);
		Charizard.setDefesa(0);
		
		Pokemon Charmander = new Pokemon();
		Charmander.setNome("Charmander");
		Charmander.setTipo("Fogo");
		Charmander.setNivel(14);
		Charmander.setHp(0);
		Charmander.setDefesa(0);
		
		Pokemon Squirtle = new Pokemon();
		Squirtle.setNome("Squirtle");
		Squirtle.setTipo("Água");
		Squirtle.setNivel(13);
		Squirtle.setHp(0);
		Squirtle.setDefesa(0);
		
		Pokemon Blastoise = new Pokemon();
		Blastoise.setNome("Blastoise");
		Blastoise.setTipo("Água");
		Blastoise.setNivel(12);
		Blastoise.setHp(0);
		Blastoise.setDefesa(0);
		
		Pokemon Butterfree = new Pokemon();
		Butterfree.setNome("Butterfree");
		Butterfree.setTipo("Voador");
		Butterfree.setNivel(11);
		Butterfree.setHp(0);
		Butterfree.setDefesa(0);
		
		Pokemon Pidgey = new Pokemon();
		Pidgey.setNome("Pidgey");
		Pidgey.setTipo("Voador");
		Pidgey.setNivel(10);
		Pidgey.setHp(0);
		Pidgey.setDefesa(0);
		
		Persian.exibirInfo();
		Persian.atacar();
		Persian.evoluir();
		
		Meowth.exibirInfo();
		Meowth.atacar();
		Meowth.evoluir();
		
		Charizard.exibirInfo();
		Charizard.atacar();
		Charizard.evoluir();
		
		Charmander.exibirInfo();
		Charmander.atacar();
		Charmander.evoluir();
		
		Squirtle.exibirInfo();
		Squirtle.atacar();
		Squirtle.evoluir();
		
		Blastoise.exibirInfo();
		Blastoise.atacar();
		Blastoise.evoluir();
		
		Butterfree.exibirInfo();
		Butterfree.atacar();
		Butterfree.evoluir();
		
		Pidgey.exibirInfo();
		Pidgey.atacar();
		Pidgey.evoluir();
	}

}

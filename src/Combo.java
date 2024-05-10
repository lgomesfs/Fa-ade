
public class Combo {
	private Burger burger;
	private Sobremesa sobremesa;
	private Bebida bebida;
	
	public Combo() {
		burger=new Burger();
		sobremesa=new Sobremesa();
		bebida=new Bebida();
	}
	
	public void criarCombo(int tipo) {
		if(tipo==1) {
			burger.setPreco(15.0);
			burger.setGramas(300);
			burger.setDescricao("Hamburguer de "+burger.getGramas()+"g com cheddar no pão australiano");
			sobremesa.setPreco(12.0);
			sobremesa.setTamanho("Médio");
			sobremesa.setDescricao("Torta de limão");
			bebida.setPreco(10.0);
			bebida.setDescricao("Cajuina");
			bebida.setMl(500);
		}
		else if (tipo==2) {
			burger.setPreco(10.0);
			burger.setGramas(150);
			burger.setDescricao("Hamburguer de "+burger.getGramas()+"g com cheddar no pão australiano");
			sobremesa.setPreco(6.0);
			sobremesa.setTamanho("Pequena");
			sobremesa.setDescricao("Cookie com gotas de chocolate");
			bebida.setPreco(5.0);
			bebida.setDescricao("Dolly Citrus");
			bebida.setMl(300);
		}
	}
	
	public double soma() {
		return burger.getPreco()+sobremesa.getPreco()+bebida.getPreco();	
	}
	
	public String toString() {
		return "O combo escolhido vem com: "+burger.getDescricao()+"\nSobremesa: "+sobremesa.getDescricao()+" de tamanho: "+sobremesa.getTamanho()+
				"\nBebida: "+bebida.getDescricao()+" de "+bebida.getMl()+" ml."
				+"\nO preço total foi de: R$ "+String.format("%.2f", soma());
	}
}

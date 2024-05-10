
public class Burger implements IProduto{
	private double preco;
	private String descricao;
	private int gramas;
	
	public int getGramas() {
		return gramas;
	}

	public void setGramas(int gramas) {
		this.gramas = gramas;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public double getPreco() {
		return preco;
	}
	
	@Override
	public String getDescricao() {
		return descricao;
	}
}

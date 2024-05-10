
public class Bebida implements IProduto{
	private double preco;
	private String descricao;
	private int ml;
	
	public int getMl() {
		return ml;
	}

	public void setMl(int ml) {
		this.ml = ml;
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

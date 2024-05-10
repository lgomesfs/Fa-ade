
public class Sobremesa implements IProduto{
	private double preco;
	private String descricao;
	private String tamanho;
	
	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
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

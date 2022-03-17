package entities;

public class Importado extends Produto{
	
	private Double taxaImportacao;
	
	public Importado() {
		
	}

	public Importado(String nome, Double preco, Double taxaImportacao) {
		super(nome, preco);
		this.taxaImportacao = taxaImportacao;
	}

	public Double getTaxaImportacao() {
		return taxaImportacao;
	}

	public void setTaxaImportacao(Double taxaImportacao) {
		this.taxaImportacao = taxaImportacao;
	}
	
	
	public double precoTotal() {
		return getPreco() + taxaImportacao;
	}
	
	
	
	@Override
	
	public String etiquetaPreco() {
		StringBuilder sb = new StringBuilder();
		sb.append(getNome());
		sb.append(" $ ");
		sb.append(precoTotal());
		sb.append("(taxa de importacao: $ " + taxaImportacao + ")");
		return sb.toString();
		
	}
}

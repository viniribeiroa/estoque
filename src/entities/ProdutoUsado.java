package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto{
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date dataDeFabricacao;
	
	public ProdutoUsado() {
		
	}

	public ProdutoUsado(String nome, Double preco, Date dataDeFabricacao) {
		super(nome, preco);
		this.dataDeFabricacao = dataDeFabricacao;
	}

	public Date getDataDeFabricacao() {
		return dataDeFabricacao;
	}

	public void setDataDeFabricacao(Date dataDeFabricacao) {
		this.dataDeFabricacao = dataDeFabricacao;
	}
	
	@Override
	
	public String etiquetaPreco() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(getNome());
		sb.append(" (usado) ");
		sb.append("$");
		sb.append(getPreco());
		sb.append("data de fabricacao: ");
		sb.append(dataDeFabricacao);
		
		return sb.toString();
	}
	
	

}

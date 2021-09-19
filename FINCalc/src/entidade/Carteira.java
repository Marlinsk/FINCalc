package entidade;

import java.math.BigDecimal;

public class Carteira {
    
	protected BigDecimal saldoConta;
	protected BigDecimal patrimonio;
	
	protected BigDecimal dinheiroGasto;
	protected BigDecimal totalDinheiroGasto;
	protected BigDecimal varAuxiliarGasto;
	
	protected BigDecimal metaDeGasto;
	
	protected BigDecimal saldoMetaMes;
	protected BigDecimal saldoMetaAno;
	protected BigDecimal saldoMetaLongoPrazo;
	
	protected BigDecimal valorSalario;
	
	protected BigDecimal totalDinheiroInvestido;

	public BigDecimal getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(BigDecimal saldoConta) {
		this.saldoConta = saldoConta;
	}
	
	public BigDecimal getPatrimonio() {
		return patrimonio;
	}

	public void setPatrimonio(BigDecimal patrimonio) {
		this.patrimonio = patrimonio;
	}

	public BigDecimal getDinheiroGasto() {
		return dinheiroGasto;
	}

	public void setDinheiroGasto(BigDecimal dinheiroGasto) {
		this.dinheiroGasto = dinheiroGasto;
	}

	public BigDecimal getTotalDinheiroGasto() {
		return totalDinheiroGasto;
	}

	public void setTotalDinheiroGasto(BigDecimal totalDinheiroGasto) {
		this.totalDinheiroGasto = totalDinheiroGasto;
	}

	public BigDecimal getVarAuxiliarGasto() {
		return varAuxiliarGasto;
	}

	public void setVarAuxiliarGasto(BigDecimal varAuxiliarGasto) {
		this.varAuxiliarGasto = varAuxiliarGasto;
	}

	public BigDecimal getMetaDeGasto() {
		return metaDeGasto;
	}

	public void setMetaDeGasto(BigDecimal metaDeGasto) {
		this.metaDeGasto = metaDeGasto;
	}

	public BigDecimal getSaldoMetaMes() {
		return saldoMetaMes;
	}

	public void setSaldoMetaMes(BigDecimal saldoMetaMes) {
		this.saldoMetaMes = saldoMetaMes;
	}

	public BigDecimal getSaldoMetaAno() {
		return saldoMetaAno;
	}

	public void setSaldoMetaAno(BigDecimal saldoMetaAno) {
		this.saldoMetaAno = saldoMetaAno;
	}

	public BigDecimal getSaldoMetaLongoPrazo() {
		return saldoMetaLongoPrazo;
	}

	public void setSaldoMetaLongoPrazo(BigDecimal saldoMetaLongoPrazo) {
		this.saldoMetaLongoPrazo = saldoMetaLongoPrazo;
	}

	public BigDecimal getValorSalario() {
		return valorSalario;
	}

	public void setValorSalario(BigDecimal valorSalario) {
		this.valorSalario = valorSalario;
	}

	public BigDecimal getTotalDinheiroInvestido() {
		return totalDinheiroInvestido;
	}

	public void setTotalDinheiroInvestido(BigDecimal totalDinheiroInvestido) {
		this.totalDinheiroInvestido = totalDinheiroInvestido;
	}
	
}

package entidades;

public class PessoaJuridica extends Contribuinte {

	private Integer numeroFuncionarios;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public Double imposto() {
		double imposto = 0.0;

		if (numeroFuncionarios > 10) {
			imposto = rendaAnual * 0.14;
		} else {
			imposto = rendaAnual * 0.16;
		}
		return imposto;
	}

}

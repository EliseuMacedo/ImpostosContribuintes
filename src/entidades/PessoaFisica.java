package entidades;

public class PessoaFisica extends Contribuinte {

	private Double gastosSaude;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public Double imposto() {
		double imposto = 0.0;

		if (rendaAnual < 20000.00) {
			imposto = rendaAnual * 0.15;
		} else if (gastosSaude > 0.0) {
			imposto = rendaAnual * 0.25 - gastosSaude *0.50;
		}else {
			imposto = rendaAnual * 0.25;
		}
		return imposto;
	}

}

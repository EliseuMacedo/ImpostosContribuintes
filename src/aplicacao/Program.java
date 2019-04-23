package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Contribuinte;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Contribuinte> listCt = new ArrayList<>();
		Contribuinte ct;

		System.out.print("Numero de contribuintes: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Imposto do " + i + "º contribuinte:");

			System.out.print("Pessoa fisica ou juridica (f/j)? ");
			char p = sc.next().charAt(0);

			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Renda Anual: ");
			double rendaAnual = sc.nextDouble();

			if (p == 'f') {

				System.out.print("Gastos com saúde: ");
				double gastosSaude = sc.nextDouble();
				ct = new PessoaFisica(nome, rendaAnual, gastosSaude);
				listCt.add(ct);

			} else if (p == 'j') {

				System.out.print("Numero de funcionarios: ");
				int numeroFuncionarios = sc.nextInt();
				ct = new PessoaJuridica(nome, rendaAnual, numeroFuncionarios);
				listCt.add(ct);
			}

		}
		sc.close();
		
		System.out.println("\nIMPOSTOS PAGOS:");
		double sum = 0.0;
		for(Contribuinte x:listCt) {
			System.out.println(x.getNome() + ": $ " + String.format("%.2f", x.imposto()));
			sum+= x.imposto();
		}
		System.out.println("\nTOTAL DE IMPOSTOS: $ " + String.format("%.2f", sum));
	}
}

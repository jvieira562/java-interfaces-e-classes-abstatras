
public class TesteConta {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(3130, 1005313);
		cc.deposita(100);

		SeguroDeVida seguro = new SeguroDeVida();

		CalculadorImposto c = new CalculadorImposto();
		
		c.registro(cc);
		c.registro(seguro);
		
		System.out.println(c.getTotalImposto());
		System.out.println(cc.getSaldo());
		
		double saldoFinal = cc.saldo - c.getTotalImposto();
		
		System.out.println(saldoFinal);

	}

}

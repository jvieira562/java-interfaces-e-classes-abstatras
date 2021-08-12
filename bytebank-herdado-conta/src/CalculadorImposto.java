
public class CalculadorImposto {

	private double totalImposto;
	
	public void registro(Tributavel t)	{
		double valor = t.getValueImposto();
		this.totalImposto = valor;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}
	
}

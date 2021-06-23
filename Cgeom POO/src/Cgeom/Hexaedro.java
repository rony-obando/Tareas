package Cgeom;

public class Hexaedro extends CuerposGeometricos{
	private double a;
	public Hexaedro(double a) {
		this.a=a;
	}
	@Override
	public void At() {
		double A=Math.pow(a, 2)*6;
		A=Math.round(A);
		System.out.println("El area total es: "+A);
	}
	@Override
	public void V() {
		double V=Math.pow(a, 3);
		V=Math.round(V);
		System.out.println("El Volumen es: "+V);
	}
	public void D() {
		double c=Math.sqrt(3);
		double D=a*c;
		D=Math.round(D);
		System.out.println("D = "+D);
	}
}

package Cgeom;

public class Icosaedro extends CuerposGeometricos{
	private double a;
	public Icosaedro(double a) {
		this.a=a;
	}
	@Override
	public void At() {
		double A=5*Math.pow(a, 2)*Math.sqrt(3);
		A=Math.round(A);
		System.out.println("El area total es: "+A);
	}
	@Override
	public void V() {
		int u=5;
		int g=12;
		float i=(float) u/g;
		double V=i*(3+Math.sqrt(5))*Math.pow(a, 3);
		V=Math.round(V);
		System.out.println("El Volumen es: "+V);
	}
}

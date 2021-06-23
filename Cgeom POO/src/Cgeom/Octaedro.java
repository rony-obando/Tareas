package Cgeom;

public class Octaedro extends CuerposGeometricos{
	private double a;
	public Octaedro(double a) {
		this.a=a;
	}
	@Override
	public void V() {
		double b=Math.sqrt(2);
		int s=3;
		float p=(float) b/s;
		double V=p*Math.pow(a, 3);
		V=Math.round(V);
		System.out.println("El Volumen es: "+V);
	}
	@Override
	public void At() {
		double c=Math.sqrt(3);
		double A=Math.pow(a, 2)*2*c;
		A=Math.round(A);
		System.out.println("El area total es: "+A);
	}
	
}

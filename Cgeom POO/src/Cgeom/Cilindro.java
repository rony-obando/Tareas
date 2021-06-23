package Cgeom;

public class Cilindro extends CuerposGeometricos{
private double h;
private double r;
	public Cilindro(double h, double r) {
		this.h=h;
		this.r=r;
		
	}
	@Override
	public void Al() {
		double Pb=2*Math.PI*r;
		double Al=Pb*h;
		Al=Math.round(Al);
		System.out.println("El area lateral es: "+Al);
		
	}
	@Override
	public void At() {
		double Pb=2*Math.PI*r;
		double Al=Pb*h;
		double Ab=Math.PI*Math.pow(r,2);
		double At=Al+2*Ab;
		At=Math.round(At);
		System.out.println("El area total es: "+At);
	}
	@Override
	public void V() {
		double Ab=Math.PI*Math.pow(r,2);
		double V=Ab*h;
		V=Math.round(V);
		System.out.println("El Volumen es: "+V);
	}

	
}

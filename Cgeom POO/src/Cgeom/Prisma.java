package Cgeom;

public class Prisma extends CuerposGeometricos{
	private double h;
	private double l;
	private double n;

	public Prisma(double n, double l, double h) {
		this.h=h;
		this.n=n;
		this.l=l;

	}
	@Override
	public void Al() {
		System.out.println("El area lateral es: "+(n*l*h));
	}
	@Override
	public void At() {
		double ang=180/n;
		double dna= 2*(Math.tanh(ang));
		double ap=l/dna;
		double p=n*l;
		double Ab=(p*ap)/2;
		double At=h+2*Ab;
		At=Math.round(At);
		System.out.println("El area total es: "+At);
		}
	@Override
	public void V() {
		double ang=180/n;
		double dna= 2*(Math.tanh(ang));
		double ap=l/dna;
		double p=n*l;
		double Ab=(p*ap)/2;
		double v=Ab*h;
		v=Math.round(v);
		System.out.println("El Volumen es: "+v);
	}
}

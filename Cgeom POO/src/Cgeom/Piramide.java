package Cgeom;

public class Piramide extends CuerposGeometricos {
	private double h;
	private double l;
	private double n;

	public Piramide(double n, double l, double h) {
		this.h=h;
		this.n=n;
		this.l=l;

	}
	@Override
	public void Al() {
		double  dna=2*Math.tanh(180/n);
		double	ap=l/dna;
		double	Pb=n*l;
		double	m=Math.pow(h, 2) + Math.pow(ap,2 );
		double	Ap=Math.sqrt(m);
		double	Al=(Pb*Ap)/2;;
		Al=Math.round(Al);
		System.out.println("El area lateral es: "+Al);
	}
	@Override
	public void At() {
		double dna=2*Math.tanh(180/n);
		double	ap=l/dna;
		double	Pb=n*l;
		double	m=Math.pow(h, 2) + Math.pow(ap,2 );
		double	Ap=Math.sqrt(m);
		double	Al=(Pb*Ap)/2;;
		Al=Math.round(Al);
		double	Ab=(Pb*ap)/2;
		double	At=Al+Ab;
		System.out.println("El area total es: "+At);
	}
	@Override
	public void V() {
		double dna=2*Math.tanh(180/n);
		double	ap=l/dna;
		double	Pb=n*l;
		double	m=Math.pow(h, 2) + Math.pow(ap,2 );
		double	Ap=Math.sqrt(m);
		double	Al=(Pb*Ap)/2;;
		Al=Math.round(Al);
		double	Ab=(Pb*ap)/2;
		double V=(Ab*h)/3;
		V=Math.round(V);
		System.out.println("El Volumen es: ");
	}


}

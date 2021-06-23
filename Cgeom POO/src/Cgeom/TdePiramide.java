package Cgeom;

public class TdePiramide extends CuerposGeometricos{

	private double l;
	private double n;
	private double Ap;
	private double L;
	private double Al;
public TdePiramide(double n, double l,double Ap,double L) {
		this.Ap=Ap;
		this.L=L;
		this.n=n;
		this.l=l;

	}
@Override
public void Al() {
	double Pb=n*l;
	double PB=n*L;
	double Al=((Pb+PB)/2)*Ap;
	Al=Math.round(Al);
	this.Al=Al;
	System.out.println("El area lateral es: "+Al);
}
@Override
public void At() {
	double dna=2*Math.tanh(180/n);
	double ap=l/dna;
	double ap2=L/dna;
	double PB=n*L;
	double Pb=n*l;
	double Ab=(PB*ap2)/2;
	double ab=(Pb*ap)/2;
	double At=Al+Ab+ab;
	At=Math.round(At);
	System.out.println("El area total es: "+At);
}
@Override
public void V() {
	int a=1;
	int s=3;
	float p=(float) a/s;
	double dna=2*Math.tanh(180/n);
	double ap=l/dna;
	double ap2=L/dna;
	double PB=n*L;
	double j=ap2-ap;
	double m=Math.pow(Ap, 2) + Math.pow(j,2 );
	double h=Math.sqrt(m);
	double Pb=n*l;
	double Ab=(PB*ap2)/2;
	double ab=(Pb*ap)/2;
	double q=Math.sqrt(Ab*ab);
	double V=p*h*(Ab+ab+q);
	V=Math.round(V);
	System.out.println("El Volumen es: "+V);
}
}

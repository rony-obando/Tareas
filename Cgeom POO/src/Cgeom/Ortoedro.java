package Cgeom;

public class Ortoedro extends CuerposGeometricos{
private double a;
private double b;
private double c;
public Ortoedro(double a,double b,double c) {
	this.a=a;
	this.b=b;
	this.c=c;
}
@Override
public void At() {
	double A=2*(a*b+a*c+c*b);
	System.out.println("El area total es: "+A);
}
@Override
public void V() {
	double V=a*b*c;
	System.out.println("El Volumen es: "+V);
}
public void Do() {
	double A1=Math.pow(a, 2);
	double B=Math.pow(b, 2);
	double C=Math.pow(c, 2);
	double D=(double) Math.sqrt(A1+B+C);
	D=Math.round(D);
	System.out.println("La diagonal es: "+D);
}
}

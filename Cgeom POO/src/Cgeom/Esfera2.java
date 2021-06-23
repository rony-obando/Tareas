package Cgeom;

public class Esfera2 extends CuerposGeometricos{
private double r;
private double n;
public Esfera2(double r,double n) {
	this.n=n;
	this.r=r;
}
@Override
public void V() {
	int a=4;
	int s=3;
	float p=(float) a/s;
	double V=p*(Math.PI*4*Math.pow(r, 2)*n)/360;
	V=Math.round(V);
	System.out.println("La cuña esferica es: "+V);
}
@Override
public void At() {
	double A=(Math.PI*4*Math.pow(r, 2)*n)/360;
	A=Math.round(A);
	System.out.println("El huso esferico es: "+A);
}
}

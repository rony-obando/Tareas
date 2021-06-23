package Cgeom;

public class Esfera extends CuerposGeometricos{
	private double h;
	private double r;
	private double R;
	private double H;
	private double r1;
	private double g;
		public Esfera(double h, double r, double R,double H,double r1) {
			this.H=H;
			this.R=R;
			this.r1=r1;
			this.h=h;
			this.r=r;
			
		}
	@Override
	public void Al() {
		double A=Math.PI*4*Math.pow(R, 2);
		A=Math.round(A);
		System.out.println("El area total es: "+A);
	}
	@Override
	public void V() {
		int a=4;
		int s=3;
		float p=(float) a/s;
		double V=p*Math.PI*Math.pow(R, 3);
		V=Math.round(V);
		System.out.println("El volumen total es: "+V);
	}
	public void Vz() {
		double g=Math.PI*(Math.pow(H, 2)+3*Math.pow(r,2)+3*Math.pow(r1, 2))*h;
		this.g=g;
		double vz=g/6;
		vz=Math.round(vz);
		System.out.println("El volumen de la zona esferica es: "+vz);
	}
	public void Az() {
		double Az=2*Math.PI*R*h;
		Az=Math.round(Az);
		System.out.println("El area de la zona esferica es: "+Az);
	}
	public void Vcas() {
		double m=Math.PI*Math.pow(H, 2)*(3*R-H);
		double vc=m/3;
		vc=Math.round(vc);
		System.out.println("El volumen del casquete es: "+vc);
	}
	public void Acas() {
		double Ac=2*Math.PI*R*h;
		Ac=Math.round(Ac);
		System.out.println("El area del casquete es: "+Ac);
	}
		
}

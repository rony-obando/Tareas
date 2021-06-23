package Cgeom;

public class Cono extends CuerposGeometricos{
	private double h;
	private double r;
	private double Al;
		public Cono(double h, double r) {
			this.h=h;
			this.r=r;
			
		}
		@Override
		public void Al() {
			double Pb=2*Math.PI*r;
			double m=Math.pow(h, 2) + Math.pow(r,2 );
			double g=Math.sqrt(m);
			double Al=(Pb*g)/2;
			Al=Math.round(Al);
			this.Al=Al;
			System.out.println("El area lateral es: "+Al);
		}
		@Override
		public void At() {
			double Ab=Math.PI*Math.pow(r,2);
			double At=Al+Ab;
			At=Math.round(At);
			System.out.println("El area total es: "+At);
		}
		@Override
		public void V() {
			double Ab=Math.PI*Math.pow(r,2);
			double V=(Ab*h)/3;
			V=Math.round(V);
			System.out.println("El Volumen es: "+V);
		}
}

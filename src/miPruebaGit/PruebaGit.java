package miPruebaGit;

import java.util.Scanner;

public class PruebaGit {

		static Scanner sc = new Scanner(System.in);
		static final double pi=Math.PI;

		public static void main(String[] args) {
			System.out.print("Añadido realizado por David");
			System.out.print("Introduce la altura del cilindro: ");
			double alturacil = sc.nextDouble();
			System.out.print("Introduce el radio del cilindro: ");
			double radiocil = sc.nextDouble();
			System.out.print("Introduce el radio de la esfera: ");
			double radioesf = sc.nextDouble();
		
		double volumencil=volumenCilindro(alturacil, radiocil);
		double volumenesf=volumenEsfera(radioesf);
		
		System.out.println("Volumen del cilindro="+volumencil);
		System.out.println("Volumen de la esfera="+volumenesf);
		}

		private static double volumenEsfera(double radioesf) {
			// Volumen esfera=(4/3)*PI*R^3
			double volumenesf=4*pi*Math.pow(radioesf,3)/3;
		return volumenesf;}

		private static double volumenCilindro(double alturacil, double radiocil) {
			// Volumen cilindro=PI*R^2*H
			double volumencil=pi*Math.pow(radiocil, 2)*alturacil;
		return volumencil;}	
	}


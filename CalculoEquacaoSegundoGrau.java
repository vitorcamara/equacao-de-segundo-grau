package com.vitorcamara.projetos;

import java.math.MathContext;
import java.util.Scanner;

public class CalculoEquacaoSegundoGrau {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean aValido = false;
		double a;

		do {
			System.out.println(
					"Na equação ax² + bx + c = 0, defina os valores de a, b e c. Entre primeiro com o valor de a, depois b e c:");
			a = scan.nextDouble();

			if (a == 0) {
				// 'a' não pode ter valor de 0, pois não configura equação de 2º grau

				System.out.println("Nao é uma equação de segundo grau! Tente novamente com valor de 'a' válido.");
			} else {
				aValido = true;
			}
		} while (!aValido); // enquanto o valor de 'a' for 0, o programa pede valor válido de 'a'

		double b = scan.nextDouble();
		double c = scan.nextDouble();

		double delta = Math.pow(b, 2) - 4 * a * c; //utilizando método Math.pow da classe Math do java para calcular potenciação

		double x1 = (-b) + Math.sqrt(delta); //utilizando método Math.sqrt para obter raiz quadrada

		double x2 = (-b) - Math.sqrt(delta);

		System.out.println("delta: " + delta);

		if (delta < 0) {
			System.out.println("A equação não possui raízes reais.");
		} else if (delta == 0) {
			System.out.println("A equação possui 1 raiz real: " + x1 / 2 * a);
		} else if (delta > 0) {
			System.out.println("A equação possui 2 raízes reais: " + x1 / (2 * a) + " e " + x2 / (2 * a));
		}

	}

}

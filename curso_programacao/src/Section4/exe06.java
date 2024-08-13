package Section4;

import java.util.Scanner;

public class exe06 {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		
		double a,b,c,baseOfTheTriangle,areaOfTheCircle,trapezoidArea,squareArea,areaOfTheRectangle;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		baseOfTheTriangle = a * c / 2;
		areaOfTheCircle = Math.PI * Math.pow(c, 2);
		trapezoidArea = (a + b) * c / 2;
		squareArea = Math.pow(b, 2);
		areaOfTheRectangle = a * b;
		
		
		System.out.printf("BASE OF THE TRIANGLE: %.4f\n",baseOfTheTriangle);
		System.out.printf("BASE OF THE CIRCLE: %.4f\n",areaOfTheCircle);
		System.out.printf("AREA OF THE TRAPEZOID: %.4f\n",trapezoidArea);
		System.out.printf("AREA OF THE SQUARE: %.4f\n",squareArea);
		System.out.printf("AREA OF THE TRIANGLE: %.4f\n",areaOfTheRectangle);
		sc.close();
	}

}

package arimetricos;

import java.util.Scanner;

public class Arimetricos {

    public static void main(String[] args) {
        float num1, num2, suma, resta, mult, div, resultado,resto;
        //SUMA
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digital el primer numero ");
        num1 = entrada.nextFloat();
        System.out.println("Digital el segundo numero ");
        num2 = entrada.nextFloat();
        suma = num1 + num2;
        //resta

        resta = num1 - num2;
        //multiplicacion

        mult = num1 * num2;
        //divisicon

        div = num1 / num2;
        //resto
        resto = num1% num2;

        System.out.println("El resultado de la suma es : " + suma);
        System.out.println("El resultado de la resta es : " + resta);
        System.out.println("El resultado de la multiplicacion es : " + mult);
        System.out.println("El resultado de la division es : " + div);
        System.out.println("El porcentaje del numero1 y numero2 es :"+resto);

    }

}

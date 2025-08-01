
package calculadorasimples;

//Importar a classe scanner
import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       //Enuciado da calculadora
       
        System.out.println("-----Calculadora-----");
        
        System.out.print("Digite o primero numero: ");
           double num1 = scanner.nextDouble();
        System.out.print("Digite o operador (+, -, *, /): ");
           char operador = scanner.next().charAt(0);
        System.out.print("Digite o segundo numero: ");
           double num2 = scanner.nextDouble();
           
           double resultado;
           
        switch (operador){
            case '+':
               resultado = num1 + num2;
               break;
            case '-':
               resultado = num1 - num2; 
               break;
            case '/':
                if (num2 != 0){
                   resultado = num1 / num2;
               } else { 
                   System.out.println("Erro! Divisão por zero");
                   return;
               }
               break;
            case '*':
               resultado = num1 * num2;
               break;
            default:
               System.out.println("Operador invalido");
               return;
        }
             System.out.println("Resultado: " + resultado);
                 
        }
}

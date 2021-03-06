import java.util.Scanner;

public class Calculadora{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a operacao(+,-,*,/) :");
        char op = scan.next().charAt(0);
        System.out.print("Digite um numero: ");
        Integer a = scan.nextInt();
        System.out.print("Digite outro numero: ");
        Integer b = scan.nextInt();
        mostra(op,a,b);
        scan.close();
    }
    public static void mostra(char op, int a, int b) {
    	float res = 0;
    	switch(op) {
    	case '+': res = adicao(a,b); break;
    	case '-': res = subtracao(a,b); break;
    	case '*': res = multiplicacao(a,b); break;
    	case '/': res = divisao(a,b); break;
    	default: return;
    	}
    	String out = String.format("%d %c %d = %.2f", a, op, b, res);
    	System.out.println(out);
    }
    public static float adicao(int a, int b) {
    	return a + b;
    }
    public static float subtracao(int a, int b) {
    	return a - b;
    }
    public static float multiplicacao(int a, int b) {
    	return a * b;
    }
    public static float divisao(int a, int b) {
    	return a / b;
    }
}
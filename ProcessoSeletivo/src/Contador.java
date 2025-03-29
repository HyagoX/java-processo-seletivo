import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro parametro: ");
            int parametroUm = scan.nextInt();

            System.out.println("Digite o segundo parametro: ");
            int parametroDois = scan.nextInt();
            validarParametros(parametroUm, parametroDois); // TODO: handle exception
        } catch (ParametrosInvalidosException e) {
            System.out.println("O parametro Um deve ser MAIOR que o parametro Dois");
        }

    }

    public static void validarParametros(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm < parametroDois) {
            throw new ParametrosInvalidosException();
        } else {
            int contagem = parametroUm - parametroDois;
            for (int i = 1; i <= contagem; i++) {
                System.out.println("Imprimindo numero " + i);
            }
        }
    }
}

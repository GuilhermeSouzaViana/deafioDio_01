import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

int Numero;
String Agencia;
String NomeCliente;
Double saldo;


Scanner scanner=new Scanner(System.in);

System.out.println("Qual o seu nome ?");
NomeCliente=scanner.next();
System.out.println("Qual agencia da conta ?");
Agencia=scanner.next();
System.out.println("Qual o numero ?");
Numero=scanner.nextInt();
System.out.println("Qual o saldo inicial ?");
saldo=scanner.nextDouble();

System.out.println("Ola "+NomeCliente+" obrigado por criar uma conta em nosso banco, \n sua agencia é "
+Agencia+"\n Conta "
+Numero+"\n e seu saldo "
+saldo+" já esta dispinivel para saque ");
     
    }
}

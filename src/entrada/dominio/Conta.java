package entrada.dominio;

import java.util.Scanner;

public class Conta {
    private String nome;
    private String email;
    private String senha;
    Scanner scanner = new Scanner(System.in);
    public void setAccount(){
        System.out.println("Bem vindo!");
        System.out.println("Crie a sua conta");
        System.out.print("Seu Nome de usuario(a): ");
        String nome = scanner.nextLine();
        System.out.println("Seu Email: ");
        String email = scanner.nextLine();
    }
}

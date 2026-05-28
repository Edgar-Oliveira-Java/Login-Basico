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
        this.nome = nome;
        System.out.print("Seu Email: ");
        String email = scanner.nextLine();
        this.email = email;
        System.out.print("Nova Senha: ");
        String senha = scanner.nextLine();
        this.senha = senha;
    }

    public void Logar(){
        do{
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Senha: ");
            String senha = scanner.nextLine();
            if(nome.equals(this.nome) && senha.equals(this.senha)){
                System.out.println("Bem vindo a sua conta");
                System.out.println("Login feito com sucesso!");
                break;
            }else {
                System.out.println("Login invalido");
            }
        }while(true);
    }
}

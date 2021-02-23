package br.com.tt;

import br.com.tt.model.Usuario;

import java.util.Scanner;

public class Aplicacao {
    private static Usuario[] usuarios = new Usuario[2];
    private static int indiceUsuario = 0;

    public static void main(String[] args) {
        perguntarUsername();

        while (true){
            perguntarOpcao();
        }
    }
    private static void perguntarOpcao(){
        System.out.println("Informe: \n1 - Escrever mensagem\n2 - Listar mensagens\n3 - Sair");
        int opcao = new Scanner(System.in).nextInt();
        switch (opcao){
            case 1:
                perguntarMensagem();
                break;
            case 2:
                //listarMensagens();
                break;
            case 3:
                System.exit(0);
        }
    }
    private static void perguntarMensagem(){
        System.out.println("Informe sua mensagem: ");
        String msg = new Scanner(System.in).nextLine();
    }
    private static void perguntarUsername(){
        System.out.println("Bem vindo!");
        System.out.println("Informe seu nome: ");
        String nome = new Scanner(System.in).nextLine();

        Usuario novoUsuario = new Usuario();
        novoUsuario.setNome(nome);
        usuarios[indiceUsuario++] = novoUsuario;
    }
}

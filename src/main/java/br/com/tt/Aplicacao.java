package br.com.tt;

import br.com.tt.model.Mensagem;
import br.com.tt.model.Usuario;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Aplicacao {
    private static Usuario[] usuarios = new Usuario[2];
    private static int indiceUsuario = 0;

    private static Mensagem[] mensagens = new Mensagem[100];
    private static int indiceMensagens = 0;

    public static void main(String[] args) {
        perguntarUsername();

        while(true){
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
                listarMensagens();
                break;
            case 3:
                System.exit(0); //Só usar em aplicações CONSOLE!!
        }
    }

    private static void listarMensagens(){
        for (Mensagem msg : mensagens){
            if(msg == null){
                break;
            }
            System.out.printf("%s\n", msg.getTexto());
        }
    }

    private static void perguntarMensagem(){
        System.out.println("Informe sua mensagem: ");
        String texto = new Scanner(System.in).nextLine();

//        Mensagem mensagem = new Mensagem();
//        mensagem.setTexto(texto);
//        mensagem.setDataHoraEnvio(LocalDateTime.now());
        //mensagem.setOrigem(new Usuario());
        //mensagem.setDestino(new Usuario());

//        Mensagem mensagem = new Mensagem(texto);
        //Usa o Zero e incrementa depois
//        mensagens[indiceMensagens++] = mensagem;

        mensagens[indiceMensagens++] = new Mensagem(texto);
    }
    private static void perguntarUsername(){
        System.out.println("Bem vindo!");
        System.out.println("Informe seu nome: ");
        String nome = new Scanner(System.in).nextLine();

//        Usuario novoUsuario = new Usuario();
//        novoUsuario.setNome(nome);
//        usuarios[indiceUsuario++] = novoUsuario;

        usuarios[indiceUsuario++] = new Usuario(nome);

    }
}

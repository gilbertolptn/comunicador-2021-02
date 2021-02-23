package br.com.tt.model;

import java.time.LocalDateTime;

public class Mensagem {
    private String texto;
    private LocalDateTime dataHoraEnvio;
//    private Usuario origem;
//    private Usuario destino;

    //Construtor padrão - sem argumentos
//    public Mensagem(){
//    }

    //Construtor
    public Mensagem(String novoTexto){
        if(novoTexto.length() < 5){
            System.err.println("Mensagem não deve ser menor que 5 caracteres!");
            System.exit(1); //Só usem em CONSOLE!
        }
        texto = novoTexto;
        dataHoraEnvio = LocalDateTime.now();
    }

//    public void setTexto(String novoTexto){
//        if(novoTexto.length() < 5){
//            System.err.println("Mensagem não deve ser menor que 5 caracteres!");
//            System.exit(1); //Só usem em CONSOLE!
//        }
//        texto = novoTexto;
//    }

    public void setDataHoraEnvio(LocalDateTime dataHora){
        dataHoraEnvio = dataHora;
    }

    public String getTexto(){
        return texto;
    }

//    public void setOrigem(Usuario origem) {
//        this.origem = origem;
//    }
//
//    public void setDestino(Usuario destino) {
//        this.destino = destino;
//    }
}

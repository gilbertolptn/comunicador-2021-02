package br.com.tt.model;

public class Usuario {
    //private Long id;
    private String nome;

    public void setNome(String novoNome){
        if(novoNome.length() < 3){
            System.err.println("Nome não deve ser menor que 3 caracteres!");
            System.exit(1); //Só usem em CONSOLE!
        }
        nome = novoNome;
    }
}

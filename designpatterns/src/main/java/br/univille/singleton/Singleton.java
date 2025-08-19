package br.univille.singleton;

public class Singleton {
    // variavel global, static ele faz com que ele seja alocado na memória antes que o objeto
    private static Singleton instance;

    private Singleton(){

    }
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}

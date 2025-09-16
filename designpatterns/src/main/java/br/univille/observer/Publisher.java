package br.univille.observer;

import java.util.ArrayList;

public class Publisher extends ConcreteSubscriber{
    //Lista Estática
    //private Subscriber[] subscribers = new Subscriber[10];

    //Lista Dinâmica
    private ArrayList<Subscriber> subscribers = new ArrayList<>();
    private String mainState;

    public String getMainState() {
        return mainState;
    }

    public void setMainState(String mainState) {
        this.mainState = mainState;
    }

    public void subscribe(Subscriber assinante) {
        subscribers.add(assinante);
    }
    
    public void notifySubscribers(){
        for(Subscriber umAssinante: subscribers){
            umAssinante.update(mainState);
        }
    }
}

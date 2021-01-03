package com.example.demo.exception;

/*
Classe d'exception si la ressource recherché n'est pas trouvé
*/
public class RessourceNotFoundException extends Exception{
    public RessourceNotFoundException(){
        super();
    }

    public RessourceNotFoundException(String s){
        super(s);
    }
}

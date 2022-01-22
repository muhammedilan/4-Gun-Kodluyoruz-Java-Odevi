package com.company;

public class Main {

    public static void main(String[] args) {
        RegisterAndLogin registerAndLogin = new Genelİslemler();
        registerAndLogin.register("mehmet",5);
        registerAndLogin.login("mehmet",5);
        registerAndLogin.account();
        registerAndLogin.GameSell("Fifa 22",50);
        registerAndLogin.indirim(30);
        registerAndLogin.indirimiGüncelle(1);
    }
}

package com.company;

public abstract class RegisterAndLogin {

    abstract void login(String loginName,int LoginPass);

    abstract void register(String name, int password);

    abstract void update(String name,int password);
    abstract void delete();
    abstract void account();
    abstract void GameSell(String game,double price);
    abstract void indirim(double indirim);
    abstract void indirimiKaldır();
    abstract void indirimiGüncelle(double indirim);

}

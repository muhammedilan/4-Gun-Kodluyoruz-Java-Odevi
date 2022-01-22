package com.company;

public class Genelİslemler extends RegisterAndLogin {
    String name;
    int password;

    String game;
    double price;
    double indirimliFiyat;

    String loginName;
    int loginPassword;

    @Override
    void register(String name, int password) {
        this.name = name;
        this.password = password;
        System.out.println("Kaydoldunuz");
    }

    @Override
    void login(String loginName, int LoginPassword) {
        this.loginName = loginName;
        this.loginPassword = LoginPassword;

        if (name == loginName && password == LoginPassword) {
            System.out.println("Giriş Yaptınız");
        } else {
            System.out.println("Kaydolurken ki isminiz veya parolanız aynı değil! yada hesap silinmiş");
        }
    }

    @Override
    void update(String name, int password) {
        this.name = name;
        this.password = password;
        System.out.println("Bilgileriniz güncellendi");
    }

    void delete() {
        this.name = "";
    }

    void account() {
        System.out.println("Adınız :" + " " + name);
        System.out.println("Şuan Mağazanızda olan oyunlar : " + game);
        if (name == "") {
            System.out.println("Hesabınız silinmiş");
        } else {
            System.out.println("Şifreniz : " + " " + password);
        }

    }


    void GameSell(String game, double price) {
        this.game = game;
        this.price = price;
        System.out.println(game + " " + "Oyunu mağazaya eklenmiştir" + " " + "ücreti : " + price);
    }

    void indirim(double indirim) {
        indirimliFiyat = price - indirim;
        System.out.println("Oyununuza : " + indirim + " " + "Tl indirim yaptınız artık oyununuz : " + indirimliFiyat + " " + "Tl Dir");
    }
    void indirimiKaldır() {
        System.out.println("İndirim kaldırılmıştır artık oyununuz" + " " + price + "Tl dir" );
    }
    void indirimiGüncelle(double indirim) {
        indirimliFiyat = price - indirim;
        System.out.println("İndiriminiz güncellendi" + " " + indirim + " " + "Tl indirim yaptınız şuanki fiyatı : " + indirimliFiyat);
    }
}


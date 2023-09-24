package com.hamitmizrak.login;

public interface ILoginProcess {

    // login
    public boolean isLogin();

    // Kayıt ol
    void register();

    // para ekle
    Double addMoney();

    // para görüntüle
    void showMoney();

    // para çek
    void reduceMoney();

    // Eft yap (Diğer bankalar)
    void sentEftMoney();

    // Havale yap (Aynı bankadan bankaya)
    void sentTransferMoney();

    // Mail
    void smailSend();

    // Logout
    void logout();
}

package com.hamitmizrak.login;

import com.hamitmizrak.dto.RegisterDto;

public interface ILoginProcess {

    // login
    public RegisterDto isLogin(String email, String password);

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

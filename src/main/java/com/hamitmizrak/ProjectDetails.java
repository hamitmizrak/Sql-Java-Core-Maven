package com.hamitmizrak;

import java.util.Scanner;

// Press
public class ProjectDetails {

    // Devam Etmek için bir tuşa basınız
    private static void myProjectContinuesButton() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Devam etmek için bir tuşa basınız");
        scanner.hasNext();
    }

    public static void main(String[] args) {
        System.out.printf("My ATM Project\n");
        // devam etmek için bir tuşa basınız
        myProjectContinuesButton();
        System.out.println(
                "Projemiz Bir ATM Projesidir\n" +
                        "Sisteme giriş için Kullanıcı Önceden kayıtlı olması gerekiyor yoksa kayıt olmalıdır.\n" +
                        "username, password\n" +
                        "Database CRUD\n" +
                        "File Writer- Reader (EFT file)\n" +
                        "File Writer- Reader (Havale file)\n ");
        myProjectContinuesButton();
        // devam etmek için bir tuşa basınız
        System.out.printf("ATM Özellikleri");
        System.out.println(
                        "\nKullanıcı kayıtlı değilse kayıt olsun.\n" +
                        "Bakiye Öğren.\n" +
                        "Para Gönder.\n" +
                        "Para Yatır.\n" +
                        "Para Çek.\n" +
                        "EFT Gönder.\n" +
                        "Havale Gönder.\n" +
                        "Mail Gönder.\n" +
                        "File Writer- Reader (Günün Özeti file).\n"+
                        "ÇIKIŞ\n");
    } //end psvm
} //end class
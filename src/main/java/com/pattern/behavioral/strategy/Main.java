package com.pattern.behavioral.strategy;

public class Main {
    static void main() {

        Notification email = new Email(new AESEncryption(), new ZipCompression());
        email.encrypt();
        email.compress();

        Notification sms = new Sms(new AESEncryption(), new GZipCompression());
        sms.encrypt();
        sms.compress();

        Notification push = new Push(new RSAEncryption(), new ZipCompression());
        push.encrypt();
        push.compress();
    }
}

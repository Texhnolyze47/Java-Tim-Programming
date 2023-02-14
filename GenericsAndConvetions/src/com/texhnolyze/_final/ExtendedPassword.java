package com.texhnolyze._final;

public class ExtendedPassword extends Password {
    private int deDecryptedPassword;

    public ExtendedPassword(int password) {
        super(password);
        this.deDecryptedPassword = password;
    }

//    @Override
//    public void storePassword() {
//        System.out.println("Saving password as " + this.deDecryptedPassword);
//    }
}

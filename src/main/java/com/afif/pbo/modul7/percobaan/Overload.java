package com.afif.pbo.modul7.Percobaan;

public class Overload {
    void myOverload(A a){
        System.out.println("Overload.myOverload(A a)");
    }

    void myOverload(B b){
        System.out.println("Overload.myOverload(B b)");
    }
    public static void main(String[] args) {
        Overload o = new Overload();
        C c = new C();

        o.myOverload(c);
    }
}

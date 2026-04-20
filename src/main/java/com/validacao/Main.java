package com.validacao;


public class Main {
    public static void main(String[] args) {
       ValidadorUsuario vu = new ValidadorUsuario();

       System.out.println(vu.validarNomeUsuario(""));
       System.out.println(vu.validarSenha("Abcdgdfgd23@"));
       System.out.println(vu.validarEmail("Aaa@gmail.com"));
    }
}

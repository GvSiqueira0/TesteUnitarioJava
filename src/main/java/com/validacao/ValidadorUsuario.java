package com.validacao;
public class ValidadorUsuario {
    public boolean validarNomeUsuario(String nome) {
        if (nome == null) throw new IllegalArgumentException("Nome null");
        return nome.length() >= 3 && nome.length() <= 20;
    }

    public boolean validarEmail(String email) {
        if (email == null) throw new IllegalArgumentException("Email null");
        String regexPattern = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(regexPattern);
    }

    public boolean validarSenha(String senha) {
        if (senha == null) throw new IllegalArgumentException("Senha null");
        
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()_+=.;:]).{8,}$";
        if (senha.matches(regex)) {
            System.out.println("Senha valida!");
            return true;
        }
        System.out.println("Senha nao atende os padroes mínimos. Use Letras Maiusculas, Minusculas, Caracteres Especiais" +
                "e Digitos. Deve ter no minimo 8 caracteres no total.");
        return false;
    }
}

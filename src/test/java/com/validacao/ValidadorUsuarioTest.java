package com.validacao;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorUsuarioTest {
    private final ValidadorUsuario usuario = new ValidadorUsuario();

    // Teste Nome Valido
    @Test
    void TestNomeValido(){
        assertTrue(usuario.validarNomeUsuario("Gabriel Siqueira"));
    }

    //Teste Nome Invalido nome < 3 ou > 20
    @Test
    void nomeInvalido(){
        assertFalse(usuario.validarNomeUsuario("gv"));
    }
    
    // Teste Nome Null
    @Test
    void nomeNull(){
       assertThrows(IllegalArgumentException.class, () -> usuario.validarNomeUsuario(null));
}

   
    // Teste Email Valido
    @Test
    void TestEmailValido(){
        assertTrue(usuario.validarEmail("gabriel@gmail.com"));
    }

    //Teste Email Sem @
    @Test
    void semArroba(){
        assertFalse(usuario.validarEmail("gabriel.gmail.com"));
    }

    //Teste Email Sem Dominio
    @Test 
    void semDominio(){
        assertFalse(usuario.validarEmail("gabriel@test"));
    }

    // Teste Email Null
    @Test
    void emailNull(){
        assertThrows(IllegalArgumentException.class, () -> usuario.validarEmail(null));
    }



    // Teste Senha Valida
    @Test
    void senhaValida(){
        assertTrue(usuario.validarSenha("@Senha08"));
    }

    // Teste Senha Sem Minimo de Caracter
    @Test
    void minCaracter(){
        assertFalse(usuario.validarSenha("@Tt0"));
    }

    // Teste Senha Sem Caracter Especial
    @Test
    void caracterEspecial(){
        assertFalse(usuario.validarSenha("Aa123456"));
    }

    // Teste Senha Sem Letra Minuscula
    @Test
    void letraMinus(){
        assertFalse(usuario.validarSenha("@ABCD123"));
    }

    //Teste Senha Sem Letra Maiuscula
    @Test
    void letraMaius(){
        assertFalse(usuario.validarSenha("@abcd123"));
    }

    // Teste Senha Sem Numero
    @Test
    void semNumero(){
        assertFalse(usuario.validarSenha("@ABCDefg"));
    }
    
    // Teste Senha Null
    @Test
    void TestSenhaNull(){
        assertThrows(IllegalArgumentException.class, () -> usuario.validarSenha(null));
    }
}


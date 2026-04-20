package com.validacao;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorUsuarioTest {
    private final ValidadorUsuario usuario = new ValidadorUsuario();

    @Test
    void TestNomeValido(){
        assertTrue(usuario.validarNomeUsuario("Gabriel Siqueira"));
    }

    @Test
    void TestNomeInvalido(){
        assertFalse(usuario.validarNomeUsuario("gv"));
    }
    
    @Test
    void TestNomeNulo(){
       assertThrows(IllegalArgumentException.class, () -> usuario.validarNomeUsuario(null));
}
   

    @Test
    void TestEmailValido(){
        assertTrue(usuario.validarEmail("gabriel@gmail.com"));
    }
    @Test
    void TestEmailSemArroba(){
        assertFalse(usuario.validarEmail("gabriel.gmail.com"));
    }
    @Test 
    void TestEmailSemDominio(){
        assertFalse(usuario.validarEmail("gabriel@test"));
    }
    @Test
    void TestEmailNull(){
        assertThrows(IllegalArgumentException.class, () -> usuario.validarEmail(null));
    }



    @Test
    void TesteSenhaMinima(){
        assertTrue(usuario.validarSenha("SenhaUltraForte123.@.."));
    }

    @Test
    void TesteSenhaInvalida(){
        assertFalse(usuario.validarSenha("Aasaq1asi"));
    }
}


package com.minhaAplicacao.CadastroDeNinjas;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping
public class NinjaController {

    /*
     * public String getMethodName(@RequestParam String param) {
     * return new String();
     * }
     */

    @GetMapping("/boasvindas")
    public String boasvindas() {
        return "primeira mensagem dessa rota";
    }

}

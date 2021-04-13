package br.com.alison.financeiro.resources;

import br.com.alison.financeiro.model.FormaPagamento;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.Arrays.asList;

@RestController
@RequestMapping("formapagamento")
public class FormaPagamentoResource {

    @RequestMapping(method = RequestMethod.GET, path = "/listar")
    public List<FormaPagamento> listar() {
        return asList(new FormaPagamento("Dinheiro"), new FormaPagamento("Cartão"));
    }
}

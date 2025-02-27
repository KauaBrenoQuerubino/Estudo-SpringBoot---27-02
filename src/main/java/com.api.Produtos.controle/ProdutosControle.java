package com.api.Produtos.controle;


import com.api.Produtos.modelo.ProdutoModelos;
import com.api.Produtos.modelo.RespostaModelo;
import com.api.Produtos.repositorio.ProdutoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@RestController
public class ProdutosControle {

    //acoes
    @Autowired
    private ProdutoRepositorio acoes;

    //inicio
    @RequestMapping(value = "/Produtos", method = RequestMethod.GET)
    public @ResponseBody List<ProdutoModelos> ListaProdutos() {
        return acoes.findAll();
    }

    //CadastrarProduto
    @RequestMapping(value = "/Produtos", method = RequestMethod.POST)
    public @ResponseBody ProdutoModelos cadastrar(@RequestBody ProdutoModelos produto){
        return acoes.save(produto);
    }

    //Filtrar Produtos
    @RequestMapping(value = "/Produtos/{codigo}", method = RequestMethod.GET)
    public @ResponseBody ProdutoModelos Filtrar(@PathVariable Integer codigo) {
        return acoes.findByCodigo(codigo);
    }

    //Alterar
    @RequestMapping(value = "/Produtos", method = RequestMethod.PUT)
    public @ResponseBody ProdutoModelos Alterar(@RequestBody ProdutoModelos produto){
        return acoes.save(produto);
    }

    //DELETE
    @RequestMapping(value = "/Produtos/{codigo}", method = RequestMethod.DELETE)
    public @ResponseBody RespostaModelo Delete(@PathVariable Integer codigo) {

        RespostaModelo resposta = new RespostaModelo();
        try {
            ProdutoModelos produto = Filtrar(codigo);
            this.acoes.delete(produto);
            resposta.setMensagem("Produto Excluido com sucesso");
        }catch (Exception e){
            resposta.setMensagem("Erro: " + e.getMessage());
        }
        return resposta;
    }
}

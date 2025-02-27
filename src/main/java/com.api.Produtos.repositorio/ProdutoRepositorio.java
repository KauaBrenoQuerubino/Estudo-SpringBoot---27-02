package com.api.Produtos.repositorio;

import com.api.Produtos.modelo.ProdutoModelos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProdutoRepositorio extends CrudRepository<ProdutoModelos, Integer> {

    //Lista os produtos
    List<ProdutoModelos> findAll();

    //Pesquisa pelo codigo
    ProdutoModelos findByCodigo(int codigo);

    //Remove produto
    void delete(ProdutoModelos produtos);

    //Cria/altera produto
    <ProdMod extends ProdutoModelos> ProdMod save(ProdMod produtos);


}

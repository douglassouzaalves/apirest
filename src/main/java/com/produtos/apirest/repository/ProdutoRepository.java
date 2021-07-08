package com.produtos.apirest.repository;

import com.produtos.apirest.models.Produto;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProdutoRepository {

    @Select("SELECT * FROM tb_produtos WHERE Id=#{Id}")
    Produto findById(Long Id);

    @Select("SELECT Id AS Id,nome,quantidade,valor FROM tb_produtos")
    List<Produto> select();

    @Delete("DELETE FROM tb_produtos WHERE Id=#{Id}")
    int deleta(Long Id);
}

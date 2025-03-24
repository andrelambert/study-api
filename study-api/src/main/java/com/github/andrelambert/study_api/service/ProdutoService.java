package com.github.andrelambert.study_api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.github.andrelambert.study_api.model.Produto;

@Service
public class ProdutoService {
    private List<Produto> produtos = new ArrayList();
    private Long id = 1L;

    public Produto save(Produto produto) {
        return null;
    }
}

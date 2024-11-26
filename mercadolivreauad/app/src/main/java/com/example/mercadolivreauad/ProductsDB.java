package com.example.mercadolivreauad;

import java.util.ArrayList;
import java.util.List;

public class ProductsDB {
    private List<Product> productsList;

    public ProductsDB() {
        this.productsList = new ArrayList<>();

        this.productsList.add(
                new Product(
                        "Mouse Logitech Master 3s",
                        "Faz o L bb",
                        R.drawable.master3s,
                        R.drawable.master3sfull,
                        5,
                        1.99
                )
        );
        this.productsList.add(
                new Product(
                        "Chevette da Paraiba",
                        "Faz o L bb",
                        R.drawable.chevette,
                        R.drawable.chevette,
                        1,
                        9999.99
                )
        );
        this.productsList.add(
                new Product(
                        "Parafusa legal",
                        "Faz o L bb",
                        R.drawable.parafusadeira,
                        R.drawable.parafusadeira,
                        3,
                        12.99
                )
        );
        this.productsList.add(
                new Product(
                        "Martelo Quebra Tudo",
                        "Faz o L bb",
                        R.drawable.martelodemolidor,
                        R.drawable.martelodemolidor,
                        4,
                        221.99
                )
        );
        this.productsList.add(
                new Product(
                        "Palheta para o Vidro",
                        "Faz o L bb",
                        R.drawable.palhetas,
                        R.drawable.palhetas,
                        2,
                        134.99
                )
        );
        this.productsList.add(
                new Product(
                        "Caixa de Ferramentas",
                        "Faz o L bb",
                        R.drawable.caixaferramentas,
                        R.drawable.caixaferramentas,
                        5,
                        44.99
                )
        );
    }

    public List<Product> getProductsList() {
        return this.productsList;
    }
}

// /home/mizael/.android/avd/Medium_Phone_API_33.avd/*.lock
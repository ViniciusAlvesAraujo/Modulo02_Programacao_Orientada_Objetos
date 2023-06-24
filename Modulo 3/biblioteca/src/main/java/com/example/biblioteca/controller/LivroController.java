package com.example.biblioteca.controller;

import com.example.biblioteca.model.Livro;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/livros")

public class LivroController {
    private List<Livro> livros = new ArrayList<>();

    public LivroController(){
        livros.add(new Livro(1,"Ensaio de cegueira"));
        livros.add(new Livro(2,"Dom Casmurro"));
        livros.add(new Livro(3, "O Pequeno principe"));
        livros.add(new Livro(4, "Brida"));
        livros.add(new Livro(5,"Biblia sagrada"));
        livros.add(new Livro(6, "A menina que roubava livros"));
        livros.add(new Livro(7, "Percy Jackson e o Ladrão de Raios"));
        livros.add(new Livro(8, "Manifesto do partido comunista"));
        livros.add(new Livro(9,"O Capital"));
    }

    @GetMapping
    public List<Livro>getAll(){
        return livros;
    }

    @GetMapping("/{id}")
    public Livro obterPeloId (@PathVariable int id){
        for(Livro livro : livros){
            if (livro.getId() == id){
                return livro;
            }
        }
        return null;
    }

    @GetMapping("/livro")
    public Livro getByNome (@RequestHeader String nome){
        for (Livro livro : livros){
            if(livro.getNome().equalsIgnoreCase(nome)){
                return livro;
            }
        }
    }
    @PostMapping
    public String salvar(@RequestBody Livro livro){
        for (Livro livroAtual : livros){
            if (livroAtual.getId() == livro.getId()){
                return "O livro já existe na lista.";
            }
        }
        livros.add(livro);
        return "Livro" + livro.getNome() +  "adicionado com sucesso.";
    }

    @PutMapping
    public String atualizar(@RequestBody Livro livro){
        for (Livro livroDaLista : livros){
            if (livroDaLista.getId() == livro.getId()){
                livroDaLista.setNome(livro.getNome());
                return "O livro de ID " + livro.getId() + " teve o nome alterado para " + livro.getNome();
            }
        }
        return "O livro informado não existe.";
    }

    @DeleteMapping("/{id}")
    public Livro deletar(@PathVariable int id){
        for (Livro livro : livros){
            if (livro.getId() == id){
                String mensagem = "O livro " + livro.getNome() + "foi removido com sucesso";
                livros.remove(livro);
            }
        }
        return null;
    }
}

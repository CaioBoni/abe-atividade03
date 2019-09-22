package aula03.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import aula03.entity.Livro;
import aula03.service.LivroService;

@RestController
public class LivroController {
	
	@Autowired LivroService livroService;
	
	@GetMapping(value = "/livros", produces = "application/json")
	public List<Livro> buscarLivros(@RequestBody Livro livro) {
		return livroService.buscarLivros(livro);
	}

	@PostMapping(value = "/livros", produces = "application/json")
	public List<Livro> cadastrarLivros(@RequestBody List<Livro> livros) {
		return livroService.gravarLivros(livros);
	}
	
	@PutMapping(value = "/livros", produces = "application/json")
	public List<Livro> atualizarLivros(@RequestBody List<Livro> livros) {
		return livroService.gravarLivros(livros);
	}
	
	@DeleteMapping(value = "/livros/{id}", produces = "application/json")
	public Livro deletarLivro(@RequestParam Long id) {
		return livroService.deletarLivro(id);
	}

//	Livro.comComentario(livro.getComentarios()
}

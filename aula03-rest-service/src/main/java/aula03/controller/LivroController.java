package aula03.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import aula03.entity.Livro;

@RestController
@CrossOrigin(methods= {RequestMethod.GET, RequestMethod.POST})
public class LivroController {

	@GetMapping(value = "/livro", produces = "application/json")
	public Livro buscarLivros() {
		return new Livro();
	}
	
	@PostMapping(value = "/livro", produces = "application/json")
	public Livro adicionarComentario(@RequestBody Livro livro) {
		return Livro.comComentario(livro.getComentarios());
	}

}

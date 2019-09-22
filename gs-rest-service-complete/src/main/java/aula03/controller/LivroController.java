package hello.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import hello.entity.Livro;

@RestController
public class LivroController {

	@RequestMapping(value = "/livro", produces = "application/json", method=RequestMethod.GET)
	public Livro buscarLivros() {
		return new Livro();
	}
	
	@RequestMapping(value = "/livro", produces = "application/json", method=RequestMethod.POST)
	public Livro adicionarComentario(@RequestBody Livro livro) {
		return Livro.comComentario(livro.getComentarios());
	}
}

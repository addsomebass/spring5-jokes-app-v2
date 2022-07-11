package com.joevmartin.springcourse.spring5jokesapp.controllers;

import com.joevmartin.springcourse.spring5jokesapp.model.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

	private final JokeService jokeService;

	public JokeController( JokeService jokeService ) {
		this.jokeService = jokeService;
	}


	@RequestMapping({"/", ""})
	public String getJoke( Model model) {
		final String joke = jokeService.getJoke();

		model.addAttribute( "joke", joke );

		return "index";
	}

}

package com.joevmartin.springcourse.spring5jokesapp.model;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

	private final ChuckNorrisQuotes chuckNorrisQuotes;

	public JokeServiceImpl() {
		chuckNorrisQuotes = new ChuckNorrisQuotes();
	}

	@Override
	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}
}

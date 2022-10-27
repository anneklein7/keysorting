package com.example.exception;

import javax.persistence.EntityNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "There is no playlist with this ID. Sorry!")
public class PlaylistNotFoundException extends EntityNotFoundException {
	private static final long serialVersionUID = 1L;
	public PlaylistNotFoundException() {}
	public PlaylistNotFoundException(String msg) {
		super(msg);
	}

}

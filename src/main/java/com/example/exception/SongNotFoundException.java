package com.example.exception;

import javax.persistence.EntityNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
(code = HttpStatus.NOT_FOUND, reason = "There is no song with this ID")
public class SongNotFoundException extends EntityNotFoundException {
	private static final long serialVersionUID = 1L;
	public SongNotFoundException() {}
	public SongNotFoundException(String msg) {
		super(msg);
	}

}

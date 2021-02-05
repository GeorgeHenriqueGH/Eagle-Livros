package br.com.eagle.domain.user;

import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;

@Getter
@Setter
@EqualsAndHashCode
public abstract class User {
	
	private Integer id;
	
	private String nome;
	private String senha;
	private String email;
	
}

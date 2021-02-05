package br.com.eagle.domain.user;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.EqualsAndHashCode;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

@Entity	
@SuppressWarnings("serial")
@MappedSuperclass
public abstract class User implements Serializable {
	
	@EqualsAndHashCode.Include
	@Id
	private Integer id;
	
	private String nome;
	private String senha;
	private String email;
	
}

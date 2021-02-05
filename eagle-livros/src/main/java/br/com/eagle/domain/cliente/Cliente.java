package br.com.eagle.domain.cliente;


import javax.persistence.Entity;

import br.com.eagle.domain.user.User;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
@Entity
@SuppressWarnings("serial")
public class Cliente extends User  {

	private String imageProfile;
	
}

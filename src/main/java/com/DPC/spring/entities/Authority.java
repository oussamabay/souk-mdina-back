package com.DPC.spring.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;
/**
 * @author slim
 *
 */
@Entity
@Table(name = "AUTHORITY")
public class Authority implements GrantedAuthority, Serializable {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;


	@Column(name = "name" )
	String name;
 
	@Column(name = "description")
	String description;

	private Boolean archiver ;
	



	@Override
	public String getAuthority() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// @JsonIgnore
	public String getName() {
		return name;
	}

	// @JsonIgnore
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getArchiver() {
		return archiver;
	}

	public void setArchiver(Boolean archiver) {
		this.archiver = archiver;
	}

}

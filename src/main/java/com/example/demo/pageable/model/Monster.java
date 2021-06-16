package com.example.demo.pageable.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Digits;

import lombok.Data;

@Data
@Entity
@Table
public class Monster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="name",length = 20, unique = true, nullable = false)
	private String name;
	
	@Column(name="color", nullable = false)
	private String color;
	
	@Column(name="height", nullable = false)
	@Digits(integer = 3, fraction = 2)
	private Double height;
	
	@Column(name="weight", nullable = false)
	@Digits(integer = 3, fraction = 2)
	private Double weight;
	
	@Column(name="maxMp", nullable = false)
	private String maxMp;
	
	@Column(name="mp")
	private String mp;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy ="monster",cascade = CascadeType.ALL)
	private List<Move> moves;
	
	
}

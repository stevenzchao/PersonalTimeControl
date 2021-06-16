package com.example.demo.pageable.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Data;

@Data
@Entity
@Table
public class Move {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="name",length = 20, unique = true, nullable = false)
	private String moveName;
	
	@Column(name="mpConsume", nullable = false)
	private Integer mpConsume;
	
	@Column(name="attackPower", nullable = false)
	private Integer attackPower;
	
	@Transient
	@Column(name="fk_monsterId")
	private Integer fk_monsterId;
	
	@JoinColumn(name="fk_monsterId")
	@ManyToOne(cascade = CascadeType.ALL)
	private Monster monster;

}

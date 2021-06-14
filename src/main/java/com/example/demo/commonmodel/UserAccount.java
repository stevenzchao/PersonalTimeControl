package com.example.demo.commonmodel;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;

import com.example.demo.basic1.model.Incident;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Component
@Table(name="userAccount")
public class UserAccount {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="accountID")
	private Integer accountID;
	
	@Column(name="account_index")
	private String account_index;
	
	@Column(name="password")
	private String password;
	
	@OneToMany(mappedBy = "userAccount", fetch = FetchType.LAZY)
	private Set<Incident> userIncidents = new HashSet<Incident>();


}

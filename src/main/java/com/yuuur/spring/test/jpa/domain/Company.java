package com.yuuur.spring.test.jpa.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Table(name="company")
@Entity
public class Company {
	
	@Id
	private int id;
	private String name;
	private String business;
	private String scale;
	private int headcount;
	private Date createdAt;
	private Date updatedat;

}

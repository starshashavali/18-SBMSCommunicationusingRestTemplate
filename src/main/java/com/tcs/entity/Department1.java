package com.tcs.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "departments1")
@Data
public class Department1 {
	@Id
	@GeneratedValue
	private Integer id;
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;
}

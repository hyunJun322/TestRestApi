package com.example.restfulwebservice.user;

import java.util.Date;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
//@JsonIgnoreProperties(value = {"password","ssn"})
//@JsonFilter("UserInfo")
@NoArgsConstructor
public class User {
		private Integer id;
		
		@Size(min = 2, message = "Name은 2글자 이상 입력해주세요")
		private String name;

		
		@Past
		private Date joinDate;
	
//		@JsonIgnore
		private String password;
//		@JsonIgnore
		private String ssn;
		
	
}

package com.callor.student.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class StudentVO {
	
	private String stNum;
	private String stName;
	private String stDept;
	private int stGrade;
	private String stTel;
	

}

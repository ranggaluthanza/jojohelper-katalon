package com.jojonomic.katalon.api

import java.sql.Connection
import java.sql.ResultSet
import java.time.LocalDate
import java.time.format.DateTimeFormatter

import com.kms.katalon.core.annotation.Keyword
import groovy.sql.Sql

public class Helper{
	@Keyword // membuat import class menjadi keyword
	public static LocalDate parsingDate(String date){
		DateTimeFormatter date_format 	= DateTimeFormatter.ofPattern("yyyy-MM-dd")
		LocalDate  parsedDate			= LocalDate.parse(date, date_format)
		return parsedDate
	}
	@Keyword
	public static boolean validateDate(String date){
		String pattern = "[0-9]{4}-[0-9]{2}-[0-9]{2}"
		def dateValidation = date.matches(pattern)
		return dateValidation
	}
	@Keyword
	public static boolean validatePhone(String phone){
		String pattern = "\\D[^0-9]"
		def phoneValidation = phone.matches(pattern)
		return phoneValidation
	}
	@Keyword
	public static boolean validateEmail(String email){
		String pattern = "[_A-Za-z0-9-]+(.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(.[A-Za-z0-9]+)*(.[A-Za-z]{2,})"
		def emailValidation = email.matches(pattern)
		return  emailValidation
	}
	@Keyword
	public static boolean validateBooleanType(String variable){
		Boolean[] operator=[true, false]
		def logicBoolean = operator.any{operator.contains(variable)}
		return logicBoolean
	}
}



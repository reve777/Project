package com.psi.valid;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class LocalDateValidator implements ConstraintValidator<LocalDate, Date> {

	@Override
	public boolean isValid(Date value, ConstraintValidatorContext context) {
		SimpleDateFormat dtf = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		String a1 = dtf.format(value);
		String a2 = dtf.format(date);
		if (value.compareTo(date) > 0 || a1.equals(a2)) {
			return true;

		}
		return false;
	}
}

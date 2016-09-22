package org.sarindy.Tu13;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobbiesAnotation, String> {

	@Override
	public void initialize(IsValidHobbiesAnotation arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isValid(String studentHobbies, ConstraintValidatorContext ctx) {

		if (studentHobbies == null) {
			return false;

		}

		if (studentHobbies.matches("Music|Sex")) {
			return true;

		} else {
			return false;
		}
	}
}
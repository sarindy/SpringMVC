package org.sarindy.Tu13;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobbiesAnotation, String> {
	
	private String myListOfHobbies;
	

	@Override
	public void initialize(IsValidHobbiesAnotation isValidHobbiesAnnotation) {
		this.myListOfHobbies=isValidHobbiesAnnotation.myListOfHobbies();
	}

	@Override
	public boolean isValid(String studentHobbies, ConstraintValidatorContext ctx) {

		if (studentHobbies == null) {
			return false;

		}

		if (studentHobbies.matches(this.myListOfHobbies)) {
			return true;

		} else {
			return false;
		}
	}
}
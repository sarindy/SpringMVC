package org.sarindy.Tu13;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = HobbyValidator.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface IsValidHobbiesAnotation {
	
	String myListOfHobbies() default "Music|Sex";

	String message() default "Please Provide the correct hobbies";
	Class<?>[] groups() default{};
	Class<? extends Payload>[] payload() default{};
	
}

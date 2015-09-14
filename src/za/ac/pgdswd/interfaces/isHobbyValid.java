package za.ac.pgdswd.interfaces;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import za.ac.pgdswd.validators.HobbyValidator;

@Documented
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = HobbyValidator.class)
public @interface isHobbyValid {

	String listOfValidHobbies() default "Soccer|Tennis|Cricket|Rugby";
	
	String message() default "Please provide a valid hobby";
	
	
	Class<?>[] groups() default {};
	
	Class<? extends Payload> [] payload() default {};
		
	
}

package za.ac.pgdswd.interfaces;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = HobbyValidator)
public @interface isHobbyValid {

	String message() default "Please provide a valid hobby";
	
	Class<?>[] groups() default {};
	
	Class<? extends Payload> [] payload() default {};
		
	
}

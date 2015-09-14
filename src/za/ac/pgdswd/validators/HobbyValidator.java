package za.ac.pgdswd.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import za.ac.pgdswd.interfaces.isHobbyValid;

public class HobbyValidator implements ConstraintValidator<isHobbyValid, String>{

	@Override
	public void initialize(isHobbyValid isHobbyValid) {
		if(isHobbyValid ==null){
			return false;
		}
		
		if(isHobbyValid.)

		
	}

	@Override
	public boolean isValid(String studentHobby, ConstraintValidatorContext context) {
		boolean flag = false;
		
		if(studentHobby ==null){
			flag = false;
		}
		if(studentHobby.matches("Soccer|Tennis|Cricket|Rugby")){
			flag = true; 
		}else{
			flag = false;
		}
		return flag;
	}

}

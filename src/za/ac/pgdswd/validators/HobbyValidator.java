package za.ac.pgdswd.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import za.ac.pgdswd.interfaces.isHobbyValid;

public class HobbyValidator implements ConstraintValidator<isHobbyValid, String>{
	private String listOfValidHobbies;
	@Override
	public void initialize(isHobbyValid isHobbyValid) {
		this.listOfValidHobbies=isHobbyValid.listOfValidHobbies();
		
	}

	@Override
	public boolean isValid(String studentHobby, ConstraintValidatorContext context) {
		boolean flag = false;
		
		if(studentHobby ==null){
			flag = false;
		}
		if(studentHobby.matches(listOfValidHobbies)){
			flag = true; 
		}else{
			flag = false;
		}
		return flag;
	}

}

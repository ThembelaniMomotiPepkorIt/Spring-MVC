package za.ac.pgdswd.customeditors;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport {

	public void setAsText(String studentName) throws IllegalArgumentException {
		if (studentName.contains("Mr") || studentName.contains("Mrs")) {
			//Do nothing
		} else {
			studentName = "Mrs " + studentName;
			
		}
		setValue(studentName);
	}
}

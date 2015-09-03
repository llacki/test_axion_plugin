package axion.test;

public class AxionDummyClass {

	public boolean startsWithUpperCase(String stringToCheck){
		   if (isNotEmpty(stringToCheck) && Character.isUpperCase(stringToCheck.charAt(0))){
			   return true;
		   }
		   
		   return false;
		}

	private boolean isNotEmpty(String stringToCheck) {
		if (stringToCheck != null && stringToCheck.length() > 0) {
			return true;
		}

		return false;
	}

}

package by.jonline.point04.simple_classes.main.prac06;

public class TimeType {

	private int hours;
	private int mins;
	private int secs;
	
	public TimeType(int hrs, int ms, int scs) {
		
		setHours(hrs);
		setMinutes(ms);
		setSeconds(scs);
	}
	
	public void setHours(int hrs) {
		
		hours = hrs >= 0 ? hrs : 0;
	}

	public void setMinutes(int ms) {
		
		mins = isValueValid(ms) ? ms : 0;
	}

	public void setSeconds(int scs) {
		
		secs = isValueValid(scs) ? scs : 0;
	}
	
	public boolean isValueValid(int val) {
		
		if(val >= 0 && val < 60) {
			
			return true;
		}
		return false;
	}
	
	public void increaseHours(int hrs) {
		
		hours += hrs;
	}
	
	public void increaseMinutes(int ms) {
		
		if(isValueValid(ms + mins)) {
			
			mins += ms;
		} else {
			
			ms += mins;
			hours += hoursByMins(ms);
			mins = ms - hoursByMins(ms) * 60;
		}
	}
	
	public void increaseSeconds(int scs) {
		
		if(isValueValid(scs + secs)) {
			
			secs += scs;
		} else {
			
			scs += secs;
			increaseMinutes(minsBySecs(scs));
			secs = scs - minsBySecs(scs) * 60;
		}
	}
	
	@Override
	public String toString() {
		
		return valToStr(hours) + ":" 
				+ valToStr(mins) + ":"
				+ valToStr(secs);
	}
	
	public int hoursByMins(int mins) {
		
		return mins / 60;
	}
	
	public int minsBySecs(int secs) {
		
		return secs / 60;
	}
	
	private String valToStr(int val) {
		
		String result = "";
		
		result += val < 10 ? "0" : "";
		result += val;
		
		return result;
	}
}

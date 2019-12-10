package design_patterns.state;

public class Beer {
	
	private boolean isLabelOK;
	private boolean isTasteOK;
	
	public Beer(boolean label, boolean taste) {
		this.isLabelOK = label;
		this.isTasteOK = taste;
	}
	
	public boolean checkLabel() {
		return isLabelOK;
	}
	
	public boolean checkTaste() {
		return isTasteOK;
	}
}

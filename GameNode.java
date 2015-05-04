public class GameNode{
	private int value;
	boolean hasValue;
	private char label;
	public GameNode(){
		hasValue = false;
		value = -1;
		label = ' ';
	}

	public GameNode(char c){
		hasValue = false;
		value = -1;
		label = c;
	}
	public GameNode(char c, int i){
		hasValue = true;
		value = i;
		label = c;
	}
	
	public int getValue(){
		return value;
	}
	
	public boolean hasValue(){
		return hasValue;
	}
	
	public char getLabel(){
		return label;
	}
	
	public void setValue(int i){
		value = i;
		hasValue = true;
	}
	
	public void setLabel(char c){
		label = c;
	}
}
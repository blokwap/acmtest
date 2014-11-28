public class Seven {

	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public boolean multiplesOfSeven(int value) {
		if (value!=0&&value % 7 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean containsSeven(int value) {
		int j =0;
		while(value!=0){
			j =value%10;
			value=value/10;
			if(isSeven(j)){
				return true;
			}
		}
		return false;
	}

	public boolean isSeven(int value){
		if(value==7){
			return true;
		}else{
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Seven seven = new Seven();
		int value = 300000;
		for (int i = 0; i < value; i++) {
			if (seven.multiplesOfSeven(i) || seven.containsSeven(i)) {
				System.out.println(i);
			}
		}
	}
}

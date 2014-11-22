
public class Recipie {
	private int numberTimesCooked;
	private String recipieURL;
	
	Recipie(String url){
		this.recipieURL = url;
		this.numberTimesCooked =0;
	}

	public int getNumberTimesCooked() {
		return numberTimesCooked;
	}

	public String getURL(){
		return this.recipieURL;
	}
	
	public void incrementCooked(){
		this.numberTimesCooked ++;
	}
}
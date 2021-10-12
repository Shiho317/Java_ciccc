package animals.fish;

public class Eal extends Fish {
	protected Boolean releaseElectric;

	public Eal() {
		super();
		this.releaseElectric = true;
	}

	public Eal(Boolean releaseElec) {
		super();
		this.releaseElectric = releaseElec;
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("releaseElec: " + this.releaseElectric);
	}

}

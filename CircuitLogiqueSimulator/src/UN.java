
public class UN extends Composant{
	public UN() {
		super();
		// TODO Auto-generated constructor stub
		this.setEtat(1);
	}

	@Override
	void miseAJour() {
		// TODO Auto-generated method stub
		this.getSortie().miseAJour();
	}
}

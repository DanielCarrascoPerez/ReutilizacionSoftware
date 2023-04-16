package News;

public class Web extends Medios{
	public Web(Reportero rep) {
		this.rep = rep;
		this.rep.addObserver(this);
	}
	
	@Override
	public void update(Reportero rep) {
		System.out.println(" Web - " + rep.getState());
	}
}

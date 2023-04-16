package News;

public class TV extends Medios{
	public TV(Reportero rep) {
		this.rep = rep;
		this.rep.addObserver(this);
	}
		
	@Override
	public void update(Reportero rep) {
		System.out.println(" TV - " + rep.getState());
	}
}

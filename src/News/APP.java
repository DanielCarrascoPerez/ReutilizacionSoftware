package News;

public class APP extends Medios{
	public APP(Reportero rep) {
		this.rep = rep;
		this.rep.addObserver(this);
	}
		
	@Override
	public void update(Reportero rep) {
		System.out.println(" APP - " + rep.getState());
	}
}

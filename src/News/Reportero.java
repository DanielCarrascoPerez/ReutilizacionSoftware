package News;
import java.util.ArrayList;
import java.util.List;

public class Reportero extends Sujeto{
	private List<Medios> obs = new ArrayList<Medios>();
	private String estado;
	private String name;
	
	public Reportero(String name) {
		this.name = name;
	}
	
	@Override
	public void addObserver(Medios obs) {
		this.obs.add(obs);
	}
	
	@Override
	public void dropObserver(Medios obs) {
		int pos = 0;
		for(Medios o : this.obs) {
			if (o == obs) {
				this.obs.remove(pos);
				break;
			}			
			pos+=1;
		}			
	}
	
	public String getState() {
		return this.estado;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setState(String state) {
		this.estado = state;
		obs.forEach(x -> x.update(this));
	}
}
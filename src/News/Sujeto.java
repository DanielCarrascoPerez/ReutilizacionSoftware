package News;

import java.util.List;

public abstract class Sujeto {
	protected List<Medios> obs;
	public abstract void  addObserver(Medios obs);
	public abstract void  dropObserver(Medios obs);
}

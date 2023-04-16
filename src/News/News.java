package News;

public class News {
	public static void main(String[] args) {
		Reportero rep = new Reportero("Reportero 1");
		Reportero rep2 = new Reportero("Reportero 2");
		Reportero rep3 = new Reportero("Reportero 3");
		Reportero rep4 = new Reportero("Reportero 4");
		
		Web w = new Web(rep);
		TV t = new TV(rep);
		APP a = new APP(rep);
		
		rep2.addObserver(w);
		rep2.addObserver(t);
		
		rep3.addObserver(t);
		rep3.addObserver(a);
		
		rep4.addObserver(w);
		rep4.addObserver(a);
		
		String n1 = "Biden ya es presidente de Estados Unidos: \"La democracia ha ganado\"";
		String n2 = "La tercera ola no se 'suaviza': Sanidad notifica 41.576 contagios, nuevo récord de infecciones en toda la pandemia";
		String n3 = "Los personajes de ‘Toy Story’, ‘Los increíbles’ o ‘Soul’ protagonizan los cortos de ‘Pixar Popcorn’";
		String n4 = "EE. UU. autoriza los primeros vuelos comerciales de drones automatizados sin operadores humanos";
		
		System.out.println("Esperando noticia: " + rep.getName() + " - " + n1);
		rep.setState(n1);
		System.out.println("\nEsperando noticia: " + rep.getName() + " - " + n2);
		rep2.setState(n2);
		System.out.println("\nEsperando noticia: " + rep.getName() + " - " + n3);
		rep3.setState(n3);
		System.out.println("\nEsperando noticia: " + rep.getName() + " - " + n4);
		rep4.setState(n4);
	}
}

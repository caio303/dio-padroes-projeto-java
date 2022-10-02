package gof.singleton;

/**
 *  Singleton "pregui�oso" 
 *  
 *  @author caio303
 */
public class SingletonLazy {

	private static SingletonLazy instance;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		if(instance == null)
			instance = new SingletonLazy();
		return instance;
	}
}

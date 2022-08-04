package trove.systems;
import java.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class Point<I,V> {
	private String name;
	private final AbstractMap<I,V> location;

	public Point(String name, List<I> identifiers, List<V> values){
		this.name = name;
		this.location = new ConcurrentHashMap<I,V>(
				IntStream.range(0, identifiers.size()).boxed().collect(
						Collectors.toMap(
								identifiers::get, values::get
							)
					)
			);
	}

	public Point(String name, AbstractMap<I,V> location){
		this.name = name;
		this.location = location;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public AbstractMap<I,V> getLocation(){
		return location;
	}
}
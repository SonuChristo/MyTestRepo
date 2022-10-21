package co.sonu;

import java.util.ArrayList;
import java.util.List;

class Data{
private String name;

public Data(String name) {
	super();
	this.name = name;
}

public String getName() {
	return name;
}

@Override
public String toString() {
	return "Data [name=" + name + "]";
}


}
public class Main {

	public static void main(String[] args) {
		List<Data>list = new ArrayList<>();
		list.add(new Data("sonu"));
		list.add(new Data("charan"));
		list.add(new Data("junu"));
		list.add(new Data("gautham"));
		list.add(new Data("simha"));
		list.add(new Data("vikas"));
		
		list.forEach(temp->{
			System.out.println(temp.getName());
		});
		
		
		

	}

}

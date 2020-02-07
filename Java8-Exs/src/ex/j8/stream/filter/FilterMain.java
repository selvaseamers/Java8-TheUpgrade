package ex.j8.stream.filter;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import ex.j8.stream.model.Space;

public class FilterMain {

	public static void main(String[] args) {

		List<Space> elementList = Arrays.asList(new Space(1, "comet", 170), // temp in degree
				new Space(2, "Meteorite", 3000), new Space(3, "dwarf planet", -223), new Space(4, "kuiper belt", -223),
				new Space(5, "oort cloud", 4));

		Optional<Space> optionalSpace = elementList.stream().filter((space) -> space.getTemperature() > 1000)
				.peek((name) -> System.out.println("name : " + name)).findFirst();
		
		Space spaceObj = elementList.stream().filter((space) -> space.getTemperature() < 50)
				.peek((name) -> System.out.println("name : " + name)).findFirst().orElse(null);


	}

}

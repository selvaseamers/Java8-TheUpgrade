package ex.j8.stream.peek;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import ex.j8.stream.model.Space;

public class PeekMain {

	public static void main(String[] args) {

		List<Space> elementList = Arrays.asList(new Space(1, "comet", 170), // temp in degree
				new Space(2, "Meteorite", 3000), new Space(3, "dwarf planet", -223), new Space(4, "kuiper belt", -223),
				new Space(5, "oort cloud", 4));

		List<Space> newList = elementList.stream().peek((space) -> space.setTemperature(space.getTemperature() * 2l))
				.collect(Collectors.toList());

		System.out.println(" List after peek : " + newList);
		
	}

}

package ex.j8.stream.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import ex.j8.stream.model.Space;

public class MapMain {

	public static void main(String[] args) {

		List<Space> elementList = Arrays.asList(new Space(1, "comet", 170), // temp in degree
				new Space(2, "Meteorite", 3000), new Space(3, "dwarf planet", -223), new Space(4, "kuiper belt", -223),
				new Space(5, "oort cloud", 4));

		List<String> nameList = elementList.stream().map(Space::getName)
				.peek((name) -> System.out.println("name : " + name)).collect(Collectors.toList());

		System.out.println(" New name list : " + nameList);

	}

}

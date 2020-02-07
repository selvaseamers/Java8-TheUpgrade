package ex.j8.stream.foreach;

import java.util.Arrays;
import java.util.List;

import ex.j8.stream.model.Space;

public class ForEachMain {

	public static void main(String[] args) {

		List<Space> elementList = Arrays.asList(new Space(1, "comet", 170), // temp in degree
				new Space(2, "Meteorite", 3000), new Space(3, "dwarf planet", -223), new Space(4, "kuiper belt", -223),
				new Space(5, "oort cloud", 4));

		System.out.println("List before operation: " + elementList);

		elementList.stream().forEach((element) -> element.setId(element.getId() * 2));

		System.out.println("List after stream foreach operation: " + elementList);

		elementList.forEach((element) -> element.setId(element.getId() * 2));

		System.out.println("List after collection foreach operation: " + elementList);
	}

}

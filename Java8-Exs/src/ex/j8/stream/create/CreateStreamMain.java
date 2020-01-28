package ex.j8.stream.create;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import ex.j8.stream.model.Space;

public class CreateStreamMain {

	public static void main(String[] args) {

		Space[] arrayOfSpaceObject = { new Space(1, "comet", 170), // temp in degree
				new Space(2, "Meteorite", 3000), new Space(3, "dwarf planet", -223), new Space(4, "kuiper belt", -223),
				new Space(5, "oort cloud", 4) };

		// Streaming on Arrays using Stream of
		List<Space> sorted = Stream.of(arrayOfSpaceObject)
				.sorted((obj1, obj2) -> (int) (obj1.getTemperature() - obj2.getTemperature()))
				.collect(Collectors.toList());
		System.out.println("Sorted List :" + sorted);

		// Streaming on List
		List<Space> sortedOnId = sorted.stream().sorted(Comparator.comparing(Space::getId))
				.collect(Collectors.toList());
		System.out.println("Sorted List by Id :" + sortedOnId);

		// Streaming on single object using stream of
		Space ob = arrayOfSpaceObject[0];
		System.out.println("Object modified :" + ob);
		ob = Stream.of(ob).peek((object) -> object.setTemperature(object.getTemperature() * 10l)).findFirst()
				.orElse(null);

		System.out.println("Object modified :" + ob);

	}

}

package ex.j8.stream.flatmap;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import ex.j8.stream.model.Space;

public class FlatMapMain {

	public static void main(String[] args) {

		List<Space> elementList = Arrays.asList(new Space(1, "comet", 170), // temp in degree
				new Space(2, "Meteorite", 3000), new Space(3, "dwarf planet", -223), new Space(4, "kuiper belt", -223),
				new Space(5, "oort cloud", 4));

		List<Space> errorListTemp = Arrays.asList(new Space(1, "comet", 70), // temp in degree
				new Space(2, "Meteorite", 30000), new Space(3, "dwarf planet", -2230),
				new Space(4, "kuiper belt", -223000), new Space(5, "oort cloud", 47));

		List<Space> errorListName = Arrays.asList(new Space(1, "comt", 170), // temp in degree
				new Space(2, "Meteore", 3000), new Space(3, "dw planet", -223), new Space(4, "kur belt", -223),
				new Space(5, "oort clo", 4));

		List<List<Space>> listOfList = Arrays.asList(elementList, errorListTemp, errorListName);

		List<Space> flattenedList = listOfList.stream().flatMap(Collection::stream).collect(Collectors.toList());

		System.out.println(" New flat list : " + flattenedList);

	}

}

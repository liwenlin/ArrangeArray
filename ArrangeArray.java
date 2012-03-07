import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ArrangeArray {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Please input the list as parameters");
			System.exit(-1);
		}
		// put array in a hashmap which insert
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		int temp;
		for (String s : args) {
			temp = Integer.parseInt(s);
			if (!map.containsKey(temp))
				map.put(temp, 1);
			else
				map.put(temp, map.get(temp) + 1);
		}
		// sort the map by value
		List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(
				map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> arg0,
					Entry<Integer, Integer> arg1) {
				return arg1.getValue() - arg0.getValue();
			}
		});
		// print the result
		for (Map.Entry<Integer, Integer> entry : list) {
			System.out.println(entry.getKey() );
		}
	}
}

package Exam06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {

	public static void main(String[] args) {
		Map<String,  Integer> map = new HashMap<String, Integer>();
		map.put("정문희", 24);
		map.put("김택선", 28);
		map.put("정슬기", 29);
		//key값이 중복되면 추가할 수 없음.
		//단, key값이 같다면 value값을 새롭게 갱신함.
		
		System.out.println("size()  :"+map.size());
		System.out.println("정문희의 나이: "+ map.get("정문희"));
		
		//Key와 Value를 전체적으로 정리하여 검색하는 방법
		//Key는 중복되지 않으므로 set의 형태로 추출가능함.
		
		Set<String> keyset = map.keySet(); //key값을 Set으로 설정.
		System.out.println("KeySet()  :"+keyset);
		
		Iterator<String> iter = keyset.iterator();
		while(iter.hasNext()) {
			String k = iter.next();
			Integer v = map.get(k);
			System.out.println(k +"-" +v);
			
		}
		
		//map삭제 기능.
		map.remove("정문희");
		System.out.println("map.size() :"+map.size()); //2
		map.put("정문희" , 24); //원상복귀
		
		//검색의 두번째 방법
		Set <Map.Entry<String, Integer>> mEntry = map.entrySet();
		System.out.println("Map.Entry :"+mEntry);
		
		Iterator<Map.Entry<String, Integer>> mEntryIter = mEntry.iterator();
		while(mEntryIter.hasNext()) {
			Map.Entry<String, Integer> nextEntry = mEntryIter.next();
			//nextEntry = [정문희=24]
			String k = nextEntry.getKey(); //map.entry상의 Key 추출
			Integer v = nextEntry.getValue(); 
			System.out.println(k + "-" +  v);
		}
		
		//map 전체 삭제
		map.clear();
		System.out.println(map);
		
	}

}

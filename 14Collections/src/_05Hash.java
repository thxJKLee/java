import java.util.*;

/**
 * _05Hash
 * map 구조를 이용하는 방식을 택함.
 * HashMap<K,V>
 * 
 * 
 * hashCode 생성은 패스한다.[값이 같을때 hashCode도 같기를 원할 경우 작성함]
 * 
 * 
 * HashSet은. set의 기능과 hash의 기능을 동시에.
 */
public class _05Hash {

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("a", 1);
        hashMap.put("b", 2);
        hashMap.put("c", 3);

        System.out.println(hashMap.get("a"));
        System.out.println(hashMap.containsKey("d"));
        System.out.println(hashMap.containsValue(3));
        System.out.println(hashMap.remove("a"));
        System.out.println(hashMap.replace("c", 1000));
        System.out.println(hashMap);
        hashMap.clear();

        //
        // HashSet
        HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(100);
        hashSet.add(200);
        hashSet.add(300);
        hashSet.add(400);
        hashSet.add(500);
        hashSet.add(300);
        System.out.println(hashSet);

        Iterator<Integer> it = hashSet.iterator();

        while (it.hasNext())
            System.out.print(it.next() + " ");
        System.out.println();
        //
        // Properties 는 키와 값이 모두 String이 해시맵
        // 순서 유지가 필요하다면
        // LinkedHashSet 서브클래스.

        // 멀티스레드에서도 괜찮은 HashTable
        // 검색속도의 극한인 TreeSet 이나 TreeMap
    }
}
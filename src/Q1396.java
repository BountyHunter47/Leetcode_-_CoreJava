import java.util.HashMap;
import java.util.Map;

public class Q1396 {
    static Map<String, Map<Integer, Integer>> checkInMap = new HashMap<>();
    static Map<String, Map<Integer, Integer>> checkOutMap = new HashMap<>();

    public static void main(String[] args) {
        checkIn(45, "Leyton", 3);
        checkIn(32, "Paradise", 8);
        checkIn(27, "Leyton", 10);
        checkOut(45, "Waterloo", 15);
        checkOut(27, "Waterloo", 20);
        checkOut(32, "Cambridge", 22);
        System.out.println(getAverageTime("Paradise", "Cambridge"));
        System.out.println(getAverageTime("Leyton", "Waterloo"));
        checkIn(10, "Leyton", 24);
        System.out.println(getAverageTime("Leyton", "Waterloo"));
        checkOut(10, "Waterloo", 38);
        System.out.println(getAverageTime("Leyton", "Waterloo"));
    }

    static void checkIn(int id, String stationName, int t) {
        Map<Integer, Integer> tmpcheckInMap = new HashMap<>();
        if (checkInMap.containsKey(stationName)) {
            Map<Integer, Integer> reservedcheckInMap = checkInMap.get(stationName);
            reservedcheckInMap.put(id, t);
            checkInMap.put(stationName, reservedcheckInMap);
        }
        else {
            tmpcheckInMap.put(id, t);
            checkInMap.put(stationName, tmpcheckInMap);
        }
    }

    static void checkOut(int id, String stationName, int t) {
        Map<Integer, Integer> reservedMap = new HashMap<>();
        if (checkOutMap.containsKey(stationName)) {
            Map<Integer, Integer> tmpMap = checkOutMap.get(stationName);
            tmpMap.put(id, t);
            checkOutMap.put(stationName, tmpMap);
        }
        else {
            reservedMap.put(id, t);
            checkOutMap.put(stationName, reservedMap);
        }

    }

    static double getAverageTime(String startStation, String endStation) {
        double ans = 0;
        int travellerCount = 0;
        for (int i : checkInMap.get(startStation).keySet()) {
            if (!checkOutMap.containsKey(endStation) || !checkOutMap.get(endStation).containsKey(i) || !checkInMap.containsKey(startStation) || !checkInMap.get(startStation).containsKey(i)) continue;
            int dispatch = checkInMap.get(startStation).get(i);
            int arrival = checkOutMap.get(endStation).get(i);
            ans += arrival - dispatch;
            travellerCount++;
        }
        return ans /travellerCount;
    }
}

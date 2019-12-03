import java.util.*;

public class ListMap {
    private LinkedHashMap<String, List<Groceries>> myList;
    private int errorCount;


    public ListMap() {
        errorCount = 0;
        myList = new LinkedHashMap<>();
    }

    public void add(String name, Groceries Groceries) {

        if (myList.containsKey(name)) {
            myList.get(name).add(Groceries);
        } else {
            List<Groceries> list = new ArrayList<>();
            list.add(Groceries);
            myList.put(name, list);
        }
    }

    public String printPretty() {
        String result = "";
        for (Map.Entry<String, List<Groceries>> e : myList.entrySet()) {
            result += "name: " + e.getKey().substring(0,1).toUpperCase()+ e.getKey().substring(1) + " \t\tseen: " + e.getValue().size() + "\ttimes\n";
            result += "===========\t\t\t=============\n";
            result += printPrices(e.getValue());
            result += "\n";
        }

        result += "Errors  \t\t\tseen: " + errorCount + "\ttimes\n";

        return result;
    }

    private String printPrices(List<Groceries> list) {
        Map<Double, Integer> map = new LinkedHashMap<>();
        for (Groceries l : list) {
            if(map.containsKey(l.getPrice())) {
                map.put(l.getPrice(), map.get(l.getPrice()) + 1);
            } else {
                map.put(l.getPrice(), 1);
            }
        }

        String result = "";
        for (Map.Entry<Double, Integer> e : map.entrySet()) {
            result += "price: " + e.getKey() + "\t\t\tseen: " + e.getValue() + "\ttimes\n";
            result += "-----------\t\t\t-------------\n";
        }

        return result;
    }

    public void countErrors() {
        errorCount++;
    }

    public Set<String> getKeys() {
        return myList.keySet();
    }
}

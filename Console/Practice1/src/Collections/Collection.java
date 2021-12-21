package Collections;

import java.util.ArrayList;

public class Collection {
    private int[] nums;
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addList(String input) {
        groceryList.add(input);
    }

    public void updateList(int position, String newInput) {
        groceryList.set(position, newInput);
    }

    public void removeItem(int position) {
        groceryList.remove(position);
    }

    public String findItem(String searchItem) {
        boolean foundItem = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        return groceryList.get(position);
    }
}

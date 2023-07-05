package com.devmountain.unit5;

public class RecursiveSearch {
    public static int recursiveSearch(String item, String[] items) {
        return recursiveSearchHelper(item, items, 0);
    }

    private static int recursiveSearchHelper(String item, String[] items, int index) {
        if (index >= items.length) {
            return -1;
        }

        if (items[index].equals(item)) {
            return index;
        }

        return recursiveSearchHelper(item, items, index + 1);
    }

    public static void main(String[] args) {
        String[] items = {"hey", "there", "you"};
        System.out.println(recursiveSearch("hey", items)); // Output: 0
        System.out.println(recursiveSearch("porcupine", items)); // Output: -1
    }
}


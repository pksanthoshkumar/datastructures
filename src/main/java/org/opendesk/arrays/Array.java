package org.opendesk.arrays;

public class Array {
    private int[] items;
    private int[] itemsCopy;
    private int count;

    public Array (int length) {
        items = new int [length];
    }

    public void print () {
        for (int i=0; i < count; i++){
            System.out.println(items[i]);
        }
    }

    public void insert (int item){
        // if array is full, resize the array
        if (items.length == count){
            System.out.println("Doubling the size of the array to " + items.length * 2);
            itemsCopy = new int [items.length * 2];

            for (int i=0; i < items.length; i++){
                itemsCopy [i] = items[i];
            }

            items = itemsCopy;
        }

        items [count] = item;
        count++;
        System.out.println(item + " inserted");
    }

    //0   1   2   3   4   5   6   7    8  9   10
    //10  11  12  13  14  14  15

    void removeAt (int pos ){
        if (pos <= count && pos > 0) {
            for (int i=pos; i <= count; i++){
                items[i] = items [i + 1];
            }

            count = count - 1;
        }else{
            throw new IllegalArgumentException();
        }
    }

    public static void main (String args[]){
        Array array = new Array(10);
        array.insert(10);
        array.insert(11);
        array.insert(12);
        array.insert(13);
        array.insert(14);
        array.insert(15);

        System.out.println("Printing the array *** ");
        array.print();
        array.removeAt(2);
        System.out.println("Printing the array *** ");
        array.print();
    }
}

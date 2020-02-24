/** Array based list.
 *  @author Josh Hug
 */
//         0 1 2 3 4 5 6
// items: [4,7,3,6,0,0,0,.....]

/**
 * Invariants:
 * addLast: the next item we want to add, will go into position size;
 * getLast: the item we want to return is in position size-1;
 * size: the number of items in the list should be size;
 */

public class AList {
    int[] items;
    int size;

    /** Creates an empty list. */
    public AList() {
        items=new int[100];
        size=0;
    }

    /** Inserts X into the back of the list. */
    public void addLast(int x) {
        items[size]=x;
        size=size+1;

    }

    /** Returns the item from the back of the list. */
    public int getLast() {
        return items[size-1];
    }
    /** Gets the ith item in the list (0 is the front). */
    public int get(int i) {
        return items[i];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

    /** Deletes item from back of the list and
      * returns deleted item. */
    public int removeLast() {
        int deletedItem=getLast();
        items[size-1]=0;
        size=size-1;
        return deletedItem;
    }
} 
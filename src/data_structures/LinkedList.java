package data_structures;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class LinkedList {
  private static class Node {
        final private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }
  private Node first;
  private Node last;
  private  int size;
  private boolean isEmpty() {
        return first == null;
    }
  public void delete() {
      first = last = null;
      size = 0;
    }
  public void addLast(int item) {
      var node = new Node(item);

      if(isEmpty())
          first = last = node;
      else {
          last.next = node;
          last = node;
      }

      size++;
  }
  public void addFirst (int item) {
      var node = new Node(item);
      if(isEmpty())
          first=last=node;
      else {
          node.next = first;
          first = node;
      }
      size++;

  }
  public int indexOf(int item) {
      int index = 0;
      var current = first;
      while (current!=null) {
          if(current.value == item)
              return  index;
          else {
          current = current.next;
          index++;
          }
      }
      return -1;
  }
  public boolean contains(int item) {
      return indexOf(item) != -1;
  }
  public void removeFirst() {
      if(isEmpty()) throw new NoSuchElementException();
      if(first == last){
          first = last =null;
      }
      else {
          var second = first.next;
          first.next = null;
          first = second;
      }
      size--;

  }
  public void removeLast() {
      if(isEmpty()) throw new NoSuchElementException();
      if(first == last) first = last =null;
      else {
          var temp = first;
          while (temp.next != last) {
              temp = temp.next;
          }
          temp.next = null;
          last = temp;
      }
      size--;
  }
  public int size() {
      return size;
  }
  public int[] toArray() {
      int[] array = new int[size];
      var current = first;
      var index = 0;
      while (current != null) {
          array[index++] = current.value;
          current = current.next;
      }
      return array;
  }

  public static void main(String[] args) {
      var list = new LinkedList();
      list.addLast(10); // index 2
      list.addLast(20); // index 3
      list.addLast(30); // index 4
      list.addFirst(50); // index 1
      list.addFirst(60); // index 0

      var array = list.toArray();
      System.out.println(Arrays.toString(array)); //array -- [50, 10, 20]

    }
}

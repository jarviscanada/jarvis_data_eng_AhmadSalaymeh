package ca.jrvs.practice.dataStructure;

import java.util.Arrays;

public class JArrayList<E> implements JList<E> {





  private static int size=0;
  private static final int DEFAULT_CAPACITY  = 10;
  private Object[] elements;



  public JArrayList(){
    elements = new Object[DEFAULT_CAPACITY];
  }
  public JArrayList(int size){
    elements = new Object[size];
  }
  /**
   * Appends the specified element to the end of this list (optional operation).
   *
   * @param e element to be appended to this list
   * @return <tt>true</tt> (as specified by {@linkCollection#add})
   * @throws NullPointerException if the specified element is null and this list does not permit
   *                              null elements
   */

  @Override
  public boolean add(E e) {
    if(size==elements.length){
      updateSize();
    }
    elements[size++]=e;
    return true;
  }

  /**
   * Returns an array containing all of the elements in this list in proper sequence (from first to
   * last element).
   *
   * <p>This method acts as bridge between array-based and collection-based
   * APIs.
   *
   * @return an array containing all of the elements in this list in proper sequence
   */
  @Override
  public Object[] toArray() {
    return Arrays.copyOf(elements,size);
  }

  /**
   * The size of the ArrayList (the number of elements it contains).
   */
  @Override
  public int size() {
    return size;
  }

  /**
   * Returns <tt>true</tt> if this list contains no elements.
   *
   * @return <tt>true</tt> if this list contains no elements
   */
  @Override
  public boolean isEmpty() {
    return size==0;
  }

  /**
   * Returns the index of the first occurrence of the specified element in this list, or -1 if this
   * list does not contain the element. More formally, returns the lowest index <tt>i</tt> such
   * that
   * <tt>(o==null&nbsp;?&nbsp;get(i)==null&nbsp;:&nbsp;o.equals(get(i)))</tt>,
   * or -1 if there is no such index.
   *
   * @param o
   */
  @Override
  public int indexOf(Object o) {
    if(o == null){
      for (int i=0; i < size; i++){
        if(elements[i] == null){
          return i;
        }
      }
    }else{
      for(int i=0; i< size; i++){
        if(o.equals(elements[i])){
          return i;
        }
      }
    }
    return -1;
  }

  /**
   * Returns <tt>true</tt> if this list contains the specified element. More formally, returns
   * <tt>true</tt> if and only if this list contains at least one element <tt>e</tt> such that
   * <tt>(o==null&nbsp;?&nbsp;e==null&nbsp;:&nbsp;o.equals(e))</tt>.
   *
   * @param o element whose presence in this list is to be tested
   * @return <tt>true</tt> if this list contains the specified element
   * @throws NullPointerException if the specified element is null and this list does not permit
   *                              null elements
   */
  @Override
  public boolean contains(Object o) {

    return indexOf(o)>=0;
  }

  /**
   * Returns the element at the specified position in this list.
   *
   * @param index index of the element to return
   * @return the element at the specified position in this list
   * @throws IndexOutOfBoundsException if the index is out of range (<tt>index &lt; 0 || index &gt;=
   *                                   size()</tt>)
   */
  @Override
  public E get(int index) {
    return (E) elements[index];
  }

  /**
   * Removes the element at the specified position in this list. Shifts any subsequent elements to
   * the left (subtracts one from their indices).
   *
   * @param index the index of the element to be removed
   * @return the element that was removed from the list
   * @throws IndexOutOfBoundsException {@inheritDoc}
   */
  @Override
  public E remove(int index) {

    E temp = (E) elements[index];

    elements[index]=null;
    int numMoved = size - index -1;
    if(numMoved>0){
      System.arraycopy(elements,index+1,elements,index,numMoved);
    }
    size--;

    return temp;
  }

  /**
   * Removes all of the elements from this list (optional operation). The list will be empty after
   * this call returns.
   */
  @Override
  public void clear() {
    for (int i = 0; i < size; i++)
      elements[i] = null;

    size = 0;

  }

  public void print(){
   for (int i=0; i < size; i++){
     System.out.println(elements[i]);
   }
  }


  /*
  Private helper functions
   */


  private void updateSize(){
    int newSize = elements.length * 2;
    elements = Arrays.copyOf(elements,newSize);
  }
}

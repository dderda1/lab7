package edu.luc.cs271.linkedstack;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class LinkedStack<E> implements IStack<E> {

  /** The topmost node of this stack. The stack gets pushed down from here. */
  private Node<E> top;

  private int size = 0;

  // TODO why don't we need an explicit constructor?

  @Override
  public E push(final E obj) {
    top = new Node<>(obj, top);
    size++;
    return obj;
    // done
  }

  @Override
  public E pop() {
    if (isEmpty() == true) {
      throw new NoSuchElementException();
    } else {
      E result = top.data;
      top = top.next;
      size--;
      return result;
    }
  } // done

  @Override
  public E peek() {
    if (isEmpty() == true) {
      throw new NoSuchElementException();
    } else {
      return top.data;
    }
  } // done

  @Override
  public boolean isEmpty() {
    if (top == null) {
      return true;
    } else {
      return false;
    }
  } // done

  @Override
  public List<E> asList() {
    final List<E> result = new ArrayList<>(size);
    populateList(top, result);
    return result;
  } // done

  @Override
  public List<E> asFifoList() {
    final List<E> result = new ArrayList<>(size);
    populateFifoList(top, result);
    return result;
  } // done

  private void populateList(final Node<E> curr, final List<E> result) {
    if (curr != null) {
      if (curr.next != null) {
        result.add(curr.data);
        populateList(curr.next, result);
      } else {
        result.add(curr.data);
      }
    } // done
  }

  private void populateFifoList(final Node<E> curr, final List<E> result) {
    if (curr != null) {
      if (curr.next != null) {
        result.add(0, curr.data);
        populateList(curr.next, result);
      } else {
        result.add(0, curr.data);
      }
    }
  }
} // done

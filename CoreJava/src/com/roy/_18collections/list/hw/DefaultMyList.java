package com.roy._18collections.list.hw;

public class DefaultMyList implements MyList {

	private transient Node<Object> first;
	private transient Node<Object> last;
	private transient int size;

	@Override
	public void add(Object e) {
		Node<Object> l = last;
		Node<Object> newNode = new Node<Object>(l, e, null);
		last = newNode;

		// if there are no previous nodes
		if (l == null) {
			first = newNode;
		} else {
			l.next = newNode;
		}

		size++;

	}

	@Override
	public void clear() {
		for (Node<Object> n = first; n != null;) {
			Node<Object> next = n.next;
			n.e = null;
			n.prev = null;
			n.next = null;
			n = next;
			size--;
		}
	}

	@Override
	public boolean remove(Object o) {
		if (o == null) {
			for (Node<Object> n = first; n != null; n = n.next) {
				if (n.e == null) {
					unlink(n);
					return true;
				}
			}
		} else {
			for (Node<Object> n = first; n != null; n = n.next) {
				if (o.equals(n.e)) {
					unlink(n);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public Object[] toArray() {
		Object[] arr = new Object[size];
		int i = 0;
		for (Node<Object> n = first; n != null; n = n.next) {
			arr[i] = n.e;
			i++;
		}
		return arr;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean contains(Object o) {
		if (o == null) {
			for (Node<Object> n = first; n != null; n = n.next) {
				if (n.e == null) {
					return true;
				}
			}
		}
		for (Node<Object> n = first; n != null; n = n.next) {
			if (o.equals(n.e)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean containsAll(MyList c) {
		boolean flag = false;
		Object[] arr = c.toArray();
		for (int i = 0; i < arr.length; i++) {
			if (contains(arr[i])) {
				flag = true;
			} else {
				flag = false;
				break;
			}
		}
		return flag;
	}

	private void unlink(Node<Object> o) {
		Node<Object> prev = o.prev;
		Node<Object> next = o.next;

		if (prev == null) {
			first = next;
		} else {
			prev.next = next;
			o.prev = null;
		}

		if (next == null) {
			last = prev;
		} else {
			next.prev = prev;
			o.next = null;
		}

		o.e = null;
		size--;
	}

	private static class Node<Object> {
		Node<Object> prev;
		Object e;
		Node<Object> next;

		Node(Node<Object> prev, Object e, Node<Object> next) {
			this.prev = prev;
			this.e = e;
			this.next = next;
		}

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("{");
		for (Node<Object> n = first; n != null; n = n.next) {
			sb.append("[").append(n.e).append("]");
		}
		sb.append("}");
		return sb.toString();
	}

}

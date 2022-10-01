package project5;

public class SortedLinkedList<T extends Comparable<? super T>> {

	protected ListNode head;
	long size;

	public SortedLinkedList() {
		size = 0;
		head = new ListNode(null, null, null);
	}// Sorted Linked List Constructor

	// Sorted = smallest to largest

	public void addItem(T data) {
		ListNode there = findNode(data, 1);
		there.addItem(new ListNode(null, data, null));
		size++;
	}// Add item

	public void deleteItem(T data) throws IllegalArgumentException {
		ListNode there = findNode(data, 0);
		there.deleteItem(there);
		size--;
	}// delete Item

	public ListNode findNode(T data, int i) throws IllegalArgumentException {
		ListNode key = head;

		if (i == 0) {
			if (size == 0) {
				throw new IllegalArgumentException("There are no items in the list");
			}
			key = key.nxt;
			while (key != null) {

				if (key.rdata.compareTo(data) == 0) {
					return key;
				} else {
					if (key.nxt == null) {
						throw new IllegalArgumentException(
								"The data doesn't exist in the list, so it can't be deleted");
					}
					key = key.nxt;
					
				}
			}
			
		} else if (i == 1) {
			if (size == 0) {
				return key;
			}
			key = key.nxt;
			while (key != null) {

				if (key.rdata.compareTo(data) == 0 || key.rdata.compareTo(data) > 0) {
					return key.prev;
				} else {
					if (key.nxt == null) {
						return key;
					}
					key = key.nxt;
				}
			}

		}
		return key;
	}// find Node method

	@Override
	public String toString() {
		String output = "Size: " + size + "\n";
		ListNode node = head;
		int i = 0;
		node = node.nxt;

		if (size == 0) {
			return output;
		} else {
			while (i < size) {
				output = output + i + ":\t" + node.rdata + "\n";
				node = node.nxt;
				i++;
			}
		}

		return output;
	}// ToString method

	private class ListNode {
		T rdata;
		ListNode nxt;
		ListNode prev;

		public void addItem(ListNode newNode) {

			newNode.nxt = this.nxt;
			this.nxt = newNode;
			newNode.prev = this;
			if (newNode.nxt != null) {
				newNode.nxt.prev = newNode;
			}

		}// Add Item

		public void deleteItem(ListNode newNode) {
			this.prev.nxt = this.nxt;
			if (this.nxt != null) {
				this.nxt.prev = this.prev;
			}
		}// Delete Item

		ListNode(ListNode Prev, T data, ListNode Next) {
			nxt = Next;
			rdata = data;
			prev = Prev;
		}// ListNode Constructor
	}// ListNode Class
}// Sorted Linked Lists Class

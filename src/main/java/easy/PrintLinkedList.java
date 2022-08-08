package easy;

public class PrintLinkedList {

	public static class SinglyLinkedListNode {
		public SinglyLinkedListNode(int data, SinglyLinkedListNode next) {
			super();
			this.data = data;
			this.next = next;
		}
		int data;
		SinglyLinkedListNode next;
	}

	public static SinglyLinkedListNode node2 = new SinglyLinkedListNode(16, null);
	public static SinglyLinkedListNode node1 = new SinglyLinkedListNode(13, node2);

	public static void main(String[] args) {
		printLinkedList(node1);
	}

	static void printLinkedList(SinglyLinkedListNode head) {
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}

}

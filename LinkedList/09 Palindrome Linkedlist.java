/**********************************************************************************************************

Palindrome Linked List
Send Feedback
You have been given a head to a singly linked list of integers. Write a function check to whether the list given is a 'Palindrome' or not.
 Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First and the only line of each test case or query contains the the elements of the singly linked list separated by a single space.
 Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element.
 Output format :
For each test case, the only line of output that print 'true' if the list is Palindrome or 'false' otherwise.
 Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
Time Limit: 1sec

Where 'M' is the size of the singly linked list.
Sample Input 1 :
1
9 2 3 3 2 9 -1
Sample Output 1 :
true

***********************************************************************************************************/

/*

	Following is the Node class already written for the Linked List

	class Node<T> {
    	T data;
    	Node<T> next;
    
    	public Node(T data) {
        	this.data = data;
    	}
	}

*/

public class Solution {


	private static Node<Integer> reverse(Node<Integer>head){

		Node<Integer> curr = head;
		Node<Integer> prev = null;
		Node<Integer> next = null;

		while(curr != null){
			next = curr.next;
			curr.next = prev;

			prev = curr;
			curr = next;

		}
		return prev;
	}

	private static void printList(Node<Integer>head){
		while(head != null){
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
	private static Node<Integer> findMid(Node<Integer>head){
		Node<Integer> fast = head;
		Node<Integer> slow = head;
		while(fast.next != null && fast.next.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	public static boolean isPalindrome(Node<Integer> head) {
		//Your code goes here

		if(head == null || head.next == null)
			return true;
		Node<Integer> sec = reverse(findMid(head));
		
		// printList(head);
		// System.out.println();
		// printList(sec);

		while(head != null && sec != null){
			if(!head.data.equals(sec.data))
				return false;
			head = head.next;
			sec = sec.next;
		}
		return true;
		
	}

}

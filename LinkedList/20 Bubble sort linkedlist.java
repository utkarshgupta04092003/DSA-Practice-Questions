/*****************************************************************************************************

Bubble Sort (Iterative) Linked List
Send Feedback
Given a singly linked list of integers, sort it using 'Bubble Sort.'
Note :
No need to print the list, it has already been taken care. Only return the new head to the list.
Input format :
The first and the only line of each test case or query contains the elements of the singly linked list separated by a single space.
Remember/Consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
Output format :
For each test case/query, print the elements of the sorted singly linked list.

Output for every test case will be printed in a seperate line.
Constraints :
0 <= M <= 10^3
Where M is the size of the singly linked list.

Time Limit: 1sec
Sample Input 1 :
10 9 8 7 6 5 4 3 -1
Sample Output 1 :
 3 4 5 6 7 8 9 10 
 Sample Input 2 :
10 -5 9 90 5 67 1 89 -1
Sample Output 2 :
-5 1 5 9 10 67 89 90 


******************************************************************************************************/

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

	private static int length(Node<Integer> head){
		int len = 0;
		while(head != null){
			len++;
			head = head.next;
		}
		return len;
	}
	public static Node<Integer> bubbleSort(Node<Integer> head) {
		//Your code goes here

		if(head == null || head.next == null)
			return head;
		int n = length(head);

		for(int i=0;i<n-1;i++){
			Node<Integer> prev = null;
			Node<Integer> curr = head;

			for(int j=0;j<n-1;j++){

				if(curr.data <= curr.next.data){
					prev = curr;
					curr = curr.next;
				}
				else{

					Node<Integer> next = curr.next;
					if(prev == null){
                        head = head.next;
                	    curr.next = next.next;
                        next.next = curr;
                        prev = next;
                   	}
                	else{
                        prev.next = next;
                	    curr.next = next.next;
                        next.next = curr;
                        prev = next;
                    }

				}

			}
		}
		return head;

	}
}


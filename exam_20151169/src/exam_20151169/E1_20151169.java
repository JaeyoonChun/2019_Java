package exam_20151169;

import java.util.*;

public class E1_20151169 {
	public static void main(String[] args) {
		String[] color = {"red", "green", "blue", "white", "black", "yellow", "pink", "grey"};
		
		Queue<String> colq = new LinkedList<String>();
		for (int i = 0; i < color.length; i++) {
			colq.offer(color[i]);
		}
		
		Stack<String> cols = new Stack<String>();
		for (int i = 0; i < color.length; i++) {
			cols.push(colq.poll());
		} 
		
		while(!cols.empty()) {
			System.out.println(cols.pop());
		}
		// 1. color의 데이터를 순서대로 하나씩 큐에 넣는다. 
		// 2. 큐에서 데이터를 하나씩 빼내어 스택에 넣는다. 
		// 3. 스택에서 하나씩 꺼내면서 출력한다.
	}

}

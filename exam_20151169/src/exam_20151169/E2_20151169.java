package exam_20151169;

import java.util.*;

class Time implements Comparable<Time> {
	private int start;
	private int end;

	Time(int start, int end) {
		this.start = start;
		this.end = end;
	}

	public int compareTo(Time t) {
		return this.start - t.start;
	}

	int getStart() {
		return this.start;
	}

	int getEnd() {
		return this.end;
	}

}

public class E2_20151169 {
	//static int N = 5;
	static int N = 8;
	//static int N = 7;
	public static void main(String[] args) {
		//int L[][] = { { 1, 3 }, { 2, 5 }, { 8, 10 }, { 4, 7 }, { 6, 9 } };
		//int L[][] = {{12,15}, {10,12}, {16,18}, {11,15}, {9,18}, {17,18}, {15,17}}; 
		int L[][] = {{12,16}, {10,12}, {11,15}, {12,14}, {14,15}, {17,18}, {16,17}, {17,18}}; 
		ArrayList<Time> times = new ArrayList<Time>();
		ArrayList<Time> timesnew = new ArrayList<Time>();
		ArrayList<Time> avail = new ArrayList<Time>();
		Stack<Time> ts = new Stack<Time>();
		
		// 필요한 변수 선언 및 초기화
		System.out.println("< 강의 시간표 >");
		int i;
	
		for (i = 0; i < N; i++) {
			System.out.println(L[i][0] + " " + L[i][1]);
		}
		// 코드 완성
		
		for (int j = 0; j < N; j++) {
			times.add(new Time(L[j][0], L[j][1]));
		}
		times.sort(null);
		ts.push(times.get(0));
		
		for (int j = 1; j < times.size(); j++) {
			Time e = ts.peek();
			if(e.getStart() == times.get(j).getStart()) {
				if(e.getEnd() >= times.get(j).getEnd()) {
					ts.pop();
					ts.push(times.get(j));
					ts.push(e);
				}else {
					ts.pop();
					ts.push(e);
					ts.push(times.get(j));
				}
			}else {
				ts.pop();
				ts.push(e);
				ts.push(times.get(j));
			}
		}
			

		while(!ts.empty()) {
				timesnew.add(ts.pop());
		}
		
		
		avail.add(timesnew.get(N-1));		
		int idx = 0;
		for (int j = timesnew.size() -1; j >= 0; j--) {
			if (avail.get(idx).getEnd() <= timesnew.get(j).getStart()) {
				avail.add(timesnew.get(j));
				idx ++;
			}
		}

		System.out.println();
		System.out.println("참석할 수 있는 최대 강의 수 : "+avail.size());
		for (Time t : avail) {
			System.out.println(t.getStart() + " " + t.getEnd());
		}
	}

}

package com.demo.undirectedgraph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UndirectedGraph {

	LinkedList<Integer>[] adjList;
	int vertices = 0;
	
	public UndirectedGraph(int nodes) {
		this.adjList = new LinkedList[nodes];
		for(int i = 0; i<nodes;i++) {
			adjList[i] = new LinkedList<Integer>();
		}
	}
	
	public void addEdge(int u, int v) {
		adjList[u].add(v);
		adjList[v].add(u);
	}
	
	public void bfs(int s) {
		
		boolean[] visited = new boolean[vertices];
		Queue<Integer> q = new LinkedList<Integer>();
		visited[s] = true;
		q.offer(s);
		while(!q.isEmpty()) {
			int u = q.poll();
			System.out.println(u+" ");
			for(int v : adjList[u]) {
				if(!visited[v]) {
					visited[v] = true;
					q.offer(v);
				}
			}
		}
	}
	
	public void dfs(int s) {
		boolean[] visited = new boolean[vertices];
		Stack<Integer> stack =  new Stack<Integer>();
		stack.push(s);
		while(!stack.isEmpty()) {
			int u = stack.pop();
			if(!visited[u]) {
				visited[u] = true;
				System.out.println(u + " ");
				for(int v : adjList[u]) {
					if(!visited[v]) {
						stack.push(v);
					}
				}
			}
		}
	}
}



















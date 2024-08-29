package com.demo.undirectedgraph;

public class UndirectedGraph {

	int[][] adjMatrix;
	
	public UndirectedGraph(int nodes) {
		this.adjMatrix = new int[nodes][nodes];
	}
	
	public void addEdge(int u, int v) {
		this.adjMatrix[u][v] = 1;
		this.adjMatrix[v][u] = 1;
	}
	
	
}

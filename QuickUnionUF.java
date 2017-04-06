package com._520it.eclipse_01;

public class QuickUnionUF {
	private int[] id;
	public QuickUnionUF(int N){
		for(int i = 0; i < N; i++){
			id[1] = i;
		}
	}

	private int root(int i){
		while(i != id[i]){
			i = id[i];
		}
		return i;
	}
	public boolean connected(int p, int q){
		return root(p) == root(q);
		
	}
	public void union(int p, int q){
		int i = root(p);
		int j = root(q);
		id[i] = j;
	}
	
}

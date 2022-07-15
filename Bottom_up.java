package Main;

import java.io.*;
import java.util.*;


public class Main {
	static int dp[];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		dp = new int[n+1];
		System.out.println(fibo(n));
	}
	
	static int fibo(int x) {
		dp[1] = 1;
		dp[2] = 1;
		
		for(int i=3; i<=x; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		return dp[x];
	}
}

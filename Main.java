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
		if(x == 1 || x == 2) {
			return 1;
		}
		
		if(dp[x] != 0) {
			return dp[x];
		}
		
		dp[x] = fibo(x-1) + fibo(x-2);
		return dp[x];
	}

}

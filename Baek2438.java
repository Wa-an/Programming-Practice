package codingtest.prepare1_io;

import java.io.*;

public class Baek2438 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		for(int i = 0; i<num;i++) {
			for(int j = 0; j<=i;j++)
		{
			System.out.printf("*");
			
		}System.out.printf("\n");
	}
	}
}

package codingtest.prepare1_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek2439 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		for(int i = 0; i<num;i++) {
			for(int k = 1; k<=i;k++){
			System.out.printf(" ");
			}
			for(int j = num-i;j>0; j-- ) {
				System.out.printf("*");
			}System.out.printf("\n");
	}
	}
}


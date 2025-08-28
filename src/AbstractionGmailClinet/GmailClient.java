package AbstractionGmailClinet;

import java.util.Scanner;

import AbstractionGmail.Gmail;

public class GmailClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);

		Gmail a=new Gmail();
		
		a.setUsername(s.next());
		a.setPassword(s.next());
		
		System.out.println(a.getUsername());
		System.out.println(a.getPassword());
	}

}

package com.bootcamp.java.patriciomartinez;

import java.io.BufferedReader;
import java.util.*;

import com.bootcamp.java.patriciomartinez.model.Post;
import com.bootcamp.java.patriciomartinez.model.Usuario;

public class Main {
	public static final String NOMBRE_USUARIO = "patoomartinez";
	static Scanner sc = new Scanner(System.in);
	static Usuario pa = new Usuario();
	static List<Post> posts = new ArrayList<Post>();
	static List<String> tags = new ArrayList();

	public static void main(String[] args) {

		System.out.println("Welcome to Blogging app");

		System.out.println("write down your tag name");
		pa.setTag(sc.nextLine());
		System.out.println("WELCOME " + pa.getTag());
		int resp = 0;
		do {
			System.out.println("SELECT OPTION");
			System.out.println("1.Add new Entry");
			System.out.println("2.Delete existing entry");
			System.out.println("3.View Last 3 Posts");
			System.out.println("4.Exit");
			resp = sc.nextInt();
			switch (resp) {
			case 1:
				// add entry
				addEntry();
				break;
			case 2:
				// delete existing entry
				deletePost();
				break;

			case 3:
				// view posts
				showPosts();
				break;
			default:
				System.out.println("BYE!");
				break;

			}
		} while (resp != 4);

	}

	public static void addEntry() {
		Date ahora = new Date();
		Post p = new Post();

		System.out.println("enter Title of the post");
		String title = sc.next();
		p.setTitle(title);

		p.setDate(ahora);
		System.out.println("DATE:" + ahora);
		System.out.println("Enter text...");

		String saltoDeLinea = sc.nextLine();
		String text = sc.nextLine();
		p.setText(text);
		//
		System.out.println("do yo want to add some tags?");
		System.out.println("1.yes");
		System.out.println("2.no");
		int resp = sc.nextInt();
		if (resp == 1) {
			System.out.println("ENTER TAGS PLEASE");
			int rep = 0;
			do {
				String saltoDel = sc.nextLine();
				String tag = sc.nextLine();
				p.addTags(saltoDel);
				p.addTags(tag);

				System.out.println("do you want to add more tags?");
				System.out.println("1.yes");
				System.out.println("2.no");
				rep = sc.nextInt();

			} while (rep == 1);
			System.out.println("the post has been successfully uploaded ");

		} else {
			System.out.println("the post has been successfully uploaded ");
		}
		posts.add(p);

	}

	public static void deletePost() {
		System.out.println("write down title post in order to delete");
		String slt = sc.next();
		String title = sc.nextLine();
		for (int i = 0; i < posts.size(); i++) {
			Post post = posts.get(i);

			if (post.getTitle().equals(title) || post.getTitle().equals(slt)) {
				posts.remove(post);
				System.out.println("POST REMOVED");
			} else {
				System.out.println("POST NOT AVILABLE");
			}
			
		}
		showPosts();
	}

	public static void showPosts() {

		for (int i = 0; i < posts.size(); i++) {
			Post post = posts.get(i);

			System.out.println("POST: [" + post + "]");
		}

	}

}


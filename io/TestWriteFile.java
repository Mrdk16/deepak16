package com.rays.io;

import java.io.File;

import java.io.IOException;


public class TestWriteFile {
	
	 public static void main(String[] args) {
		    try {
		      File f = new File("C:\\Users\\Shivam PC\\Desktop\\io\\Shayar.txt");
		      if (f.createNewFile()) {
		        System.out.println("File created: " + f.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		    
		    
		  }
		}
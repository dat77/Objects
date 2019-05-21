package com.gmail.students;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.text.TabExpander;

public class GroupDB {
	
	public static Group selectFrom(String tableName, String orderBy) {
		Group group = new Group(tableName);
		File dbFile = new File("DB\\" +tableName);
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(dbFile))){
			group = (Group) ois.readObject();
			group.getInfo(orderBy);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return group;
	}
	
	public static void update(Group group) {
		File dbFile = new File("DB\\" + group.getName());
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dbFile))){
			oos.writeObject(group);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

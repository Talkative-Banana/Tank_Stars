package com.mygdx.game;

import java.io.*;

public class Load_Save {
    public static void save(String file_name, Player player){
        try{
            //Creating stream and writing the object
//            FileOutputStream SavingPlayerState = new FileOutputStream(file_name);
//            System.out.println(player.getName());
            ObjectOutputStream out1 = new ObjectOutputStream(new FileOutputStream(file_name));
            out1.writeObject(player);
            System.out.println("Successfull");
//            out1.flush();
            //closing the stream
            out1.close();
//            SavingPlayerState.close();
        }
        catch(IOException exception){
            System.out.println("IOException is caught");
        }
    }
    public static Player load(String file_name){
        try {
            // Reading the object from a file
            FileInputStream file1 = new FileInputStream(file_name);
            ObjectInputStream in1 = new ObjectInputStream(file1);
            Player p = (Player) in1.readObject();
            in1.close();
            file1.close();
            return p;
        }
        catch (IOException ex) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}

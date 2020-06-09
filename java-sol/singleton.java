package com.company;

public class Main {
    private static Main obj;

    private Main(){}

    public Main getInstance()
    {
        if (obj == null)
        {
            synchronized (Main.class)
            {
                if(obj == null)
                {
                    System.out.println("In getInstance!");
                    obj = new Main();
                }
            }
        }

        return obj;
    }
    public static void main(String[] args)
    {
        Main singleton = new Main();
        singleton.getInstance();
        singleton.getInstance();
    }
}





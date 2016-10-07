package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());
        for (int i = 0; i < N; i++)
        {
            list.add(reader.readLine());
        }
        for (int i = 0; i < M; i++)
        {
            list.add(list.size(), list.get(0));
            list.remove(0);
        }
        for (String v : list)
        {
            System.out.println(v);
        }
    }
}

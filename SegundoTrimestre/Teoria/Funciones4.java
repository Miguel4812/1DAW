package SegundoTrimestre.Teoria;

import java.util.regex.MatchResult;

@SuppressWarnings("SpellCheckingInspection")
public class Funciones4 {
    public static void main(String[] args)
    {
        int n;
        n=tirardado();
        System.out.println(n);
    }

    public static int tirardado()
    {
        return (int) (Math.random() * 6)+1;
    }
}
package StackWithResponsive.src;

import java.util.Random;

public class App
{
    public static void main(String[] args)
    {
        StackClass stack = new StackClass(7);
        Random rnd = new Random();

        for (int i = 0; i < stack.getSize(); i++)
        {
            stack.smash(rnd.nextInt(1, 1000));
        }

        for (int i = 0; i < stack.getSize(); i++)
        {
         sdasd   System.out.println(stack.pop());
        }
    }}






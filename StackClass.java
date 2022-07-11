package StackWithResponsive.src;

public class StackClass
{
    private int[] array;
    private int head;
    private int size;

    public StackClass(int size)
    {
        this.size = size;
        this.array = new int[this.size];
        this.head = -1;
    }

    public int pop()
    {
        if (isEmpty())
        {
            return -1;
        }
        int value = array[this.head];
        this.head--;
        return value;
    }

    public int peek()
    {
        if (isEmpty())
        {
            return -1;
        }
        int value = array[this.head];
        return value;
    }

    public void push(int value)
    {
        if (isFull())
        {
            return;
        }
        this.head++;
        this.array[head] = value;
    }

    public void smash(int value)//Ezme, Sıralı ekleme
    {
        if (this.isEmpty())
        {
            this.push(value);
            return;
        }

        if (value <= this.peek())
        {
            this.push(value);
        }
        else
        {
            int old = this.pop();
            this.smash(value);
            this.push(old);
        }
    }

    public boolean isEmpty()
    {
        if (this.head == -1)
        {
            return true;
        }
        return false;
    }

    public boolean isFull()
    {
        if (this.head == size - 1)
        {
            return true;
        }
        return false;
    }

    public int getSize() {
        return size;
    }
}
/*
public int peek()
    {
        if (isEmpty())
        {
            return -1;
        }
        return array[this.head];
    }
*/
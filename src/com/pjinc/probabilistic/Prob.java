package com.pjinc.probabilistic;

import java.util.Random;

public class Prob
{
    private Random random;

    public Prob()
    {
        random = new Random();
    }

    public Prob(Random r)
    {
        random = r;
    }

    public <Type> Type pick(Type[] items)
    {
        return items[random.nextInt(items.length)];
    }

    public <Type> Type pick(Type[] items, Double[] dist)
    {
        if (items.length != dist.length || items.length == 0 ||
                dist.length == 0)
            throw new ArrayIndexOutOfBoundsException();

        int index = choose(dist);

        return items[index];
    }

    public int choose(Double[] dist)
    {
        double sum = 0;
        for (int i = 0; i < dist.length; i++)
        {
            if (dist[i] < 0)
                throw new ArithmeticException();
            sum += dist[i];
        }

        double r = random.nextDouble();
        double prob = dist[0] / sum;
        int index = 0;

        while (prob < r)
        {
            index++;
            prob += dist[index] / sum;
        }
        return index;
    }

}

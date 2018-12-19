package com.example.counter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

class Counter
{
    private int count = 0;
    private int increment = 1;
    final private int defaultCount = 0;
    final private int defaultIncrement = 1;

    public Counter()
    {
        count = defaultCount;
        increment = defaultIncrement;
    }

    public Counter(int count, int increment)
    {
        this.count = count;
        this.increment = increment;
    }

    public void resetCount()
    {
        count = defaultCount;
    }

    public void resetIncrement()
    {
        increment = defaultIncrement;
    }

    public void incrementCount()
    {
        count += increment;
    }

    public void setCount(int count)
    {
        this.count = count;
    }

    public void setIncrement(int increment)
    {
        this.increment = increment;
    }

    public int getCount()
    {
        return count;
    }

    public int getIncrement()
    {
        return increment;
    }
}

public class MainActivity extends AppCompatActivity {

    private static Counter counter = new Counter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void updateChanges(View view)
    {
        TextView countDisplay = findViewById(R.id.count);

        countDisplay.setText(Integer.toString(counter.getCount()));
    }

    public void count(View view)
    {
        counter.incrementCount();
        updateChanges(view);
    }

    public void reset(View view)
    {
        counter.resetCount();
        counter.resetIncrement();
        updateChanges(view);
    }
}

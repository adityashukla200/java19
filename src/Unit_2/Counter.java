package Unit_2;

class Counter {
    private int count = 0;

    public synchronized void increment(){     //ek time pe 1 hi method ko call kar paega
        count++;
    }

    public int getCount(){
        return count;
    }
}

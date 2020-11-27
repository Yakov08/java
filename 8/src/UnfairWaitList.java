package ru.mirea.ikbo2019.Samsonov.pr7.UnfairWaitList;

import ru.mirea.ikbo2019.Samsonov.pr7.WaitList.WaitList;

public class UnfairWaitList<E> extends WaitList<E> {

    public UnfairWaitList() {
    }

    public void remove(E element) {
        content.remove(element);
    }

    public void moveToBack(E element) {
        content.add(content.remove());
    }
}
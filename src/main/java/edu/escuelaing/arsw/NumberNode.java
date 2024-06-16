package edu.escuelaing.arsw;

public class NumberNode {
    private Double value;
    private NumberNode next;

    public NumberNode(Double value){
        this.value = value;
    }

    public Double getValue(){
        return value;
    }

    public NumberNode getNext(){
        return next;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public void setNext(NumberNode next) {
        this.next = next;
    }

    public void clean(){
        this.next = null;
    }
}

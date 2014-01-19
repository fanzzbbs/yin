package org.yinwang.yin.ast;

public class If extends Node {
    public Node test;
    public Node then;
    public Node orelse;


    public If(Node test, Node then, Node orelse, String file, int start, int end, int line, int col) {
        super(file, start, end, line, col);
        this.test = test;
        this.then = then;
        this.orelse = orelse;
    }


    public String toString() {
        return "(if " + test + " " + then + " " + orelse + ")";
    }

}
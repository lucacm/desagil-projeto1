/*
 * NÃO É PERMITIDO MODIFICAR NADA NESTE ARQUIVO,
 * EXCETO PELO CONSTRUTOR E OS MÉTODOS INDICADOS.
 */

package br.pro.hashi.ensino.desagil.projeto1;

import java.util.HashMap;
import java.util.LinkedList;

public class Translator {
    private Node root;
    private HashMap<Character, Node> map;


    // Você deve mudar o recheio do construtor,
    // de acordo com os requisitos do projeto.
    public Translator() {

        root = new Node(' ');

        // First Level
        Node e = new Node('e');
        root.setLeft(e);

        Node t = new Node('t');
        root.setRight(t);

        // 2nd Level
        Node i = new Node('i');
        e.setLeft(i);

        Node a = new Node('a');
        e.setRight(a);

        Node n = new Node('n');
        t.setLeft(n);

        Node m = new Node('m');
        t.setRight(m);

        // 3rd Level
        Node s = new Node('s');
        i.setLeft(s);

        Node u = new Node('u');
        i.setRight(u);

        Node r = new Node('r');
        a.setLeft(r);

        Node w = new Node('w');
        a.setRight(w);

        Node d = new Node('d');
        n.setLeft(d);

        Node k = new Node('k');
        n.setRight(k);
        Node g = new Node('g');
        m.setLeft(g);

        Node o = new Node('o');
        m.setRight(o);

        // 4th Level

        Node h = new Node('h');
        s.setLeft(h);

        Node v = new Node('v');
        s.setRight(v);

        Node f = new Node('f');
        u.setLeft(f);

        Node b1 = new Node(' ');
        u.setRight(b1);

        Node l = new Node('l');
        r.setLeft(l);

        Node b2 = new Node(' ');
        r.setRight(b2);

        Node p = new Node('p');
        w.setLeft(p);

        Node j = new Node('j');
        w.setRight(j);

        Node b = new Node('b');
        d.setLeft(b);

        Node x = new Node('x');
        d.setRight(x);

        Node c = new Node('c');
        k.setLeft(c);

        Node y = new Node('y');
        k.setRight(y);

        Node z = new Node('z');
        g.setLeft(z);

        Node q = new Node('q');
        g.setRight(q);

        Node b3 = new Node(' ');
        o.setLeft(b3);

        Node b4 = new Node(' ');
        o.setRight(b4);


        // 5th Level

        Node n5 = new Node('5');
        h.setLeft(n5);

        Node n4 = new Node('4');
        h.setRight(n4);

        Node b5 = new Node(' ');
        v.setLeft(b5);

        Node n3 = new Node('3');
        v.setRight(n3);

        Node b6 = new Node(' ');
        f.setLeft(b6);

        Node b7 = new Node(' ');
        f.setRight(b7);

        Node b8 = new Node(' ');
        b1.setLeft(b8);

        Node n2 = new Node('2');
        b1.setRight(n2);

        Node b9 = new Node(' ');
        l.setLeft(b9);

        Node b10 = new Node(' ');
        l.setRight(b10);

        Node plus = new Node('+');
        b2.setLeft(plus);

        Node b11 = new Node(' ');
        b2.setRight(b11);

        Node b12 = new Node(' ');
        p.setLeft(b12);

        Node b13 = new Node(' ');
        p.setRight(b13);

        Node b14 = new Node(' ');
        j.setLeft(b14);

        Node n1 = new Node('1');
        j.setRight(n1);

        Node n6 = new Node('6');
        b.setLeft(n6);

        Node equal = new Node('=');
        b.setRight(equal);

        Node fs = new Node('/');
        x.setLeft(fs);

        Node b15 = new Node(' ');
        x.setRight(b15);

        Node b16 = new Node(' ');
        c.setLeft(b16);

        Node b17 = new Node(' ');
        c.setRight(b17);

        Node b18 = new Node(' ');
        y.setLeft(b18);

        Node b19 = new Node(' ');
        y.setRight(b19);

        Node n7 = new Node('7');
        z.setLeft(n7);

        Node b20 = new Node(' ');
        z.setRight(b20);

        Node b21 = new Node(' ');
        q.setLeft(b21);

        Node b22 = new Node(' ');
        q.setRight(b22);

        Node n8 = new Node('8');
        b3.setLeft(n8);

        Node b23 = new Node(' ');
        b3.setRight(b23);

        Node n9 = new Node('9');
        b4.setLeft(n9);

        Node n0 = new Node('0');
        b4.setRight(n0);


    }

    // Você deve mudar o recheio deste método,
    // de acordo com os requisitos do projeto.
    public char morseToChar(String code) {

        Node nod = root;

        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '.'){
                nod = nod.getLeft();
            }
            else {
                nod = nod.getRight();
            }
        }


        return nod.getValue();
    }


    // Você deve mudar o recheio deste método,
    // de acordo com os requisitos do projeto.
    private String charToMorse(Node node) {
        return " ";
    }


    // Este método deve permanecer como está.
    public String charToMorse(char c) {
        return charToMorse(map.get(c));
    }


    // Você deve mudar o recheio deste método,
    // de acordo com os requisitos do projeto.
    public LinkedList<String> getCodes() {
        return new LinkedList<>();
    }
}

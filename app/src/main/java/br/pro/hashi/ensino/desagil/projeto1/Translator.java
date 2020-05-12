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
        e.setParent(root);

        Node t = new Node('t');
        root.setRight(t);
        t.setParent(root);


        // 2nd Level
        Node i = new Node('i');
        e.setLeft(i);
        i.setParent(e);

        Node a = new Node('a');
        e.setRight(a);
        a.setParent(e);

        Node n = new Node('n');
        t.setLeft(n);
        n.setParent(t);

        Node m = new Node('m');
        t.setRight(m);
        m.setParent(t);

        // 3rd Level
        Node s = new Node('s');
        i.setLeft(s);
        s.setParent(i);

        Node u = new Node('u');
        i.setRight(u);
        u.setParent(i);

        Node r = new Node('r');
        a.setLeft(r);
        r.setParent(a);

        Node w = new Node('w');
        a.setRight(w);
        w.setParent(a);

        Node d = new Node('d');
        n.setLeft(d);
        d.setParent(n);

        Node k = new Node('k');
        n.setRight(k);
        k.setParent(n);

        Node g = new Node('g');
        m.setLeft(g);
        g.setParent(m);

        Node o = new Node('o');
        m.setRight(o);
        o.setParent(m);

        // 4th Level

        Node h = new Node('h');
        s.setLeft(h);
        h.setParent(s);

        Node v = new Node('v');
        s.setRight(v);
        v.setParent(s);

        Node f = new Node('f');
        u.setLeft(f);
        f.setParent(u);

        Node b1 = new Node(' ');
        u.setRight(b1);
        b1.setParent(u);

        Node l = new Node('l');
        r.setLeft(l);
        l.setParent(r);

        Node b2 = new Node(' ');
        r.setRight(b2);
        b2.setParent(r);

        Node p = new Node('p');
        w.setLeft(p);
        p.setParent(w);

        Node j = new Node('j');
        w.setRight(j);
        j.setParent(w);

        Node b = new Node('b');
        d.setLeft(b);
        b.setParent(d);

        Node x = new Node('x');
        d.setRight(x);
        x.setParent(d);

        Node c = new Node('c');
        k.setLeft(c);
        c.setParent(k);

        Node y = new Node('y');
        k.setRight(y);
        y.setParent(k);

        Node z = new Node('z');
        g.setLeft(z);
        z.setParent(g);

        Node q = new Node('q');
        g.setRight(q);
        q.setParent(g);

        Node b3 = new Node(' ');
        o.setLeft(b3);
        b3.setParent(o);

        Node b4 = new Node(' ');
        o.setRight(b4);
        b4.setParent(o);


        // 5th Level

        Node n5 = new Node('5');
        h.setLeft(n5);
        n5.setParent(h);

        Node n4 = new Node('4');
        h.setRight(n4);
        n4.setParent(h);

        Node b5 = new Node(' ');
        v.setLeft(b5);

        Node n3 = new Node('3');
        v.setRight(n3);
        n3.setParent(v);

        Node b6 = new Node(' ');
        f.setLeft(b6);
        b6.setParent(f);

        Node b7 = new Node(' ');
        f.setRight(b7);
        b7.setParent(f);

        Node b8 = new Node(' ');
        b1.setLeft(b8);
        b8.setParent(b1);

        Node n2 = new Node('2');
        b1.setRight(n2);
        n2.setParent(b1);

        Node b9 = new Node(' ');
        l.setLeft(b9);
        b9.setParent(l);

        Node b10 = new Node(' ');
        l.setRight(b10);
        b10.setParent(l);

        Node plus = new Node('+');
        b2.setLeft(plus);

        Node b11 = new Node(' ');
        b2.setRight(b11);
        b11.setParent(b2);

        Node b12 = new Node(' ');
        p.setLeft(b12);
        b12.setParent(p);

        Node b13 = new Node(' ');
        p.setRight(b13);
        b13.setParent(p);

        Node b14 = new Node(' ');
        j.setLeft(b14);
        b14.setParent(j);

        Node n1 = new Node('1');
        j.setRight(n1);
        n1.setParent(j);

        Node n6 = new Node('6');
        b.setLeft(n6);
        n6.setParent(b);

        Node equal = new Node('=');
        b.setRight(equal);
        equal.setParent(b);

        Node fs = new Node('/');
        x.setLeft(fs);
        fs.setParent(x);

        Node b15 = new Node(' ');
        x.setRight(b15);
        b15.setParent(x);

        Node b16 = new Node(' ');
        c.setLeft(b16);
        b16.setParent(c);

        Node b17 = new Node(' ');
        c.setRight(b17);
        b17.setParent(c);

        Node b18 = new Node(' ');
        y.setLeft(b18);
        b18.setParent(y);

        Node b19 = new Node(' ');
        y.setRight(b19);
        b19.setParent(y);

        Node n7 = new Node('7');
        z.setLeft(n7);
        n7.setParent(z);

        Node b20 = new Node(' ');
        z.setRight(b20);
        b20.setParent(z);

        Node b21 = new Node(' ');
        q.setLeft(b21);
        b21.setParent(q);

        Node b22 = new Node(' ');
        q.setRight(b22);
        b22.setParent(q);

        Node n8 = new Node('8');
        b3.setLeft(n8);
        n8.setParent(b3);

        Node b23 = new Node(' ');
        b3.setRight(b23);
        b23.setParent(b3);

        Node n9 = new Node('9');
        b4.setLeft(n9);
        n9.setParent(b4);

        Node n0 = new Node('0');
        b4.setRight(n0);
        n0.setParent(b4);
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

            Node parent;
              Node rightParent;
//            Node leftParent;
           StringBuilder morse = new StringBuilder();

            while (node.getParent() != null) {
                parent = node.getParent();
                rightParent = parent.getRight();
//                leftParent = parent.getLeft();

                if (rightParent == node) {
                    morse.append("-");

                } else {
                    morse.append(".");
                }

                node.setParent(parent);
            }

        String fraseInvertida = morse.reverse().toString();
        return fraseInvertida;
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

/*
 * NÃO É PERMITIDO MODIFICAR NADA NESTE ARQUIVO,
 * EXCETO PELO CONSTRUTOR E OS MÉTODOS INDICADOS.
 */
package br.pro.hashi.ensino.desagil.projeto1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Translator {
    private Node root;
    private HashMap<Character, Node> map;


    // Você deve mudar o recheio do construtor,
    // de acordo com os requisitos do projeto.
    public Translator() {

        map = new HashMap<>();

        root = new Node(' ');
        map.put(' ', root);

        // First Level
        Node e = new Node('e');
        root.setLeft(e);
        e.setParent(root);
        map.put('e', e);

        Node t = new Node('t');
        root.setRight(t);
        t.setParent(root);
        map.put('t', t);


        // 2nd Level
        Node i = new Node('i');
        e.setLeft(i);
        i.setParent(e);
        map.put('i', i);

        Node a = new Node('a');
        e.setRight(a);
        a.setParent(e);
        map.put('a', a);

        Node n = new Node('n');
        t.setLeft(n);
        n.setParent(t);
        map.put('n', n);

        Node m = new Node('m');
        t.setRight(m);
        m.setParent(t);
        map.put('m', m);

        // 3rd Level
        Node s = new Node('s');
        i.setLeft(s);
        s.setParent(i);
        map.put('s', s);

        Node u = new Node('u');
        i.setRight(u);
        u.setParent(i);
        map.put('u', u);

        Node r = new Node('r');
        a.setLeft(r);
        r.setParent(a);
        map.put('r', r);

        Node w = new Node('w');
        a.setRight(w);
        w.setParent(a);
        map.put('w', w);

        Node d = new Node('d');
        n.setLeft(d);
        d.setParent(n);
        map.put('d', d);

        Node k = new Node('k');
        n.setRight(k);
        k.setParent(n);
        map.put('k', k);

        Node g = new Node('g');
        m.setLeft(g);
        g.setParent(m);
        map.put('g', g);

        Node o = new Node('o');
        m.setRight(o);
        o.setParent(m);
        map.put('o', o);

        // 4th Level

        Node h = new Node('h');
        s.setLeft(h);
        h.setParent(s);
        map.put('h', h);

        Node v = new Node('v');
        s.setRight(v);
        v.setParent(s);
        map.put('v', v);

        Node f = new Node('f');
        u.setLeft(f);
        f.setParent(u);
        map.put('f', f);

        Node b1 = new Node(' ');
        u.setRight(b1);
        b1.setParent(u);
        map.put(' ', b1);

        Node l = new Node('l');
        r.setLeft(l);
        l.setParent(r);
        map.put('l', l);

        Node b2 = new Node(' ');
        r.setRight(b2);
        b2.setParent(r);
        map.put(' ', b2);

        Node p = new Node('p');
        w.setLeft(p);
        p.setParent(w);
        map.put('p', p);

        Node j = new Node('j');
        w.setRight(j);
        j.setParent(w);
        map.put('j', j);

        Node b = new Node('b');
        d.setLeft(b);
        b.setParent(d);
        map.put('b', b);

        Node x = new Node('x');
        d.setRight(x);
        x.setParent(d);
        map.put('x', x);

        Node c = new Node('c');
        k.setLeft(c);
        c.setParent(k);
        map.put('c', c);

        Node y = new Node('y');
        k.setRight(y);
        y.setParent(k);
        map.put('y', y);

        Node z = new Node('z');
        g.setLeft(z);
        z.setParent(g);
        map.put('z', z);

        Node q = new Node('q');
        g.setRight(q);
        q.setParent(g);
        map.put('q', q);

        Node b3 = new Node(' ');
        o.setLeft(b3);
        b3.setParent(o);
        map.put(' ', b3);

        Node b4 = new Node(' ');
        o.setRight(b4);
        b4.setParent(o);
        map.put(' ', b4);

        // 5th Level

        Node n5 = new Node('5');
        h.setLeft(n5);
        n5.setParent(h);
        map.put('5', n5);

        Node n4 = new Node('4');
        h.setRight(n4);
        n4.setParent(h);
        map.put('4', n4);

        Node b5 = new Node(' ');
        v.setLeft(b5);
        b5.setParent(v);
        map.put(' ', b5);

        Node n3 = new Node('3');
        v.setRight(n3);
        n3.setParent(v);
        map.put('3', n3);

        Node b6 = new Node(' ');
        f.setLeft(b6);
        b6.setParent(f);
        map.put(' ', b6);

        Node b7 = new Node(' ');
        f.setRight(b7);
        b7.setParent(f);
        map.put(' ', b7);

        Node b8 = new Node(' ');
        b1.setLeft(b8);
        b8.setParent(b1);
        map.put(' ', b8);

        Node n2 = new Node('2');
        b1.setRight(n2);
        n2.setParent(b1);
        map.put('2', n2);

        Node b9 = new Node(' ');
        l.setLeft(b9);
        b9.setParent(l);
        map.put(' ', b9);

        Node b10 = new Node(' ');
        l.setRight(b10);
        b10.setParent(l);
        map.put(' ', b10);

        Node plus = new Node('+');
        b2.setLeft(plus);
        plus.setParent(b2);
        map.put('+', plus);

        Node b11 = new Node(' ');
        b2.setRight(b11);
        b11.setParent(b2);
        map.put(' ', b11);

        Node b12 = new Node(' ');
        p.setLeft(b12);
        b12.setParent(p);
        map.put(' ', b12);

        Node b13 = new Node(' ');
        p.setRight(b13);
        b13.setParent(p);
        map.put(' ', b13);

        Node b14 = new Node(' ');
        j.setLeft(b14);
        b14.setParent(j);
        map.put(' ', b14);

        Node n1 = new Node('1');
        j.setRight(n1);
        n1.setParent(j);
        map.put('1', n1);

        Node n6 = new Node('6');
        b.setLeft(n6);
        n6.setParent(b);
        map.put('6', n6);

        Node equal = new Node('=');
        b.setRight(equal);
        equal.setParent(b);
        map.put('=', equal);

        Node fs = new Node('/');
        x.setLeft(fs);
        fs.setParent(x);
        map.put('/', fs);

        Node b15 = new Node(' ');
        x.setRight(b15);
        b15.setParent(x);
        map.put(' ', b15);

        Node b16 = new Node(' ');
        c.setLeft(b16);
        b16.setParent(c);
        map.put(' ', b16);

        Node b17 = new Node(' ');
        c.setRight(b17);
        b17.setParent(c);
        map.put(' ', b17);

        Node b18 = new Node(' ');
        y.setLeft(b18);
        b18.setParent(y);
        map.put(' ', b18);

        Node b19 = new Node(' ');
        y.setRight(b19);
        b19.setParent(y);
        map.put(' ', b19);

        Node n7 = new Node('7');
        z.setLeft(n7);
        n7.setParent(z);
        map.put('7', n7);

        Node b20 = new Node(' ');
        z.setRight(b20);
        b20.setParent(z);
        map.put(' ', b20);

        Node b21 = new Node(' ');
        q.setLeft(b21);
        b21.setParent(q);
        map.put(' ', b21);

        Node b22 = new Node(' ');
        q.setRight(b22);
        b22.setParent(q);
        map.put(' ', b22);

        Node n8 = new Node('8');
        b3.setLeft(n8);
        n8.setParent(b3);
        map.put('8', n8);

        Node b23 = new Node(' ');
        b3.setRight(b23);
        b23.setParent(b3);
        map.put(' ', b23);

        Node n9 = new Node('9');
        b4.setLeft(n9);
        n9.setParent(b4);
        map.put('9', n9);

        Node n0 = new Node('0');
        b4.setRight(n0);
        n0.setParent(b4);
        map.put('0', n0);
    }

    // Você deve mudar o recheio deste método,
    // de acordo com os requisitos do projeto.
    public char morseToChar(String code) {

        Node nod = root;

        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '.') {
                nod = nod.getLeft();
            } else {
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
        StringBuilder morse = new StringBuilder();

        while (node.getParent() != null) {
            parent = node.getParent();
            rightParent = parent.getRight();
            if (rightParent == node) {
                morse.append("-");
            } else {
                morse.append(".");
            }
            node = node.getParent();
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
        Queue<Node> queue = new LinkedList<>();
        LinkedList<String> lista = new LinkedList<>();

        root.setDistance(0);
        queue.add(root);

        while (!queue.isEmpty()) {
            Node node = queue.element();

            Node left = node.getLeft();
            Node right = node.getRight();


            int distance = node.getDistance();

            if (left != null) {
                left.setDistance(distance + 1);
                queue.add(left);
                if (left.getValue() != ' '){
                    lista.add(charToMorse(left));
                }
            }
            if (right != null) {
                right.setDistance(distance + 1);
                queue.add(right);
                if (right.getValue() != ' '){
                    lista.add(charToMorse(right));
                }
            }
            queue.remove();
//                System.out.println(distance + " " + node.getValue());
        }
        return lista;
    }
}

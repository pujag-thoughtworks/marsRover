package com.tw.puja;

/**
 * Created by pujag on 6/6/17.
 */
public enum Orientation {
    N, S, W,E;

    static  {
        N.left = W;
        S.left=E;
        E.left=N;
        W.left=S;
        N.right=E;
        S.right=W;
        E.right=S;
        W.right=N;

        }
    Orientation left;
    Orientation right;

    public static Orientation getCharEquivalent(char c) {
        switch(c) {
            case 'N':
                return Orientation.N;
            case 'S':
                return Orientation.S;
            case 'E' :
                return Orientation.E;
            case 'W' :
                return Orientation.W;
            default:
                break;
        }
        throw new IllegalArgumentException();
    }
    }


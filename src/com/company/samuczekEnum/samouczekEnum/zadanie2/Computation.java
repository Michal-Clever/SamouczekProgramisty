package com.company.samuczekEnum.samouczekEnum.zadanie2;

public enum Computation {
    MULTIPLICATION{
        public double performe (double x, double y) {
            return x * y;
        }
    },
    DIVIDE{
        public double performe (double x, double y) {
            return x / y;
        }
    },
    ADD{
        public double performe (double x, double y) {
            return x + y;
        }
    },
    SUBTRACTION{
        public double performe (double x, double y) {
            return x - y;
        }
    };
    public abstract double performe(double x, double y);


    public static void main(String[] args) {
        System.out.println("3 + 4 = " + Computation.ADD.performe(3,4));
        System.out.println("3 + 4 = " + Computation.DIVIDE.performe(3,4));
        System.out.println("3 + 4 = " + Computation.SUBTRACTION.performe(3,4));
        System.out.println("3 + 4 = " + Computation.MULTIPLICATION.performe(3,4));
    }

    }


package com.company.samuczekEnum.samouczekEnum;

public enum TshirtSize {
    S(0, 1, 2),
    M(3, 2, 1),
    L(4, 4, 4),
    XL(15, 24, 25),
    XXL(101, 202, 303);

    private int chestWidth;
    private int shirtLength;
    private int sleeveLength;

    TshirtSize(int chestWidth, int shirtLength, int sleeveLength) {
        this.chestWidth = chestWidth;
        this.shirtLength = shirtLength;
        this.sleeveLength = sleeveLength;
    }

    public int getChestWidth() {
        return chestWidth;
    }

    public int getShirtLength() {
        return shirtLength;
    }

    public int getSleeveLength() {
        return sleeveLength;
    }

    @Override
    public String toString() {
        return "TshirtSize{" +
                "chestWidth=" + chestWidth +
                ", shirtLength=" + shirtLength +
                ", sleeveLength=" + sleeveLength +
                '}';
    }
}

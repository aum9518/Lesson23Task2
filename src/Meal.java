public enum Meal {
    MANTY(300),
    PLOV(250),
    SUP(320),
    MASTAVA(180),
    LAGMAN(280),
    SHASHLYK(200);
    private int price;

    Meal(int price) {
        this.price = price;
    }

    Meal() {
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}

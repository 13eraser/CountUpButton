/*
 * Decompiled with CFR 0.152.
 */
public class MyData {
    private int num1 = 0;

    public String increment() {
        if (this.num1 < Integer.MAX_VALUE) {
            ++this.num1;
            String s = String.valueOf(this.num1);
            return s;
        }
        return "0";
    }
}

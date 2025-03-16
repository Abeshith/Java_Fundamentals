package com.SegmentTree;

public class SegmentTreeMain {
    public static void main(String[] args) {
        int[] arr = {3,8,7,6,-2,-8,4,9};
        SegmentTree st = new SegmentTree(arr);
        st.display();
        int query = st.query(2,6);
        System.out.println();
        System.out.println("Query Addition from 2-6 is " + query);
        st.update(6,8);
        System.out.println();
        System.out.println("After update");
        st.display();

        System.out.println();
        System.out.println(st.query(2,6));
    }
}

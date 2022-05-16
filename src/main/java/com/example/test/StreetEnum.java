package com.example.test;

public enum StreetEnum {
    USING(1), UNDER_CONSTRUCTION(0), UNDER_RENOVATION(-1);

    private int value;

    StreetEnum(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static StreetEnum of(int value){
        for (StreetEnum status:
                StreetEnum.values()
        ) {
            if (status.getValue() == value){
                return status;
            }
        }
        return StreetEnum.UNDER_RENOVATION;
    }
}
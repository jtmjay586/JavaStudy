package DesignPattern.HelloDesignPattern.src.DecoratorPattern;

public class StringDisplay extends Display{
    private final String string; //표시 문자열

    public StringDisplay(String string) { //constructor에서 표시문자열 지정
        this.string = string;
    }

    @Override
    public int getColumns() {//문자수
        return string.getBytes().length;
    }

    @Override
    public int getRows() {//행수는 1
        return 1;
    }

    @Override
    public String getRowText(int row) {//row가 0일때만 반환
        return (row == 0) ? string : null;
    }
}
package DesignPattern.HelloDesignPattern.src.VisitorPattern;

import java.util.Iterator;

public class ListVisitor extends Visitor{
    private String currentdir = ""; // 현재 주목하고 있는 디렉토리 이름 저장하는 필드

    @Override
    public void visit(File file) {
        System.out.println(currentdir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentdir + "/" + directory);
        String savedir = currentdir;
        currentdir = currentdir + "/" + directory.getName();
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.accept(this);
        }
        currentdir = savedir;
    }
}
package com.readyhuihui.designpatterndemo.behavior.factorymethod;

/**
 * @Author:lyh
 * @Description:创建型模式-工厂方法模式-测试类
 * @Date:Created in 2020/6/3 21:52
 */
public class Test {
    public static void main(String[] args) {

//        ExportHtmlFactory exportHtmlFactory = new ExportHtmlFactory();
//        ExportFile exportFile = exportHtmlFactory.factory("standard");
//        ExportPdfFactory exportPdfFactory = new ExportPdfFactory();
//        ExportFile exportFile = exportPdfFactory.factory("standard");
        ExportPdfFactory exportPdfFactory = new ExportPdfFactory();
        ExportFile exportFile = exportPdfFactory.factory("finanical");
        exportFile.export();
    }
}

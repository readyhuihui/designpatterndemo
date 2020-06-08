package com.readyhuihui.designpatterndemo.factorymethod;

/**
 * @Author:lyh
 * @Description:
 * @Date:Created in 2020/6/3 21:46
 */
public class ExportStandardHtmlFile implements  ExportFile {
    @Override
    public void export() {
        System.out.println("标准html");
    }
}

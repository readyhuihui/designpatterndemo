package com.readyhuihui.designpatterndemo.behavior.factorymethod;

/**
 * @Author:lyh
 * @Description:
 * @Date:Created in 2020/6/3 21:46
 */
public class ExportStandardPdfFile implements ExportFile {
    @Override
    public void export() {
        System.out.println("标准pdf");
    }
}

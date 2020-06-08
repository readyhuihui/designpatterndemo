package com.readyhuihui.designpatterndemo.factorymethod;

/**
 * @Author:lyh
 * @Description:PDF工厂
 * @Date:Created in 2020/6/3 21:44
 */
public class ExportPdfFactory implements ExportFactory {
    @Override
    public ExportFile factory(String strType) {

        if ("standard".equalsIgnoreCase(strType)) {
            return new ExportStandardPdfFile();
        } else {
            return new ExportFinanicalPdfFile();
        }
    }
}

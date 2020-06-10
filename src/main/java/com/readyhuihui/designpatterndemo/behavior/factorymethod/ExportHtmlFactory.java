package com.readyhuihui.designpatterndemo.behavior.factorymethod;

/**
 * @Author:lyh
 * @Description:HTML工厂
 * @Date:Created in 2020/6/3 21:44
 */
public class ExportHtmlFactory implements ExportFactory {
    @Override
    public ExportFile factory(String strType) {

        if ("standard".equalsIgnoreCase(strType)) {
            return new ExportStandardHtmlFile();
        } else {
            return new ExportFinanicalHtmlFile();
        }
    }
}

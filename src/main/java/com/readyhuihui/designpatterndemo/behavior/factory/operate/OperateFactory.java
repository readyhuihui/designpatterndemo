package com.readyhuihui.designpatterndemo.behavior.factory.operate;

/**
 * @Author:lyh
 * @Description:工厂类
 * @Date:Created in 2020/6/2 9:02
 */
public class OperateFactory {

    /**
     * 1.通过字符串参数创建实例
     *
     * @param operation
     * @return
     */
    public static Operation createOperation(String operation) {
        Operation oper = null;
        switch (operation) {

            case "+":
                oper = new OperationAdd();
                break;

            case "-":
                oper = new OperationSub();
                break;

            case "*":
                oper = new OperationMul();
                break;

            case "/":
                oper = new OperationDiv();
                break;
            default:
                throw new UnsupportedOperationException("不支持该操作");
        }
        return oper;
    }

    /**
     * 2，通过反射创建实例
     *
     * @param operation 参数完整类路径（com.xxxx*.类名）
     * @return
     * @throws Exception
     */
    public static Operation createOperationCls(String operation) throws Exception {
        Operation oper = null;
        if (null != operation) {
            Class<?> cls = Class.forName(operation);
            oper = (Operation) cls.newInstance();
        }
        return oper;
    }

    public static void main(String[] args) throws  Exception{
//        Operation operationAdd = OperateFactory.createOperation("+");
        Operation operationAdd = OperateFactory.createOperationCls("OperationAdd");
        operationAdd.setValue1(10);
        operationAdd.setValue2(5);

        System.out.println(operationAdd.getResule());
    }


}

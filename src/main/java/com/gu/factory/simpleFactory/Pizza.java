package com.gu.factory.simpleFactory;

/**
 * @author user
 * @date 2020/6/15 11:56
 */
public interface Pizza {

    /**
     * 准备食材
     */
    void prepare();

    /**
     * 烘烤
     */
    void bake();

    /**
     * 切片
     */
    void cut();

    /**
     * 包装
     */
    void box();
}

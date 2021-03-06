package org.dayatang.dddlib.event.api;

/**
 * 事件监听器。所有的实现类必须拥有默认无参构造函数
 * 事件总线在接收到一个领域事件时，先调用supports(event)方法判断当前监听器是否支持该事件，
 * 如果支持则调用onEvent()方法处理该事件
 * @author ericxin
 */
public interface EventListener<T extends Event> {

    /**
     * 处理事件
     * @param event 要处理的事件
     */
    void onEvent(T event);

}
